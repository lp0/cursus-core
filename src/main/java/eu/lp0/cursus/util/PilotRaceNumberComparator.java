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
package eu.lp0.cursus.util;

import java.io.Serializable;
import java.util.Comparator;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;

import eu.lp0.cursus.db.data.Pilot;

public class PilotRaceNumberComparator implements Comparator<Pilot>, Serializable {
	public static final long serialVersionUID = 1;

	@Override
	public int compare(Pilot o1, Pilot o2) {
		return ComparisonChain.start().compare(o1.getRaceNumber(), o2.getRaceNumber(), Ordering.natural().nullsLast()).compare(o1.getName(), o2.getName())
				.compare(o1.getId(), o2.getId()).result();
	}
}