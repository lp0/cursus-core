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
package eu.lp0.cursus.scoring.data;

import java.util.Map;
import java.util.Set;

import com.google.common.collect.Table;

import eu.lp0.cursus.db.data.Pilot;
import eu.lp0.cursus.db.data.Race;

public interface RacePointsData {
	public Table<Pilot, Race, Integer> getRacePoints();

	public int getRacePoints(Pilot pilot, Race race);

	public Map<Race, Integer> getRacePoints(Pilot pilot);

	public Map<Pilot, Integer> getRacePoints(Race race);

	public Map<Race, ? extends Set<Pilot>> getSimulatedRacePoints();

	public Map<Pilot, ? extends Set<Race>> getSimulatedPilotPoints();

	public boolean hasSimulatedRacePoints(Pilot pilot, Race race);

	public Set<Race> getSimulatedRacePoints(Pilot pilot);

	public Set<Pilot> getSimulatedRacePoints(Race race);

	public int getFleetSize(Race race);
}