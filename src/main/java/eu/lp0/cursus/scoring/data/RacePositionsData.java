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

import java.util.List;
import java.util.Map;

import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Table;

import eu.lp0.cursus.db.data.Pilot;
import eu.lp0.cursus.db.data.Race;

public interface RacePositionsData {
	public Table<Race, Pilot, Integer> getRacePositions();

	public Map<Pilot, Integer> getRacePositions(Race race);

	public Map<Race, ? extends LinkedListMultimap<Integer, Pilot>> getRacePositionsWithOrder();

	public LinkedListMultimap<Integer, Pilot> getRacePositionsWithOrder(Race race);

	public int getRacePosition(Pilot pilot, Race race);

	public Map<Race, ? extends List<Pilot>> getRaceOrders();

	public List<Pilot> getRaceOrder(Race race);

}