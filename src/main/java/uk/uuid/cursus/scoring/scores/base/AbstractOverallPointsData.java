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
import java.util.Map;

import uk.uuid.cursus.db.data.Pilot;
import uk.uuid.cursus.scoring.data.OverallPointsData;
import uk.uuid.cursus.scoring.data.ScoredData;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public abstract class AbstractOverallPointsData<T extends ScoredData> implements OverallPointsData {
	protected final T scores;
	protected final Supplier<Map<Pilot, Integer>> lazyOverallPoints = Suppliers.memoize(new Supplier<Map<Pilot, Integer>>() {
		@Override
		public Map<Pilot, Integer> get() {
			Map<Pilot, Integer> overallPoints = new HashMap<Pilot, Integer>(scores.getPilots().size() * 2);
			for (Pilot pilot : scores.getPilots()) {
				overallPoints.put(pilot, calculateOverallPoints(pilot));
			}
			return overallPoints;
		}
	});

	public AbstractOverallPointsData(T scores) {
		this.scores = scores;
	}

	@Override
	public final Map<Pilot, Integer> getOverallPoints() {
		return lazyOverallPoints.get();
	}

	@Override
	public final int getOverallPoints(Pilot pilot) {
		return lazyOverallPoints.get().get(pilot);
	}

	protected abstract int calculateOverallPoints(Pilot pilot);
}