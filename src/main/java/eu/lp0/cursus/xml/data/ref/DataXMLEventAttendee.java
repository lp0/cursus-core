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
package eu.lp0.cursus.xml.data.ref;

import eu.lp0.cursus.db.data.Pilot;
import eu.lp0.cursus.xml.common.AbstractXMLEntity;

public class DataXMLEventAttendee implements DataXMLPilotRef, Comparable<DataXMLEventAttendee> {
	public DataXMLEventAttendee() {
	}

	public DataXMLEventAttendee(Pilot pilot) {
		this.pilot = AbstractXMLEntity.generateId(pilot);
	}

	private String pilot;

	@Override
	public String getPilot() {
		return pilot;
	}

	public void setPilot(String pilot) {
		this.pilot = pilot;
	}

	@Override
	public int compareTo(DataXMLEventAttendee o) {
		return getPilot().compareTo(o.getPilot());
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof DataXMLEventAttendee)) {
			return false;
		}

		if (this == o) {
			return true;
		}

		return getPilot().equals(((DataXMLEventAttendee)o).getPilot());
	}

	@Override
	public int hashCode() {
		return getPilot().hashCode();
	}
}