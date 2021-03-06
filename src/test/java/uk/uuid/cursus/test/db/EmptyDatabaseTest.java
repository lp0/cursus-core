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
package uk.uuid.cursus.test.db;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import uk.uuid.cursus.db.DatabaseSession;
import uk.uuid.cursus.db.data.Cursus;
import uk.uuid.cursus.db.data.Event;
import uk.uuid.cursus.db.data.Pilot;
import uk.uuid.cursus.db.data.Race;
import uk.uuid.cursus.db.data.Series;

public class EmptyDatabaseTest extends AbstractDatabaseTest {
	@Test
	public void defaultData() {
		db.startSession();
		try {
			DatabaseSession.begin();

			List<Cursus> cursus = cursusDAO.findAll();

			Assert.assertEquals(1, cursus.size());

			List<Series> series = seriesDAO.findAll();
			List<Event> events = eventDAO.findAll();
			List<Race> races = raceDAO.findAll();
			List<Pilot> pilots = pilotDAO.findAll();

			Assert.assertEquals(0, series.size());
			Assert.assertEquals(0, events.size());
			Assert.assertEquals(0, races.size());
			Assert.assertEquals(0, pilots.size());

			DatabaseSession.commit();
		} finally {
			db.endSession();
		}

		populateDefaultData();

		db.startSession();
		try {
			DatabaseSession.begin();

			List<Cursus> cursus = cursusDAO.findAll();

			Assert.assertEquals(1, cursus.size());

			List<Series> series = seriesDAO.findAll();
			List<Event> events = eventDAO.findAll();
			List<Race> races = raceDAO.findAll();

			Assert.assertEquals(1, series.size());
			Assert.assertEquals(1, events.size());
			Assert.assertEquals(1, races.size());

			Assert.assertSame(series.get(0), events.get(0).getSeries());
			Assert.assertSame(events.get(0), races.get(0).getEvent());

			Assert.assertEquals(1, series.get(0).getEvents().size());
			Assert.assertSame(events.get(0), series.get(0).getEvents().get(0));

			Assert.assertEquals(1, events.get(0).getRaces().size());
			Assert.assertSame(races.get(0), events.get(0).getRaces().get(0));

			Assert.assertEquals(DEFAULT_SERIES, series.get(0).getName());
			Assert.assertEquals(DEFAULT_EVENT, events.get(0).getName());
			Assert.assertEquals(DEFAULT_RACE, races.get(0).getName());

			List<Pilot> pilots = pilotDAO.findAll();

			Assert.assertEquals(0, pilots.size());
			Assert.assertEquals(0, series.get(0).getPilots().size());
			Assert.assertEquals(0, races.get(0).getAttendees().size());

			DatabaseSession.commit();
		} finally {
			db.endSession();
		}
	}
}