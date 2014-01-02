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
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Ordering;
import com.google.common.collect.PeekingIterator;
import com.google.common.collect.Sets;
import com.google.common.collect.TreeMultimap;

import eu.lp0.cursus.db.data.Pilot;
import eu.lp0.cursus.db.data.Race;
import eu.lp0.cursus.scoring.data.OverallPointsData;
import eu.lp0.cursus.scoring.data.RaceDiscardsData;
import eu.lp0.cursus.scoring.data.RacePointsData;
import eu.lp0.cursus.scoring.data.ScoredData;
import eu.lp0.cursus.scoring.scores.base.AbstractOverallPositionData;
import eu.lp0.cursus.util.PilotRaceNumberComparator;

public class GenericOverallPositionData<T extends ScoredData & RacePointsData & RaceDiscardsData & OverallPointsData> extends AbstractOverallPositionData<T> {
	private final EqualPositioning equalPositioning;
	protected final PilotRacePlacingComparator.PlacingMethod placingMethod;
	private final boolean allSimulatedToEnd;

	public enum EqualPositioning {
		ALWAYS, IF_REQUIRED;
	}

	public GenericOverallPositionData(T scores, EqualPositioning equalPositioning, PilotRacePlacingComparator.PlacingMethod placingMethod) {
		this(scores, equalPositioning, placingMethod, false);
	}

	public GenericOverallPositionData(T scores, EqualPositioning equalPositioning, PilotRacePlacingComparator.PlacingMethod placingMethod,
			boolean allSimulatedToEnd) {
		super(scores);

		this.equalPositioning = equalPositioning;
		this.placingMethod = placingMethod;
		this.allSimulatedToEnd = allSimulatedToEnd;
	}

	@Override
	protected LinkedListMultimap<Integer, Pilot> calculateOverallPositionsWithOrder() {
		// Invert race points with ordered lists of pilots
		Comparator<Pilot> racePlacings = new PilotRacePlacingComparator<T>(scores, placingMethod);
		Comparator<Pilot> fallbackOrdering = new PilotRaceNumberComparator();
		TreeMultimap<Integer, Pilot> invOverallPoints = TreeMultimap.create(Ordering.natural(), Ordering.from(racePlacings).compound(fallbackOrdering));
		Multimaps.invertFrom(Multimaps.forMap(scores.getOverallPoints()), invOverallPoints);

		// Calculate overall positions
		LinkedListMultimap<Integer, Pilot> overallPositions = LinkedListMultimap.create();
		List<Pilot> collectedPilots = new ArrayList<Pilot>(scores.getPilots().size());
		LinkedList<SortedSet<Pilot>> pilotPointsOrdering = new LinkedList<SortedSet<Pilot>>();
		int position = 1;

		if (allSimulatedToEnd) {
			final Map<Pilot, ? extends Set<Race>> simulatedPilotPoints = scores.getSimulatedPilotPoints();
			Predicate<Pilot> allSimulatedPilot = new Predicate<Pilot>() {
				private final int raceCount = scores.getRaces().size();

				@Override
				public boolean apply(Pilot input) {
					return simulatedPilotPoints.get(input).size() == raceCount;
				}
			};

			for (Integer points : invOverallPoints.keySet()) {
				SortedSet<Pilot> pilots = Sets.filter(invOverallPoints.get(points), Predicates.not(allSimulatedPilot));
				if (!pilots.isEmpty()) {
					pilotPointsOrdering.add(pilots);
				}
			}
			for (Integer points : invOverallPoints.keySet()) {
				SortedSet<Pilot> pilots = Sets.filter(invOverallPoints.get(points), allSimulatedPilot);
				if (!pilots.isEmpty()) {
					pilotPointsOrdering.add(pilots);
				}
			}
		} else {
			for (Integer points : invOverallPoints.keySet()) {
				pilotPointsOrdering.add(invOverallPoints.get(points));
			}
		}

		for (SortedSet<Pilot> pilots : pilotPointsOrdering) {
			switch (equalPositioning) {
			case ALWAYS:
				// Always put pilots with the same points in the same position
				overallPositions.putAll(position, pilots);
				position += pilots.size();
				break;

			case IF_REQUIRED:
				// Try to put pilots with the same points in separate positions
				PeekingIterator<Pilot> it = Iterators.peekingIterator(pilots.iterator());
				while (it.hasNext()) {
					Pilot pilot = it.next();
					collectedPilots.add(pilot);

					// If this pilot compares equally with the next pilot, add them too
					while (it.hasNext() && racePlacings.compare(it.peek(), pilot) == 0) {
						collectedPilots.add(it.next());
					}

					// Sort them by an arbitrary order
					Collections.sort(collectedPilots, fallbackOrdering);

					// Add them all to this position
					overallPositions.putAll(position, collectedPilots);
					position += collectedPilots.size();

					collectedPilots.clear();
				}
				break;
			}
		}

		return overallPositions;
	}
}