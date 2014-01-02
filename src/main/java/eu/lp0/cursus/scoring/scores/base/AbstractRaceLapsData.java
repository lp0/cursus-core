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
package eu.lp0.cursus.scoring.scores.base;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ArrayTable;
import com.google.common.collect.Table;

import eu.lp0.cursus.db.data.Pilot;
import eu.lp0.cursus.db.data.Race;
import eu.lp0.cursus.scoring.data.RaceLapsData;
import eu.lp0.cursus.scoring.data.ScoredData;

public abstract class AbstractRaceLapsData<T extends ScoredData> implements RaceLapsData {
	protected final T scores;
	private volatile boolean initialised;
	private Table<Race, Pilot, Integer> raceLaps;
	private Map<Race, List<Pilot>> raceLapOrder;

	public AbstractRaceLapsData(T scores) {
		this.scores = scores;
	}

	private void lazyInitialisation() {
		if (!initialised) {
			synchronized (this) {
				if (!initialised) {
					calculateRaceLaps();
					initialised = true;
				}
			}
		}
	}

	private void calculateRaceLaps() {
		raceLaps = ArrayTable.create(scores.getRaces(), scores.getPilots());
		raceLapOrder = new HashMap<Race, List<Pilot>>(scores.getRaces().size() * 2);

		for (Race race : scores.getRaces()) {
			raceLapOrder.put(race, calculateRaceLapsInOrder(race, raceLaps.row(race)));
		}
	}

	@Override
	public final int getLaps(Pilot pilot, Race race) {
		lazyInitialisation();
		return raceLaps.get(race, pilot);
	}

	@Override
	public final Map<Race, Integer> getLaps(Pilot pilot) {
		lazyInitialisation();
		return raceLaps.column(pilot);
	}

	@Override
	public final Map<Pilot, Integer> getLaps(Race race) {
		lazyInitialisation();
		return raceLaps.row(race);
	}

	@Override
	public final List<Pilot> getLapOrder(Race race) {
		lazyInitialisation();
		return raceLapOrder.get(race);
	}

	protected abstract List<Pilot> calculateRaceLapsInOrder(Race race, Map<Pilot, Integer> laps);
}