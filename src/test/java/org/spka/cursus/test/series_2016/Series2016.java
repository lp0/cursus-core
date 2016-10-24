/*
	cursus - Race series management program
	Copyright 2016  Simon Arlott

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
package org.spka.cursus.test.series_2016;

import static uk.uuid.cursus.db.data.RaceAttendee.Type.PILOT;
import static uk.uuid.cursus.db.data.Sex.FEMALE;
import static uk.uuid.cursus.db.data.Sex.MALE;

import org.spka.cursus.scoring.SPKAConstants;
import org.spka.cursus.test.AbstractSPKASeries;

@SuppressWarnings("nls")
public class Series2016 extends AbstractSPKASeries {
	public Series2016() {
		super("SPKA Race Series 2016/17", SPKAConstants.UUID_2012); //$NON-NLS-1$
	}

	protected static final int SERIES_FLEET = 9;
	protected static final int SERIES_FLEET_AT_EVENT1 = 9;

	@Override
	public void createAllData() throws Exception {
		createDatabase();
		createEvent1Races();
	}

	@Override
	public void createDatabase() throws Exception {
		super.createDatabase();

		addSeries();
		addPilot("SCO018@2010", MALE, "Scotland");
		addPilot("SCO045@2016", MALE, "Scotland");
		addPilot("SCO066@2013", MALE, "Scotland");
		addPilot("SCO087@2009", MALE, "Scotland");
		addPilot("SCO116@2010", MALE, "Scotland");
		addPilot("SCO159@2005", MALE, "Scotland");
		addPilot("SCO179@2005", MALE, "Scotland");
		addPilot("SCO296@2013", FEMALE, "Scotland");
		addPilot("SCO808@2010", MALE, "Scotland");

		addAlias("SCO116", "SCO001");
		addAlias("SCO808", "SCO056");
	}

	protected void createEvent1Races() throws Exception {
		addEvent(1, "Luce Bay (22/10/2016 and 23/10/2016)");

		addRace(1, 1, "Luce Bay (22/10/2016)");
		addAttendees(1, 1, PILOT, "SCO018", "SCO045", "SCO066", "SCO087", "SCO116", "SCO159", "SCO179", "SCO296", "SCO808");
		addLaps(1, 1, "1,179,56,159,66,87");
		addLaps(1, 1, "1,18,179,56,159,66");
		addLaps(1, 1, "1,18,179,56,87,159");
		addLaps(1, 1, "1,179,66,45,56");
		addLaps(1, 1, "1,159,87,179,66,56");
		addLaps(1, 1, "1,179,159,45,87");
		addLaps(1, 1, "1,66,179,56,159,87,45");

		addRace(1, 2, "Luce Bay (22/10/2016)");
		addAttendees(1, 2, PILOT, "SCO018", "SCO045", "SCO066", "SCO087", "SCO116", "SCO159", "SCO179", "SCO296", "SCO808");
		addLaps(1, 2, "1,56,179,159,66,87,18");
		addLaps(1, 2, "1,45,179,56,159,66,18");
		addLaps(1, 2, "1,87,179,56,159");
		addLaps(1, 2, "1,66,18,179,56,87,159,296");
		addLaps(1, 2, "1,45,18,66,179,56");
		addLaps(1, 2, "1,159,87,179,18");
		addLaps(1, 2, "1,56,159,66,179,87");
		addLaps(1, 2, "1,18,56,159,66,179,87");

		addRace(1, 3, "Luce Bay (22/10/2016)");
		addAttendees(1, 3, PILOT, "SCO018", "SCO045", "SCO066", "SCO087", "SCO116", "SCO159", "SCO179", "SCO296", "SCO808");
		addLaps(1, 3, "1,159,179,66,56,87,18,45");
		addLaps(1, 3, "1,179,159,66,56,18,87");
		addLaps(1, 3, "1,179,159,56,45");
		addLaps(1, 3, "1,66,159,87,66,56");
		addLaps(1, 3, "1,66,56,296,45,87");
		addLaps(1, 3, "1,66,56");
		addLaps(1, 3, "1,45,66,87,56,159");

		addRace(1, 4, "Luce Bay (23/10/2016)");
		addAttendees(1, 4, PILOT, "SCO018", "SCO045", "SCO066", "SCO087", "SCO116", "SCO159", "SCO179", "SCO296", "SCO808");
		addLaps(1, 4, "1,179,159,18,56,66");
		addLaps(1, 4, "1,179,45,159,56,87");
		addLaps(1, 4, "1,18,66,179,159,56");
		addLaps(1, 4, "1,18,45,66,179,87");
		addLaps(1, 4, "1,159,56,179");
		addLaps(1, 4, "1,66,45,159,56,87,179");
		addLaps(1, 4, "1,66,159,56,45,179,87");

		addRace(1, 5, "Luce Bay (23/10/2016)");
		addAttendees(1, 5, PILOT, "SCO018", "SCO045", "SCO066", "SCO087", "SCO116", "SCO159", "SCO179", "SCO296", "SCO808");
		addLaps(1, 5, "1,179,159,56,66,87,45");
		addLaps(1, 5, "1,296,179,56,159,66,87");
		addLaps(1, 5, "1,45,179,159");
		addLaps(1, 5, "1,56,66,87");
		addLaps(1, 5, "1,159,45,66,179,56");
		addLaps(1, 5, "1,87,159,66,179");
		addLaps(1, 5, "1,56,45,159,179,66,87");

		addRace(1, 6, "Luce Bay (23/10/2016)");
		addAttendees(1, 6, PILOT, "SCO018", "SCO045", "SCO066", "SCO087", "SCO116", "SCO159", "SCO179", "SCO296", "SCO808");
		addLaps(1, 6, "1,179,18,56,159,66");
		addLaps(1, 6, "1,87,45,179,296,18,56,159,66");
		addLaps(1, 6, "1,87,179,45");
		addLaps(1, 6, "1,56,159,66,18,179,296,87");
		addLaps(1, 6, "1,45,159,56,66,179,18");
		addLaps(1, 6, "1,87,296,179,56,66");
		addLaps(1, 6, "1,18,179,87,159,56");
		addLaps(1, 6, "1,296,66,18,45,179,159,56,87");
	}
}