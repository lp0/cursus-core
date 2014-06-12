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
package org.spka.cursus.test.series_2013;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.common.base.Predicates;

import eu.lp0.cursus.db.DatabaseSession;
import eu.lp0.cursus.db.data.Event;
import eu.lp0.cursus.db.data.Race;
import eu.lp0.cursus.db.data.Series;
import eu.lp0.cursus.scoring.data.Scores;
import eu.lp0.cursus.test.util.OverallAssertUtil;
import eu.lp0.cursus.test.util.RaceAssertUtil;

/**
 * Scores at the end of event 3 (04/01/2014)
 */
public class Series2013Event3Scores extends Series2013Event2Scores {
	@Override
	@Before
	public void createData() throws Exception {
		super.createData();
		createEvent3Races();
	}

	@Override
	@Test
	public void checkSeries() throws Exception {
		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event3 = eventDAO.find(series, EVENT3_NAME);
			Scores scores = scorer.scoreSeries(series, getSeriesResultsPilots(series, event3), Predicates.in(getSeriesResultsPilots(series, event3)));
			checkSeriesAtEvent3(scores);

			DatabaseSession.commit();
		} finally {
			db.endSession();
		}
	}

	@Test
	public final void checkSeriesAtEvent3() throws Exception {
		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event1 = eventDAO.find(series, EVENT1_NAME);
			Event event2 = eventDAO.find(series, EVENT2_NAME);
			Event event3 = eventDAO.find(series, EVENT3_NAME);

			List<Race> races = new ArrayList<Race>();
			races.addAll(event1.getRaces());
			races.addAll(event2.getRaces());
			races.addAll(event3.getRaces());

			Scores scores = scorer.scoreRaces(races, getSeriesResultsPilots(series, event3), getSeriesResultsEvents(series, event3),
					Predicates.in(getSeriesResultsPilots(series, event3)));
			checkSeriesAtEvent3(scores);

			DatabaseSession.commit();
		} finally {
			db.endSession();
		}
	}

	private void checkSeriesAtEvent3(Scores scores) throws Exception {
		Series series = seriesDAO.find(SERIES_NAME);
		Event event1 = eventDAO.find(series, EVENT1_NAME);
		Race race1 = raceDAO.find(event1, RACE1_NAME);
		Race race2 = raceDAO.find(event1, RACE2_NAME);
		Race race3 = raceDAO.find(event1, RACE3_NAME);
		Event event2 = eventDAO.find(series, EVENT2_NAME);
		Race race4 = raceDAO.find(event2, RACE4_NAME);
		Race race5 = raceDAO.find(event2, RACE5_NAME);
		Event event3 = eventDAO.find(series, EVENT3_NAME);
		Race race6 = raceDAO.find(event3, RACE6_NAME);

		Assert.assertEquals(SERIES_FLEET_AT_EVENT3, scores.getPilots().size());
		Assert.assertEquals(RACE1_PILOTS, scores.getFleetSize(race1));
		Assert.assertEquals(RACE2_PILOTS, scores.getFleetSize(race2));
		Assert.assertEquals(RACE3_PILOTS, scores.getFleetSize(race3));
		Assert.assertEquals(RACE4_PILOTS, scores.getFleetSize(race4));
		Assert.assertEquals(RACE5_PILOTS, scores.getFleetSize(race5));
		Assert.assertEquals(RACE6_PILOTS, scores.getFleetSize(race6));

		RaceAssertUtil race1AssertUtil = new RaceAssertUtil(scores, race1);
		race1AssertUtil.assertPilot(sco069, 8, 0, false, 0, 1);
		race1AssertUtil.assertPilot(sco116, 8, 0, false, 2, 2);
		race1AssertUtil.assertPilot(sco179, 8, 0, false, 3, 3);
		race1AssertUtil.assertPilot(sco159, 6, 0, false, 4, 4);
		race1AssertUtil.assertPilot(sco018, 6, 0, false, 5, 5);
		race1AssertUtil.assertPilot(sco808, 5, 0, false, 6, 6);
		race1AssertUtil.assertPilot(sco087, 4, 0, false, 7, 7);
		race1AssertUtil.assertPilot(sco156, 4, 0, false, 8, 8);
		race1AssertUtil.assertPilot(sco066, 3, 0, false, 9, 9);
		race1AssertUtil.assertPilot(sco296, 2, 0, false, 10, 10);
		race1AssertUtil.assertPilot(sco561, 2, 0, false, 11, 11);
		race1AssertUtil.assertPilot(sco117, 0, 0, false, 15, 12);
		race1AssertUtil.assertPilot(sco153, 0, 0, false, 15, 12);
		race1AssertUtil.assertPilot(sco666, 0, 0, false, 15, 12);
		race1AssertUtil.assertDone(0);

		RaceAssertUtil race2AssertUtil = new RaceAssertUtil(scores, race2);
		race2AssertUtil.assertPilot(sco069, 6, 0, false, 0, 1);
		race2AssertUtil.assertPilot(sco116, 5, 0, false, 2, 2);
		race2AssertUtil.assertPilot(sco159, 5, 0, false, 3, 3);
		race2AssertUtil.assertPilot(sco087, 5, 0, false, 4, 4);
		race2AssertUtil.assertPilot(sco018, 4, 0, false, 5, 5);
		race2AssertUtil.assertPilot(sco808, 4, 0, false, 6, 6);
		race2AssertUtil.assertPilot(sco156, 4, 0, false, 7, 7);
		race2AssertUtil.assertPilot(sco179, 3, 0, false, 8, 8);
		race2AssertUtil.assertPilot(sco066, 3, 0, false, 9, 9);
		race2AssertUtil.assertPilot(sco296, 1, 0, false, 10, 10);
		race2AssertUtil.assertPilot(sco561, 0, 0, false, 12, 11);
		race2AssertUtil.assertPilot(sco117, 0, 0, false, 15, 12);
		race2AssertUtil.assertPilot(sco153, 0, 0, false, 15, 12);
		race2AssertUtil.assertPilot(sco666, 0, 0, false, 15, 12);
		race2AssertUtil.assertDone(0);

		RaceAssertUtil race3AssertUtil = new RaceAssertUtil(scores, race3);
		race3AssertUtil.assertPilot(sco069, 8, 0, false, 0, 1);
		race3AssertUtil.assertPilot(sco808, 8, 0, false, 2, 2);
		race3AssertUtil.assertPilot(sco116, 8, 0, false, 3, 3);
		race3AssertUtil.assertPilot(sco179, 7, 0, false, 4, 4);
		race3AssertUtil.assertPilot(sco159, 6, 0, false, 5, 5);
		race3AssertUtil.assertPilot(sco087, 5, 0, false, 6, 6);
		race3AssertUtil.assertPilot(sco156, 4, 0, false, 7, 7);
		race3AssertUtil.assertPilot(sco066, 3, 0, false, 8, 8);
		race3AssertUtil.assertPilot(sco561, 1, 0, false, 9, 9);
		race3AssertUtil.assertPilot(sco018, 0, 0, false, 12, 10);
		race3AssertUtil.assertPilot(sco296, 0, 0, false, 12, 10);
		race3AssertUtil.assertPilot(sco117, 0, 0, false, 15, 12);
		race3AssertUtil.assertPilot(sco153, 0, 0, false, 15, 12);
		race3AssertUtil.assertPilot(sco666, 0, 0, false, 15, 12);
		race3AssertUtil.assertDone(0);

		RaceAssertUtil race4AssertUtil = new RaceAssertUtil(scores, race4);
		race4AssertUtil.assertPilot(sco116, 11, 0, false, 0, 1);
		race4AssertUtil.assertPilot(sco069, 11, 0, false, 2, 2);
		race4AssertUtil.assertPilot(sco159, 10, 0, false, 3, 3);
		race4AssertUtil.assertPilot(sco808, 10, 0, false, 4, 4);
		race4AssertUtil.assertPilot(sco156, 8, 0, false, 5, 5);
		race4AssertUtil.assertPilot(sco087, 8, 0, false, 6, 6);
		race4AssertUtil.assertPilot(sco117, 7, 0, false, 7, 7);
		race4AssertUtil.assertPilot(sco296, 5, 0, false, 8, 8);
		race4AssertUtil.assertPilot(sco066, 2, 0, false, 9, 9);
		race4AssertUtil.assertPilot(sco561, 0, 0, false, 11, 10);
		race4AssertUtil.assertPilot(sco018, 0, 0, false, 15, 11);
		race4AssertUtil.assertPilot(sco153, 0, 0, false, 15, 11);
		race4AssertUtil.assertPilot(sco179, 0, 0, false, 15, 11);
		race4AssertUtil.assertPilot(sco666, 0, 0, false, 15, 11);
		race4AssertUtil.assertDone(0);

		RaceAssertUtil race5AssertUtil = new RaceAssertUtil(scores, race5);
		race5AssertUtil.assertPilot(sco116, 9, 0, false, 0, 1);
		race5AssertUtil.assertPilot(sco069, 9, 0, false, 2, 2);
		race5AssertUtil.assertPilot(sco159, 8, 0, false, 3, 3);
		race5AssertUtil.assertPilot(sco087, 7, 0, false, 4, 4);
		race5AssertUtil.assertPilot(sco156, 7, 0, false, 5, 5);
		race5AssertUtil.assertPilot(sco117, 6, 0, false, 6, 6);
		race5AssertUtil.assertPilot(sco296, 4, 0, false, 7, 7);
		race5AssertUtil.assertPilot(sco808, 3, 0, false, 8, 8);
		race5AssertUtil.assertPilot(sco066, 3, 0, false, 9, 9);
		race5AssertUtil.assertPilot(sco561, 0, 0, false, 11, 10);
		race5AssertUtil.assertPilot(sco018, 0, 0, false, 15, 11);
		race5AssertUtil.assertPilot(sco153, 0, 0, false, 15, 11);
		race5AssertUtil.assertPilot(sco179, 0, 0, false, 15, 11);
		race5AssertUtil.assertPilot(sco666, 0, 0, false, 15, 11);
		race5AssertUtil.assertDone(0);

		RaceAssertUtil race6AssertUtil = new RaceAssertUtil(scores, race6);
		race6AssertUtil.assertPilot(sco069, 4, 0, false, 0, 1);
		race6AssertUtil.assertPilot(sco179, 3, 0, false, 2, 2);
		race6AssertUtil.assertPilot(sco159, 3, 0, false, 3, 3);
		race6AssertUtil.assertPilot(sco117, 2, 0, false, 4, 4);
		race6AssertUtil.assertPilot(sco018, 2, 0, false, 5, 5);
		race6AssertUtil.assertPilot(sco116, 2, 1, false, 6, 6);
		race6AssertUtil.assertPilot(sco808, 2, 0, false, 7, 7);
		race6AssertUtil.assertPilot(sco156, 1, 0, false, 8, 8);
		race6AssertUtil.assertPilot(sco666, 1, 0, false, 9, 9);
		race6AssertUtil.assertPilot(sco153, 0, 0, false, 12, 10);
		race6AssertUtil.assertPilot(sco296, 0, 0, false, 12, 10);
		race6AssertUtil.assertPilot(sco066, 0, 0, false, 15, 12);
		race6AssertUtil.assertPilot(sco087, 0, 0, false, 15, 12);
		race6AssertUtil.assertPilot(sco561, 0, 0, false, 15, 12);
		race6AssertUtil.assertDone(0);

		OverallAssertUtil overallAssertUtil = new OverallAssertUtil(scores);
		overallAssertUtil.assertPilot(sco069, 0, 2, 1, 2);
		overallAssertUtil.assertPilot(sco116, 1, 8, 2, 6);
		overallAssertUtil.assertPilot(sco159, 0, 16, 3, 5);
		overallAssertUtil.assertPilot(sco808, 0, 25, 4, 8);
		overallAssertUtil.assertPilot(sco087, 0, 27, 5, 15);
		overallAssertUtil.assertPilot(sco179, 0, 32, 6, 15);
		overallAssertUtil.assertPilot(sco156, 0, 32, 7, 8);
		overallAssertUtil.assertPilot(sco018, 0, 42, 8, 15);
		overallAssertUtil.assertPilot(sco066, 0, 44, 9, 15);
		overallAssertUtil.assertPilot(sco117, 0, 47, 10, 15);
		overallAssertUtil.assertPilot(sco296, 0, 47, 11, 12);
		overallAssertUtil.assertPilot(sco561, 0, 54, 12, 15);
		overallAssertUtil.assertPilot(sco666, 0, 69, 13, 15);
		overallAssertUtil.assertPilot(sco153, 0, 72, 14, 15);
		overallAssertUtil.assertOrder();
	}

	@Test
	public final void checkEvent3() throws Exception {
		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event3 = eventDAO.find(series, EVENT3_NAME);
			Race race6 = raceDAO.find(event3, RACE6_NAME);

			Scores scores = scorer.scoreEvent(event3, Predicates.in(getEventResultsPilots(series, event3)));
			Assert.assertEquals(EVENT3_FLEET, scores.getPilots().size());
			Assert.assertEquals(EVENT3_FLEET, scores.getFleetSize(race6));

			RaceAssertUtil race6AssertUtil = new RaceAssertUtil(scores, race6);
			race6AssertUtil.assertPilot(sco069, 4, 0, false, 0, 1);
			race6AssertUtil.assertPilot(sco179, 3, 0, false, 2, 2);
			race6AssertUtil.assertPilot(sco159, 3, 0, false, 3, 3);
			race6AssertUtil.assertPilot(sco117, 2, 0, false, 4, 4);
			race6AssertUtil.assertPilot(sco018, 2, 0, false, 5, 5);
			race6AssertUtil.assertPilot(sco116, 2, 1, false, 6, 6);
			race6AssertUtil.assertPilot(sco808, 2, 0, false, 7, 7);
			race6AssertUtil.assertPilot(sco156, 1, 0, false, 8, 8);
			race6AssertUtil.assertPilot(sco666, 1, 0, false, 9, 9);
			race6AssertUtil.assertPilot(sco153, 0, 0, false, 12, 10);
			race6AssertUtil.assertPilot(sco296, 0, 0, false, 12, 10);
			race6AssertUtil.assertDone(0);

			OverallAssertUtil overallAssertUtil = new OverallAssertUtil(scores);
			overallAssertUtil.assertPilot(sco069, 0, 0, 1);
			overallAssertUtil.assertPilot(sco179, 0, 2, 2);
			overallAssertUtil.assertPilot(sco159, 0, 3, 3);
			overallAssertUtil.assertPilot(sco117, 0, 4, 4);
			overallAssertUtil.assertPilot(sco018, 0, 5, 5);
			overallAssertUtil.assertPilot(sco116, 1, 7, 6);
			overallAssertUtil.assertPilot(sco808, 0, 7, 7);
			overallAssertUtil.assertPilot(sco156, 0, 8, 8);
			overallAssertUtil.assertPilot(sco666, 0, 9, 9);
			overallAssertUtil.assertPilot(sco153, 0, 12, 10);
			overallAssertUtil.assertPilot(sco296, 0, 12, 10);
			overallAssertUtil.assertOrder();

			DatabaseSession.commit();
		} finally {
			db.endSession();
		}
	}

	@Test
	public final void checkRace6() throws Exception {
		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event3 = eventDAO.find(series, EVENT3_NAME);
			Race race6 = raceDAO.find(event3, RACE6_NAME);

			Scores scores = scorer.scoreRace(race6, Predicates.in(getEventResultsPilots(series, event3)));
			Assert.assertEquals(EVENT3_FLEET, scores.getPilots().size());
			Assert.assertEquals(EVENT3_FLEET, scores.getFleetSize(race6));

			RaceAssertUtil raceAssertUtil = new RaceAssertUtil(scores, race6);
			raceAssertUtil.assertPilot(sco069, 4, 0, false, 0, 1);
			raceAssertUtil.assertPilot(sco179, 3, 0, false, 2, 2);
			raceAssertUtil.assertPilot(sco159, 3, 0, false, 3, 3);
			raceAssertUtil.assertPilot(sco117, 2, 0, false, 4, 4);
			raceAssertUtil.assertPilot(sco018, 2, 0, false, 5, 5);
			raceAssertUtil.assertPilot(sco116, 2, 1, false, 6, 6);
			raceAssertUtil.assertPilot(sco808, 2, 0, false, 7, 7);
			raceAssertUtil.assertPilot(sco156, 1, 0, false, 8, 8);
			raceAssertUtil.assertPilot(sco666, 1, 0, false, 9, 9);
			raceAssertUtil.assertPilot(sco153, 0, 0, false, 12, 10);
			raceAssertUtil.assertPilot(sco296, 0, 0, false, 12, 10);
			raceAssertUtil.assertDone(0);

			OverallAssertUtil overallAssertUtil = new OverallAssertUtil(scores);
			overallAssertUtil.assertPilot(sco069, 0, 0, 1);
			overallAssertUtil.assertPilot(sco179, 0, 2, 2);
			overallAssertUtil.assertPilot(sco159, 0, 3, 3);
			overallAssertUtil.assertPilot(sco117, 0, 4, 4);
			overallAssertUtil.assertPilot(sco018, 0, 5, 5);
			overallAssertUtil.assertPilot(sco116, 1, 7, 6);
			overallAssertUtil.assertPilot(sco808, 0, 7, 7);
			overallAssertUtil.assertPilot(sco156, 0, 8, 8);
			overallAssertUtil.assertPilot(sco666, 0, 9, 9);
			overallAssertUtil.assertPilot(sco153, 0, 12, 10);
			overallAssertUtil.assertPilot(sco296, 0, 12, 10);
			overallAssertUtil.assertOrder();

			DatabaseSession.commit();
		} finally {
			db.endSession();
		}
	}
}