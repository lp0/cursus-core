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
package eu.lp0.cursus.scoring.scores.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import com.google.common.base.Predicates;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;

import eu.lp0.cursus.db.data.Pilot;
import eu.lp0.cursus.db.data.Race;
import eu.lp0.cursus.scoring.data.RacePointsData;
import eu.lp0.cursus.scoring.data.ScoredData;
import eu.lp0.cursus.scoring.scores.base.AbstractRaceDiscardsData;

public class GenericRaceDiscardsData<T extends ScoredData & RacePointsData> extends AbstractRaceDiscardsData<T> {
	public GenericRaceDiscardsData(T scores) {
		super(scores, 0);
	}

	public GenericRaceDiscardsData(T scores, DiscardCalculator discardCalculator) {
		super(scores, discardCalculator.getDiscardsFor(scores.getRaces()));
	}

	@Override
	protected List<Race> calculateDiscardedRaces(Pilot pilot) {
		if (discards > 0) {
			final Map<Race, Integer> racePoints = scores.getRacePoints(pilot);

			// Discard the highest scoring races
			return Lists.newArrayList(Iterables.limit(Ordering.from(new Comparator<Race>() {
				@Override
				public int compare(Race o1, Race o2) {
					return ComparisonChain.start().compare(racePoints.get(o2), racePoints.get(o1)).compare(o1, o2).result();
				}
				// Use all races where the score is not null
			}).sortedCopy(Maps.filterValues(racePoints, Predicates.notNull()).keySet()), discards));
		}

		return Collections.emptyList();
	}
}