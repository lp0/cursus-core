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
package org.spka.cursus.test.series_2011;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import eu.lp0.cursus.db.DatabaseSession;
import eu.lp0.cursus.db.data.Event;
import eu.lp0.cursus.db.data.Series;

/**
 * Scores at the end of non-event 1 (01/10/2011 to 02/10/2011)
 */
public class Series2011NonEvent1Scores extends AbstractSeries2011 {
	@Before
	public void createData() throws Exception {
		createNonEvent1Data();
	}

	@Test
	public final void checkNonEvent1() throws Exception {
		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event nonEvent1 = eventDAO.find(series, NON_EVENT1_NAME);
			Assert.assertEquals(0, nonEvent1.getRaces().size());

			DatabaseSession.commit();
		} finally {
			db.endSession();
		}
	}
}