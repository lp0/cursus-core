/*
	cursus - Race series management program
	Copyright 2012-2014  Simon Arlott

	This program is free software: you can redistribute it and/or modify
	it under the terms of the GNU Affero General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.

	This program is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU Affero General Public License for more details.

	You should have received a copy of the GNU Affero General Public License
	along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package eu.lp0.cursus.scoring.scores.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;
import com.google.common.collect.TreeMultimap;

import eu.lp0.cursus.db.data.Pilot;
import eu.lp0.cursus.db.data.Race;
import eu.lp0.cursus.scoring.data.RaceLapsData;
import eu.lp0.cursus.scoring.data.RacePenaltiesData;
import eu.lp0.cursus.scoring.data.RacePointsData;
import eu.lp0.cursus.scoring.data.ScoredData;
import eu.lp0.cursus.scoring.scores.base.AbstractRacePositionsData;
import eu.lp0.cursus.util.PilotRaceNumberComparator;

public class GenericRacePositionsData<T extends ScoredData & RaceLapsData & RacePointsData & RacePenaltiesData> extends AbstractRacePositionsData<T> {
	private final EqualPositioning equalPositioning;
	private final boolean simulatedToEnd;

	public enum EqualPositioning {
		ALWAYS, WITHOUT_LAPS, NEVER;
	}

	public GenericRacePositionsData(T scores, EqualPositioning equalPositioning) {
		this(scores, equalPositioning, false);
	}

	public GenericRacePositionsData(T scores, EqualPositioning equalPositioning, boolean simulatedToEnd) {
		super(scores);

		this.equalPositioning = equalPositioning;
		this.simulatedToEnd = simulatedToEnd;
	}

	@Override
	protected LinkedListMultimap<Integer, Pilot> calculateRacePositionsWithOrder(Race race) {
		// Create a lap order list containing all pilots
		List<Pilot> lapOrder = new ArrayList<Pilot>(scores.getPilots().size());
		lapOrder.addAll(scores.getLapOrder(race));
		Set<Pilot> pilotsWithLaps = ImmutableSet.copyOf(lapOrder);
		SortedSet<Pilot> pilotsWithoutLaps = new TreeSet<Pilot>(new PilotRaceNumberComparator());
		pilotsWithoutLaps.addAll(Sets.difference(scores.getPilots(), pilotsWithLaps));
		lapOrder.addAll(pilotsWithoutLaps);

		// Add penalties to race points
		Map<Pilot, Integer> racePoints = scores.getRacePoints(race);
		Map<Pilot, Integer> racePenalties = scores.getRacePenalties(race);
		Map<Pilot, Integer> racePointsWithPenalties = new HashMap<Pilot, Integer>(scores.getPilots().size() * 2);
		for (Pilot pilot : scores.getPilots()) {
			racePointsWithPenalties.put(pilot, racePoints.get(pilot) + racePenalties.get(pilot));
		}

		// Invert race points with ordered lists of pilots
		TreeMultimap<Integer, Pilot> invRacePoints = TreeMultimap.create(Ordering.natural(), Ordering.explicit(lapOrder));
		Multimaps.invertFrom(Multimaps.forMap(racePointsWithPenalties), invRacePoints);

		// Calculate race positions
		LinkedListMultimap<Integer, Pilot> racePositions = LinkedListMultimap.create();
		LinkedList<SortedSet<Pilot>> pilotPointsOrdering = new LinkedList<SortedSet<Pilot>>();
		int position = 1;

		if (simulatedToEnd) {
			Set<Pilot> simulatedRacePoints = scores.getSimulatedRacePoints(race);
			for (Integer points : invRacePoints.keySet()) {
				SortedSet<Pilot> pilots = Sets.filter(invRacePoints.get(points), Predicates.not(Predicates.in(simulatedRacePoints)));
				if (!pilots.isEmpty()) {
					pilotPointsOrdering.add(pilots);
				}
			}
			for (Integer points : invRacePoints.keySet()) {
				SortedSet<Pilot> pilots = Sets.filter(invRacePoints.get(points), Predicates.in(simulatedRacePoints));
				if (!pilots.isEmpty()) {
					pilotPointsOrdering.add(pilots);
				}
			}
		} else {
			for (Integer points : invRacePoints.keySet()) {
				pilotPointsOrdering.add(invRacePoints.get(points));
			}
		}

		for (SortedSet<Pilot> pilots : pilotPointsOrdering) {
			switch (equalPositioning) {
			case ALWAYS:
				// Always put pilots with the same points in the same position
				racePositions.putAll(position, pilots);
				position += pilots.size();
				break;

			case WITHOUT_LAPS:
				// Add everyone with laps (by removing pilots without laps from the set) in separate positions
				for (Pilot pilot : Sets.difference(pilots, pilotsWithoutLaps)) {
					racePositions.put(position, pilot);
					position++;
				}

				// Add everyone without laps (by removing pilots with laps from the set) in the same position
				Set<Pilot> pilots2 = Sets.difference(pilots, pilotsWithLaps);
				racePositions.putAll(position, pilots2);
				position += pilots2.size();
				break;

			case NEVER:
				// Always put pilots with the same points in separate positions
				for (Pilot pilot : pilots) {
					racePositions.put(position, pilot);
					position++;
				}
				break;
			}
		}

		return racePositions;
	}
}