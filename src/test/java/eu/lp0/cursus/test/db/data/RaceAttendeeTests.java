/*
	cursus - Race series management program
	Copyright 2011, 2013-2014  Simon Arlott

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
package eu.lp0.cursus.test.db.data;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import eu.lp0.cursus.db.DatabaseSession;
import eu.lp0.cursus.db.data.Pilot;
import eu.lp0.cursus.db.data.Race;
import eu.lp0.cursus.db.data.RaceAttendee;
import eu.lp0.cursus.test.db.AbstractDatabaseTest;

public class RaceAttendeeTests extends AbstractDatabaseTest {
	@Override
	@Before
	public void createDatabase() throws Exception {
		super.createDatabase();
		populateDefaultData();
	}

	@Test
	public void raceToPilotMapTypes() {
		// Save data
		db.startSession();
		try {
			DatabaseSession.begin();

			Race race = raceDAO.findAll().get(0);

			Pilot pilot1 = new Pilot(race.getEvent().getSeries(), "Test 1"); //$NON-NLS-1$
			pilotDAO.persist(pilot1);
			race.getAttendees().put(pilot1, new RaceAttendee(race, pilot1, RaceAttendee.Type.PILOT));

			Pilot pilot2 = new Pilot(race.getEvent().getSeries(), "Test 2"); //$NON-NLS-1$
			pilotDAO.persist(pilot2);
			race.getAttendees().put(pilot2, new RaceAttendee(race, pilot2, RaceAttendee.Type.PILOT));

			Pilot pilot3 = new Pilot(race.getEvent().getSeries(), "Test 3"); //$NON-NLS-1$
			pilotDAO.persist(pilot3);
			race.getAttendees().put(pilot3, new RaceAttendee(race, pilot3, RaceAttendee.Type.PILOT));

			raceDAO.persist(race);

			DatabaseSession.commit();
		} finally {
			db.endSession();
		}

		// Check data
		db.startSession();
		try {
			DatabaseSession.begin();

			Race race = raceDAO.findAll().get(0);

			Assert.assertEquals(3, race.getAttendees().size());
			for (Map.Entry<?, ?> entry : race.getAttendees().entrySet()) {
				Assert.assertEquals(Pilot.class, entry.getKey().getClass());
				Assert.assertEquals(RaceAttendee.class, entry.getValue().getClass());
			}

			DatabaseSession.commit();
		} finally {
			db.endSession();
		}
	}

	@Test
	public void pilotToRaceMapTypes() {
		// Save data
		db.startSession();
		try {
			DatabaseSession.begin();

			Race race = raceDAO.findAll().get(0);

			Pilot pilot1 = new Pilot(race.getEvent().getSeries(), "Test 1"); //$NON-NLS-1$
			pilotDAO.persist(pilot1);
			race.getAttendees().put(pilot1, new RaceAttendee(race, pilot1, RaceAttendee.Type.PILOT));

			Pilot pilot2 = new Pilot(race.getEvent().getSeries(), "Test 2"); //$NON-NLS-1$
			pilotDAO.persist(pilot2);
			race.getAttendees().put(pilot2, new RaceAttendee(race, pilot2, RaceAttendee.Type.PILOT));

			Pilot pilot3 = new Pilot(race.getEvent().getSeries(), "Test 3"); //$NON-NLS-1$
			pilotDAO.persist(pilot3);
			race.getAttendees().put(pilot3, new RaceAttendee(race, pilot3, RaceAttendee.Type.PILOT));

			raceDAO.persist(race);

			DatabaseSession.commit();
		} finally {
			db.endSession();
		}

		// Check data
		db.startSession();
		try {
			DatabaseSession.begin();

			List<Pilot> pilots = pilotDAO.findAll();

			Assert.assertEquals(3, pilots.size());
			for (Pilot pilot : pilots) {
				Assert.assertEquals(1, pilot.getRaces().size());
				for (Map.Entry<?, ?> entry : pilot.getRaces().entrySet()) {
					Assert.assertEquals(Race.class, entry.getKey().getClass());
					Assert.assertEquals(RaceAttendee.class, entry.getValue().getClass());
				}
			}

			DatabaseSession.commit();
		} finally {
			db.endSession();
		}
	}
}