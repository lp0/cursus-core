/*
	cursus - Race series management program
	Copyright 2014  Simon Arlott

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
package org.spka.cursus.test.series_2007;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import uk.uuid.cursus.db.DatabaseSession;
import uk.uuid.cursus.db.data.Event;
import uk.uuid.cursus.db.data.Race;
import uk.uuid.cursus.db.data.Series;
import uk.uuid.cursus.scoring.data.Scores;
import uk.uuid.cursus.test.util.OverallAssertUtil;
import uk.uuid.cursus.test.util.RaceAssertUtil;

import com.google.common.base.Predicates;

/**
 * Scores at the end of event 1
 */
public class Series2007Event1Scores extends Series2007 {
	@Override
	@Before
	public void createDatabase() throws Exception {
		super.createDatabase();
		createEvent1Races();
	}

	@Test
	public void checkSeries() throws Exception {
		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event1 = eventDAO.find(series, EVENT1_NAME);
			Scores scores = scorer.scoreSeries(series, getSeriesResultsPilots(series, event1), Predicates.in(getSeriesResultsPilots(series, event1)));
			checkSeriesAtEvent1(scores);

			DatabaseSession.commit();
		} finally {
			db.endSession();
		}
	}

	@Test
	public final void checkSeriesAtEvent1() throws Exception {
		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event1 = eventDAO.find(series, EVENT1_NAME);

			List<Race> races = new ArrayList<Race>();
			races.addAll(event1.getRaces());

			Scores scores = scorer.scoreRaces(races, getSeriesResultsPilots(series, event1), getSeriesResultsEvents(series, event1),
					Predicates.in(getSeriesResultsPilots(series, event1)));
			checkSeriesAtEvent1(scores);

			DatabaseSession.commit();
		} finally {
			db.endSession();
		}
	}

	private void checkSeriesAtEvent1(Scores scores) throws Exception {
		Series series = seriesDAO.find(SERIES_NAME);
		Event event1 = eventDAO.find(series, EVENT1_NAME);
		Race race1 = raceDAO.find(event1, RACE1_NAME);
		Race race2 = raceDAO.find(event1, RACE2_NAME);

		Assert.assertEquals(SERIES_FLEET_AT_EVENT1, scores.getPilots().size());

		RaceAssertUtil race1AssertUtil = new RaceAssertUtil(scores, race1);
		race1AssertUtil.assertPilot(sco154, 9, 0, false, 0, 1);
		race1AssertUtil.assertPilot(sco200, 8, 0, false, 2, 2);
		race1AssertUtil.assertPilot(sco159, 8, 0, false, 3, 3);
		race1AssertUtil.assertPilot(sco179, 7, 0, false, 4, 4);
		race1AssertUtil.assertPilot(sco136, 7, 0, false, 5, 5);
		race1AssertUtil.assertPilot(sco135, 7, 0, false, 6, 6);
		race1AssertUtil.assertPilot(sco197, 7, 0, false, 7, 7);
		race1AssertUtil.assertPilot(sco060, 6, 0, false, 8, 8);
		race1AssertUtil.assertPilot(sco143, 6, 0, false, 9, 9);
		race1AssertUtil.assertPilot(sco221, 6, 0, false, 10, 10);
		race1AssertUtil.assertPilot(sco081, 5, 0, false, 11, 11);
		race1AssertUtil.assertPilot(sco071, 5, 0, false, 12, 12);
		race1AssertUtil.assertPilot(sco019, 5, 0, false, 13, 13);
		race1AssertUtil.assertPilot(sco205, 5, 0, false, 14, 14);
		race1AssertUtil.assertPilot(sco169, 5, 0, false, 15, 15);
		race1AssertUtil.assertPilot(sco198, 4, 0, false, 16, 16);
		race1AssertUtil.assertPilot(sco158, 4, 0, false, 17, 17);
		race1AssertUtil.assertPilot(sco193, 1, 0, false, 18, 18);
		race1AssertUtil.assertPilot(sco023, 0, 0, false, 21, 19);
		race1AssertUtil.assertPilot(sco109, 0, 0, false, 21, 19);
		race1AssertUtil.assertDone(0);

		RaceAssertUtil race2AssertUtil = new RaceAssertUtil(scores, race2);
		race2AssertUtil.assertPilot(sco200, 7, 0, false, 0, 1);
		race2AssertUtil.assertPilot(sco081, 7, 0, false, 2, 2);
		race2AssertUtil.assertPilot(sco154, 7, 0, false, 3, 3);
		race2AssertUtil.assertPilot(sco135, 7, 0, false, 4, 4);
		race2AssertUtil.assertPilot(sco071, 7, 0, false, 5, 5);
		race2AssertUtil.assertPilot(sco136, 7, 0, false, 6, 6);
		race2AssertUtil.assertPilot(sco159, 7, 0, false, 7, 7);
		race2AssertUtil.assertPilot(sco158, 6, 0, false, 8, 8);
		race2AssertUtil.assertPilot(sco179, 6, 0, false, 9, 9);
		race2AssertUtil.assertPilot(sco109, 5, 0, false, 10, 10);
		race2AssertUtil.assertPilot(sco060, 5, 0, false, 11, 11);
		race2AssertUtil.assertPilot(sco197, 5, 0, false, 12, 12);
		race2AssertUtil.assertPilot(sco169, 5, 0, false, 13, 13);
		race2AssertUtil.assertPilot(sco198, 4, 0, false, 14, 14);
		race2AssertUtil.assertPilot(sco205, 4, 0, false, 15, 15);
		race2AssertUtil.assertPilot(sco193, 2, 0, false, 16, 16);
		race2AssertUtil.assertPilot(sco019, 0, 0, false, 21, 17);
		race2AssertUtil.assertPilot(sco023, 0, 0, false, 21, 17);
		race2AssertUtil.assertPilot(sco143, 0, 0, false, 21, 17);
		race2AssertUtil.assertPilot(sco221, 0, 0, false, 21, 17);
		race2AssertUtil.assertDone(0);

		OverallAssertUtil overallAssertUtil = new OverallAssertUtil(scores);
		overallAssertUtil.assertPilot(sco200, 0, 2, 1);
		overallAssertUtil.assertPilot(sco154, 0, 3, 2);
		overallAssertUtil.assertPilot(sco159, 0, 10, 3);
		overallAssertUtil.assertPilot(sco135, 0, 10, 4);
		overallAssertUtil.assertPilot(sco136, 0, 11, 5);
		overallAssertUtil.assertPilot(sco081, 0, 13, 6);
		overallAssertUtil.assertPilot(sco179, 0, 13, 7);
		overallAssertUtil.assertPilot(sco071, 0, 17, 8);
		overallAssertUtil.assertPilot(sco197, 0, 19, 9);
		overallAssertUtil.assertPilot(sco060, 0, 19, 10);
		overallAssertUtil.assertPilot(sco158, 0, 25, 11);
		overallAssertUtil.assertPilot(sco169, 0, 28, 12);
		overallAssertUtil.assertPilot(sco205, 0, 29, 13);
		overallAssertUtil.assertPilot(sco143, 0, 30, 14);
		overallAssertUtil.assertPilot(sco198, 0, 30, 15);
		overallAssertUtil.assertPilot(sco109, 0, 31, 16);
		overallAssertUtil.assertPilot(sco221, 0, 31, 16);
		overallAssertUtil.assertPilot(sco019, 0, 34, 18);
		overallAssertUtil.assertPilot(sco193, 0, 34, 19);
		overallAssertUtil.assertPilot(sco023, 0, 42, 20);
		overallAssertUtil.assertOrder();
	}

	@Test
	public final void checkEvent1() throws Exception {
		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event1 = eventDAO.find(series, EVENT1_NAME);
			Race race1 = raceDAO.find(event1, RACE1_NAME);
			Race race2 = raceDAO.find(event1, RACE2_NAME);

			Scores scores = scorer.scoreEvent(event1, Predicates.in(getEventResultsPilots(series, event1)));
			Assert.assertEquals(EVENT1_FLEET, scores.getPilots().size());
			Assert.assertEquals(RACE1_FLEET, scores.getFleetSize(race1));
			Assert.assertEquals(RACE2_FLEET, scores.getFleetSize(race2));

			RaceAssertUtil race1AssertUtil = new RaceAssertUtil(scores, race1);
			race1AssertUtil.assertPilot(sco154, 9, 0, false, 0, 1);
			race1AssertUtil.assertPilot(sco200, 8, 0, false, 2, 2);
			race1AssertUtil.assertPilot(sco159, 8, 0, false, 3, 3);
			race1AssertUtil.assertPilot(sco179, 7, 0, false, 4, 4);
			race1AssertUtil.assertPilot(sco136, 7, 0, false, 5, 5);
			race1AssertUtil.assertPilot(sco135, 7, 0, false, 6, 6);
			race1AssertUtil.assertPilot(sco197, 7, 0, false, 7, 7);
			race1AssertUtil.assertPilot(sco060, 6, 0, false, 8, 8);
			race1AssertUtil.assertPilot(sco143, 6, 0, false, 9, 9);
			race1AssertUtil.assertPilot(sco221, 6, 0, false, 10, 10);
			race1AssertUtil.assertPilot(sco081, 5, 0, false, 11, 11);
			race1AssertUtil.assertPilot(sco071, 5, 0, false, 12, 12);
			race1AssertUtil.assertPilot(sco019, 5, 0, false, 13, 13);
			race1AssertUtil.assertPilot(sco205, 5, 0, false, 14, 14);
			race1AssertUtil.assertPilot(sco169, 5, 0, false, 15, 15);
			race1AssertUtil.assertPilot(sco198, 4, 0, false, 16, 16);
			race1AssertUtil.assertPilot(sco158, 4, 0, false, 17, 17);
			race1AssertUtil.assertPilot(sco193, 1, 0, false, 18, 18);
			race1AssertUtil.assertPilot(sco023, 0, 0, false, 21, 19);
			race1AssertUtil.assertPilot(sco109, 0, 0, false, 21, 19);
			race1AssertUtil.assertDone(0);

			RaceAssertUtil race2AssertUtil = new RaceAssertUtil(scores, race2);
			race2AssertUtil.assertPilot(sco200, 7, 0, false, 0, 1);
			race2AssertUtil.assertPilot(sco081, 7, 0, false, 2, 2);
			race2AssertUtil.assertPilot(sco154, 7, 0, false, 3, 3);
			race2AssertUtil.assertPilot(sco135, 7, 0, false, 4, 4);
			race2AssertUtil.assertPilot(sco071, 7, 0, false, 5, 5);
			race2AssertUtil.assertPilot(sco136, 7, 0, false, 6, 6);
			race2AssertUtil.assertPilot(sco159, 7, 0, false, 7, 7);
			race2AssertUtil.assertPilot(sco158, 6, 0, false, 8, 8);
			race2AssertUtil.assertPilot(sco179, 6, 0, false, 9, 9);
			race2AssertUtil.assertPilot(sco109, 5, 0, false, 10, 10);
			race2AssertUtil.assertPilot(sco060, 5, 0, false, 11, 11);
			race2AssertUtil.assertPilot(sco197, 5, 0, false, 12, 12);
			race2AssertUtil.assertPilot(sco169, 5, 0, false, 13, 13);
			race2AssertUtil.assertPilot(sco198, 4, 0, false, 14, 14);
			race2AssertUtil.assertPilot(sco205, 4, 0, false, 15, 15);
			race2AssertUtil.assertPilot(sco193, 2, 0, false, 16, 16);
			race2AssertUtil.assertPilot(sco019, 0, 0, false, 21, 17);
			race2AssertUtil.assertPilot(sco023, 0, 0, false, 21, 17);
			race2AssertUtil.assertPilot(sco143, 0, 0, false, 21, 17);
			race2AssertUtil.assertPilot(sco221, 0, 0, false, 21, 17);
			race2AssertUtil.assertDone(0);

			OverallAssertUtil overallAssertUtil = new OverallAssertUtil(scores);
			overallAssertUtil.assertPilot(sco200, 0, 2, 1);
			overallAssertUtil.assertPilot(sco154, 0, 3, 2);
			overallAssertUtil.assertPilot(sco159, 0, 10, 3);
			overallAssertUtil.assertPilot(sco135, 0, 10, 4);
			overallAssertUtil.assertPilot(sco136, 0, 11, 5);
			overallAssertUtil.assertPilot(sco081, 0, 13, 6);
			overallAssertUtil.assertPilot(sco179, 0, 13, 7);
			overallAssertUtil.assertPilot(sco071, 0, 17, 8);
			overallAssertUtil.assertPilot(sco197, 0, 19, 9);
			overallAssertUtil.assertPilot(sco060, 0, 19, 10);
			overallAssertUtil.assertPilot(sco158, 0, 25, 11);
			overallAssertUtil.assertPilot(sco169, 0, 28, 12);
			overallAssertUtil.assertPilot(sco205, 0, 29, 13);
			overallAssertUtil.assertPilot(sco143, 0, 30, 14);
			overallAssertUtil.assertPilot(sco198, 0, 30, 15);
			overallAssertUtil.assertPilot(sco109, 0, 31, 16);
			overallAssertUtil.assertPilot(sco221, 0, 31, 16);
			overallAssertUtil.assertPilot(sco019, 0, 34, 18);
			overallAssertUtil.assertPilot(sco193, 0, 34, 19);
			overallAssertUtil.assertPilot(sco023, 0, 42, 20);
			overallAssertUtil.assertOrder();

			DatabaseSession.commit();
		} finally {
			db.endSession();
		}
	}

	@Test
	public final void checkRace1() throws Exception {
		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event1 = eventDAO.find(series, EVENT1_NAME);
			Race race1 = raceDAO.find(event1, RACE1_NAME);

			Scores scores = scorer.scoreRace(race1, Predicates.in(getEventResultsPilots(series, event1)));
			Assert.assertEquals(EVENT1_FLEET, scores.getPilots().size());
			Assert.assertEquals(RACE1_FLEET, scores.getFleetSize(race1));

			RaceAssertUtil raceAssertUtil = new RaceAssertUtil(scores, race1);
			raceAssertUtil.assertPilot(sco154, 9, 0, false, 0, 1);
			raceAssertUtil.assertPilot(sco200, 8, 0, false, 2, 2);
			raceAssertUtil.assertPilot(sco159, 8, 0, false, 3, 3);
			raceAssertUtil.assertPilot(sco179, 7, 0, false, 4, 4);
			raceAssertUtil.assertPilot(sco136, 7, 0, false, 5, 5);
			raceAssertUtil.assertPilot(sco135, 7, 0, false, 6, 6);
			raceAssertUtil.assertPilot(sco197, 7, 0, false, 7, 7);
			raceAssertUtil.assertPilot(sco060, 6, 0, false, 8, 8);
			raceAssertUtil.assertPilot(sco143, 6, 0, false, 9, 9);
			raceAssertUtil.assertPilot(sco221, 6, 0, false, 10, 10);
			raceAssertUtil.assertPilot(sco081, 5, 0, false, 11, 11);
			raceAssertUtil.assertPilot(sco071, 5, 0, false, 12, 12);
			raceAssertUtil.assertPilot(sco019, 5, 0, false, 13, 13);
			raceAssertUtil.assertPilot(sco205, 5, 0, false, 14, 14);
			raceAssertUtil.assertPilot(sco169, 5, 0, false, 15, 15);
			raceAssertUtil.assertPilot(sco198, 4, 0, false, 16, 16);
			raceAssertUtil.assertPilot(sco158, 4, 0, false, 17, 17);
			raceAssertUtil.assertPilot(sco193, 1, 0, false, 18, 18);
			raceAssertUtil.assertPilot(sco023, 0, 0, false, 21, 19);
			raceAssertUtil.assertPilot(sco109, 0, 0, false, 21, 19);
			raceAssertUtil.assertDone(0);

			OverallAssertUtil overallAssertUtil = new OverallAssertUtil(scores);
			overallAssertUtil.assertPilot(sco154, 0, 0, 1);
			overallAssertUtil.assertPilot(sco200, 0, 2, 2);
			overallAssertUtil.assertPilot(sco159, 0, 3, 3);
			overallAssertUtil.assertPilot(sco179, 0, 4, 4);
			overallAssertUtil.assertPilot(sco136, 0, 5, 5);
			overallAssertUtil.assertPilot(sco135, 0, 6, 6);
			overallAssertUtil.assertPilot(sco197, 0, 7, 7);
			overallAssertUtil.assertPilot(sco060, 0, 8, 8);
			overallAssertUtil.assertPilot(sco143, 0, 9, 9);
			overallAssertUtil.assertPilot(sco221, 0, 10, 10);
			overallAssertUtil.assertPilot(sco081, 0, 11, 11);
			overallAssertUtil.assertPilot(sco071, 0, 12, 12);
			overallAssertUtil.assertPilot(sco019, 0, 13, 13);
			overallAssertUtil.assertPilot(sco205, 0, 14, 14);
			overallAssertUtil.assertPilot(sco169, 0, 15, 15);
			overallAssertUtil.assertPilot(sco198, 0, 16, 16);
			overallAssertUtil.assertPilot(sco158, 0, 17, 17);
			overallAssertUtil.assertPilot(sco193, 0, 18, 18);
			overallAssertUtil.assertPilot(sco023, 0, 21, 19);
			overallAssertUtil.assertPilot(sco109, 0, 21, 19);
			overallAssertUtil.assertOrder();

			DatabaseSession.commit();
		} finally {
			db.endSession();
		}
	}

	@Test
	public final void checkRace2() throws Exception {
		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event1 = eventDAO.find(series, EVENT1_NAME);
			Race race2 = raceDAO.find(event1, RACE2_NAME);

			Scores scores = scorer.scoreRace(race2, Predicates.in(getEventResultsPilots(series, event1)));
			Assert.assertEquals(EVENT1_FLEET, scores.getPilots().size());
			Assert.assertEquals(RACE2_FLEET, scores.getFleetSize(race2));

			RaceAssertUtil raceAssertUtil = new RaceAssertUtil(scores, race2);
			raceAssertUtil.assertPilot(sco200, 7, 0, false, 0, 1);
			raceAssertUtil.assertPilot(sco081, 7, 0, false, 2, 2);
			raceAssertUtil.assertPilot(sco154, 7, 0, false, 3, 3);
			raceAssertUtil.assertPilot(sco135, 7, 0, false, 4, 4);
			raceAssertUtil.assertPilot(sco071, 7, 0, false, 5, 5);
			raceAssertUtil.assertPilot(sco136, 7, 0, false, 6, 6);
			raceAssertUtil.assertPilot(sco159, 7, 0, false, 7, 7);
			raceAssertUtil.assertPilot(sco158, 6, 0, false, 8, 8);
			raceAssertUtil.assertPilot(sco179, 6, 0, false, 9, 9);
			raceAssertUtil.assertPilot(sco109, 5, 0, false, 10, 10);
			raceAssertUtil.assertPilot(sco060, 5, 0, false, 11, 11);
			raceAssertUtil.assertPilot(sco197, 5, 0, false, 12, 12);
			raceAssertUtil.assertPilot(sco169, 5, 0, false, 13, 13);
			raceAssertUtil.assertPilot(sco198, 4, 0, false, 14, 14);
			raceAssertUtil.assertPilot(sco205, 4, 0, false, 15, 15);
			raceAssertUtil.assertPilot(sco193, 2, 0, false, 16, 16);
			raceAssertUtil.assertPilot(sco019, 0, 0, false, 21, 17);
			raceAssertUtil.assertPilot(sco023, 0, 0, false, 21, 17);
			raceAssertUtil.assertPilot(sco143, 0, 0, false, 21, 17);
			raceAssertUtil.assertPilot(sco221, 0, 0, false, 21, 17);
			raceAssertUtil.assertDone(0);

			OverallAssertUtil overallAssertUtil = new OverallAssertUtil(scores);
			overallAssertUtil.assertPilot(sco200, 0, 0, 1);
			overallAssertUtil.assertPilot(sco081, 0, 2, 2);
			overallAssertUtil.assertPilot(sco154, 0, 3, 3);
			overallAssertUtil.assertPilot(sco135, 0, 4, 4);
			overallAssertUtil.assertPilot(sco071, 0, 5, 5);
			overallAssertUtil.assertPilot(sco136, 0, 6, 6);
			overallAssertUtil.assertPilot(sco159, 0, 7, 7);
			overallAssertUtil.assertPilot(sco158, 0, 8, 8);
			overallAssertUtil.assertPilot(sco179, 0, 9, 9);
			overallAssertUtil.assertPilot(sco109, 0, 10, 10);
			overallAssertUtil.assertPilot(sco060, 0, 11, 11);
			overallAssertUtil.assertPilot(sco197, 0, 12, 12);
			overallAssertUtil.assertPilot(sco169, 0, 13, 13);
			overallAssertUtil.assertPilot(sco198, 0, 14, 14);
			overallAssertUtil.assertPilot(sco205, 0, 15, 15);
			overallAssertUtil.assertPilot(sco193, 0, 16, 16);
			overallAssertUtil.assertPilot(sco019, 0, 21, 17);
			overallAssertUtil.assertPilot(sco023, 0, 21, 17);
			overallAssertUtil.assertPilot(sco143, 0, 21, 17);
			overallAssertUtil.assertPilot(sco221, 0, 21, 17);
			overallAssertUtil.assertOrder();

			DatabaseSession.commit();
		} finally {
			db.endSession();
		}
	}
}