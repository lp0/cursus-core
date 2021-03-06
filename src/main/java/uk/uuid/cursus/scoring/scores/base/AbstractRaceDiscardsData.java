/*
	cursus - Race series management program
	Copyright 2012, 2014  Simon Arlott

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
package uk.uuid.cursus.scoring.scores.base;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

import uk.uuid.cursus.db.data.Pilot;
import uk.uuid.cursus.db.data.Race;
import uk.uuid.cursus.scoring.data.RaceDiscardsData;
import uk.uuid.cursus.scoring.data.RacePointsData;
import uk.uuid.cursus.scoring.data.ScoredData;

import com.google.common.base.Functions;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.google.common.collect.Table;

public abstract class AbstractRaceDiscardsData<T extends ScoredData & RacePointsData> implements RaceDiscardsData {
	protected final T scores;
	protected final int discards;
	protected final Supplier<Map<Pilot, SortedSet<Race>>> lazyDiscardedRaces = Suppliers.memoize(new Supplier<Map<Pilot, SortedSet<Race>>>() {
		@Override
		public Map<Pilot, SortedSet<Race>> get() {
			Map<Pilot, SortedSet<Race>> discardedRaces = new HashMap<Pilot, SortedSet<Race>>(scores.getPilots().size() * 2);
			for (Pilot pilot : scores.getPilots()) {
				List<Race> discardedPilotRaces = calculateDiscardedRaces(pilot);
				discardedRaces.put(pilot, ImmutableSortedSet.copyOf(Ordering.explicit(discardedPilotRaces), discardedPilotRaces));
			}
			return discardedRaces;
		}
	});
	protected final Supplier<Map<Pilot, List<Integer>>> lazyRaceDiscards = Suppliers.memoize(new Supplier<Map<Pilot, List<Integer>>>() {
		@Override
		public Map<Pilot, List<Integer>> get() {
			Map<Pilot, List<Integer>> pilotDiscards = new HashMap<Pilot, List<Integer>>(scores.getPilots().size() * 2);
			Map<Pilot, SortedSet<Race>> discardedRaces = lazyDiscardedRaces.get();
			Table<Pilot, Race, Integer> racePoints = scores.getRacePoints();
			for (Pilot pilot : scores.getPilots()) {
				pilotDiscards.put(pilot, Lists.newArrayList(Iterables.transform(discardedRaces.get(pilot), Functions.forMap(racePoints.row(pilot), 0))));
			}
			return pilotDiscards;
		}
	});

	public AbstractRaceDiscardsData(T scores, int discards) {
		Preconditions.checkArgument(discards >= 0);

		this.scores = scores;
		this.discards = discards;
	}

	@Override
	public final Map<Pilot, ? extends List<Integer>> getRaceDiscards() {
		return lazyRaceDiscards.get();
	}

	@Override
	public final List<Integer> getRaceDiscards(Pilot pilot) {
		return lazyRaceDiscards.get().get(pilot);
	}

	@Override
	public final int getRaceDiscard(Pilot pilot, int discard) {
		Preconditions.checkArgument(discard > 0);
		Preconditions.checkElementIndex(discard - 1, discards);
		return lazyRaceDiscards.get().get(pilot).get(discard - 1);
	}

	@Override
	public final Map<Pilot, ? extends SortedSet<Race>> getDiscardedRaces() {
		return lazyDiscardedRaces.get();
	}

	@Override
	public final SortedSet<Race> getDiscardedRaces(Pilot pilot) {
		return lazyDiscardedRaces.get().get(pilot);
	}

	@Override
	public final int getDiscardCount() {
		return discards;
	}

	protected abstract List<Race> calculateDiscardedRaces(Pilot pilot);
}