/*
	cursus - Race series management program
	Copyright 2011, 2014  Simon Arlott

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
package uk.uuid.cursus.test.db.data;

import org.junit.Assert;
import org.junit.Test;

import uk.uuid.cursus.db.DatabaseSession;
import uk.uuid.cursus.db.data.Event;
import uk.uuid.cursus.db.data.Race;
import uk.uuid.cursus.db.data.Series;
import uk.uuid.cursus.test.db.AbstractDatabaseTest;

public class RaceMoves extends AbstractDatabaseTest {
	@Test
	public void raceSwap() {
		// Save data
		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = new Series("Test 1"); //$NON-NLS-1$
			Event event = new Event(series, "Test 1"); //$NON-NLS-1$
			series.getEvents().add(event);
			Race race1 = new Race(event, "Test 1"); //$NON-NLS-1$
			event.getRaces().add(race1);
			Race race2 = new Race(event, "Test 2"); //$NON-NLS-1$
			event.getRaces().add(race2);
			seriesDAO.persist(series);

			DatabaseSession.commit();
		} finally {
			db.endSession();
		}

		// Check data
		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find("Test 1"); //$NON-NLS-1$
			Event event = eventDAO.find(series, "Test 1"); //$NON-NLS-1$
			Race race1 = raceDAO.find(event, "Test 1"); //$NON-NLS-1$
			Race race2 = raceDAO.find(event, "Test 2"); //$NON-NLS-1$
			Assert.assertArrayEquals(new Object[] { race1, race2 }, event.getRaces().toArray());

			DatabaseSession.commit();
		} finally {
			db.endSession();
		}

		// Modify data
		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find("Test 1"); //$NON-NLS-1$
			Event event = eventDAO.find(series, "Test 1"); //$NON-NLS-1$
			Race race1 = event.getRaces().get(0);
			Race race2 = event.getRaces().get(1);
			event.getRaces().set(0, race2);
			event.getRaces().set(1, race1);
			eventDAO.persist(event);

			DatabaseSession.commit();
		} finally {
			db.endSession();
		}

		// Check data
		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find("Test 1"); //$NON-NLS-1$
			Event event = eventDAO.find(series, "Test 1"); //$NON-NLS-1$
			Race race1 = raceDAO.find(event, "Test 1"); //$NON-NLS-1$
			Race race2 = raceDAO.find(event, "Test 2"); //$NON-NLS-1$
			Assert.assertArrayEquals(new Object[] { race2, race1 }, event.getRaces().toArray());

			DatabaseSession.commit();
		} finally {
			db.endSession();
		}
	}

	@Test
	public void eventMove() {
		// Save data
		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = new Series("Test 1"); //$NON-NLS-1$
			Event event1 = new Event(series, "Test 1"); //$NON-NLS-1$
			series.getEvents().add(event1);
			Race race1 = new Race(event1, "Test 1"); //$NON-NLS-1$
			event1.getRaces().add(race1);
			Event event2 = new Event(series, "Test 2"); //$NON-NLS-1$
			series.getEvents().add(event2);
			seriesDAO.persist(series);

			DatabaseSession.commit();
		} finally {
			db.endSession();
		}

		// Check data
		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find("Test 1"); //$NON-NLS-1$
			Event event1 = eventDAO.find(series, "Test 1"); //$NON-NLS-1$
			Event event2 = eventDAO.find(series, "Test 2"); //$NON-NLS-1$
			Race race1 = raceDAO.find(event1, "Test 1"); //$NON-NLS-1$
			Assert.assertArrayEquals(new Object[] { race1 }, event1.getRaces().toArray());
			Assert.assertArrayEquals(new Object[] {}, event2.getRaces().toArray());

			DatabaseSession.commit();
		} finally {
			db.endSession();
		}

		// Modify data
		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find("Test 1"); //$NON-NLS-1$
			Event event1 = eventDAO.find(series, "Test 1"); //$NON-NLS-1$
			Event event2 = eventDAO.find(series, "Test 2"); //$NON-NLS-1$
			Race race1 = event1.getRaces().get(0);
			event1.getRaces().remove(race1);
			race1.setEvent(event2);
			event2.getRaces().add(race1);

			DatabaseSession.commit();
		} finally {
			db.endSession();
		}

		// Check data
		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find("Test 1"); //$NON-NLS-1$
			Event event1 = eventDAO.find(series, "Test 1"); //$NON-NLS-1$
			Event event2 = eventDAO.find(series, "Test 2"); //$NON-NLS-1$
			Race race1 = raceDAO.find(event2, "Test 1"); //$NON-NLS-1$
			Assert.assertArrayEquals(new Object[] {}, event1.getRaces().toArray());
			Assert.assertArrayEquals(new Object[] { race1 }, event2.getRaces().toArray());

			DatabaseSession.commit();
		} finally {
			db.endSession();
		}
	}
}