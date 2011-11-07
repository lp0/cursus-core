/*
	cursus - Race series management program
	Copyright 2011  Simon Arlott

	This program is free software: you can redistribute it and/or modify
	it under the terms of the GNU General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.

	This program is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU General Public License for more details.

	You should have received a copy of the GNU General Public License
	along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.spka.cursus.test.series_2010;

import org.spka.cursus.scoring.Scoring2010;

import eu.lp0.cursus.db.DatabaseSession;
import eu.lp0.cursus.db.data.Event;
import eu.lp0.cursus.db.data.Penalty;
import eu.lp0.cursus.db.data.Pilot;
import eu.lp0.cursus.db.data.Race;
import eu.lp0.cursus.db.data.RaceAttendee;
import eu.lp0.cursus.db.data.RaceEvent;
import eu.lp0.cursus.db.data.Series;
import eu.lp0.cursus.scoring.ScorerFactory;
import eu.lp0.cursus.test.AbstractDatabaseTest;

public abstract class AbstractSeries2010 extends AbstractDatabaseTest {
	protected final String SERIES_NAME = "SPKA Race Series 2010/11"; //$NON-NLS-1$
	protected final int SERIES_FLEET = 19;
	protected final int SERIES_FLEET_AT_EVENT1 = 17;
	protected final int SERIES_FLEET_AT_EVENT2 = 18;
	protected final String EVENT1_NAME = "Race Event 1"; //$NON-NLS-1$
	protected final int EVENT1_FLEET = 17;
	protected final String RACE1_NAME = "Race 1"; //$NON-NLS-1$
	protected final String RACE2_NAME = "Race 2"; //$NON-NLS-1$
	protected final String RACE3_NAME = "Race 3"; //$NON-NLS-1$
	protected final String EVENT2_NAME = "Race Event 2"; //$NON-NLS-1$
	protected final int EVENT2_FLEET = 15;
	protected final String RACE4_NAME = "Race 4"; //$NON-NLS-1$

	protected Scoring2010 scorer = (Scoring2010)ScorerFactory.getScorer(Scoring2010.UUID);

	protected Pilot sco018;
	protected Pilot sco019;
	protected Pilot sco042;
	protected Pilot sco060;
	protected Pilot sco068;
	protected Pilot sco081;
	protected Pilot sco087;
	protected Pilot sco116;
	protected Pilot sco136;
	protected Pilot sco153;
	protected Pilot sco156;
	protected Pilot sco158;
	protected Pilot sco159;
	protected Pilot sco179;
	protected Pilot sco197;
	protected Pilot sco200;
	protected Pilot sco248;
	protected Pilot sco249;
	protected Pilot sco808;

	private Series _series;
	private Event _event1;
	private Race _race1;
	private Race _race2;
	private Race _race3;
	private Event _event2;
	private Race _race4;

	protected void createSeriesData() throws Exception {
		if (_series != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			// Remove the default series
			for (Series series : seriesDAO.findAll()) {
				seriesDAO.remove(series);
			}

			// Create the 2010/11 series
			Series series = new Series(SERIES_NAME);

			// Add all the pilots
			sco018 = new Pilot(series, "SCO018"); //$NON-NLS-1$
			series.getPilots().add(sco018);

			sco019 = new Pilot(series, "SCO019"); //$NON-NLS-1$
			series.getPilots().add(sco019);

			sco042 = new Pilot(series, "SCO042"); //$NON-NLS-1$
			series.getPilots().add(sco042);

			sco060 = new Pilot(series, "SCO060"); //$NON-NLS-1$
			series.getPilots().add(sco060);

			sco068 = new Pilot(series, "SCO068"); //$NON-NLS-1$
			series.getPilots().add(sco068);

			sco081 = new Pilot(series, "SCO081"); //$NON-NLS-1$
			series.getPilots().add(sco081);

			sco087 = new Pilot(series, "SCO087"); //$NON-NLS-1$
			series.getPilots().add(sco087);

			sco116 = new Pilot(series, "SCO116"); //$NON-NLS-1$
			series.getPilots().add(sco116);

			sco136 = new Pilot(series, "SCO136"); //$NON-NLS-1$
			series.getPilots().add(sco136);

			sco153 = new Pilot(series, "SCO153"); //$NON-NLS-1$
			series.getPilots().add(sco153);

			sco156 = new Pilot(series, "SCO156"); //$NON-NLS-1$
			series.getPilots().add(sco156);

			sco158 = new Pilot(series, "SCO158"); //$NON-NLS-1$
			series.getPilots().add(sco158);

			sco159 = new Pilot(series, "SCO159"); //$NON-NLS-1$
			series.getPilots().add(sco159);

			sco179 = new Pilot(series, "SCO179"); //$NON-NLS-1$
			series.getPilots().add(sco179);

			sco197 = new Pilot(series, "SCO197"); //$NON-NLS-1$
			series.getPilots().add(sco197);

			sco200 = new Pilot(series, "SCO200"); //$NON-NLS-1$
			series.getPilots().add(sco200);

			sco248 = new Pilot(series, "SCO248"); //$NON-NLS-1$
			series.getPilots().add(sco248);

			sco249 = new Pilot(series, "SCO249"); //$NON-NLS-1$
			series.getPilots().add(sco249);

			sco808 = new Pilot(series, "SCO808"); //$NON-NLS-1$
			series.getPilots().add(sco808);

			// Save
			seriesDAO.persist(series);

			DatabaseSession.commit();

			_series = series;
		} finally {
			db.endSession();
		}
	}

	protected void createEvent1Data() throws Exception {
		createSeriesData();

		if (_event1 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);

			Event event1 = new Event(series, EVENT1_NAME);
			eventDAO.persist(event1);

			DatabaseSession.commit();

			_event1 = event1;
		} finally {
			db.endSession();
		}
	}

	protected void createEvent1Races() throws Exception {
		createRace1Data();
		createRace2Data();
		createRace3Data();
	}

	protected void createRace1Data() throws Exception {
		createEvent1Data();

		if (_race1 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event1 = eventDAO.find(series, EVENT1_NAME);

			Race race1 = new Race(event1, RACE1_NAME);
			race1.getAttendees().put(sco018, new RaceAttendee(race1, sco018, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco019, new RaceAttendee(race1, sco019, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco042, new RaceAttendee(race1, sco042, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco060, new RaceAttendee(race1, sco060, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco068, new RaceAttendee(race1, sco068, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco081, new RaceAttendee(race1, sco081, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco087, new RaceAttendee(race1, sco087, RaceAttendee.Type.M_RACE_MASTER));
			race1.getAttendees().put(sco116, new RaceAttendee(race1, sco116, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco153, new RaceAttendee(race1, sco153, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco156, new RaceAttendee(race1, sco156, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco159, new RaceAttendee(race1, sco159, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco179, new RaceAttendee(race1, sco179, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco197, new RaceAttendee(race1, sco197, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco200, new RaceAttendee(race1, sco200, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco248, new RaceAttendee(race1, sco248, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco249, new RaceAttendee(race1, sco249, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco808, new RaceAttendee(race1, sco808, RaceAttendee.Type.M_SCORER));
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.START));
			// 1
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco200)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco019)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco179)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco081)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco159)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco116)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco248)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco060)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco249)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco042)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco068)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco018)); //$NON-NLS-1$
			// 2
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco200)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco179)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco019)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco081)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco159)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco116)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco068)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco248)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco249)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco042)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco018)); //$NON-NLS-1$
			// 3
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco200)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco179)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco019)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco159)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco081)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco116)); //$NON-NLS-1$
			// 4
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco200)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco179)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco019)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco159)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco081)); //$NON-NLS-1$
			// 5
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco200)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco179)); //$NON-NLS-1$
			race1.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco019)); //$NON-NLS-1$
			raceDAO.persist(race1);

			DatabaseSession.commit();

			_race1 = race1;
		} finally {
			db.endSession();
		}
	}

	protected void createRace2Data() throws Exception {
		createEvent1Data();

		if (_race2 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event1 = eventDAO.find(series, EVENT1_NAME);

			Race race2 = new Race(event1, RACE2_NAME);
			race2.getAttendees().put(sco018, new RaceAttendee(race2, sco018, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco019, new RaceAttendee(race2, sco019, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco042, new RaceAttendee(race2, sco042, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco060, new RaceAttendee(race2, sco060, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco068, new RaceAttendee(race2, sco068, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco081, new RaceAttendee(race2, sco081, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco087, new RaceAttendee(race2, sco087, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco116, new RaceAttendee(race2, sco116, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco153, new RaceAttendee(race2, sco153, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco156, new RaceAttendee(race2, sco156, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco159, new RaceAttendee(race2, sco159, RaceAttendee.Type.M_SCORER));
			race2.getAttendees().put(sco179, new RaceAttendee(race2, sco179, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco197, new RaceAttendee(race2, sco197, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco200, new RaceAttendee(race2, sco200, RaceAttendee.Type.M_RACE_MASTER));
			race2.getAttendees().put(sco248, new RaceAttendee(race2, sco248, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco249, new RaceAttendee(race2, sco249, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco808, new RaceAttendee(race2, sco808, RaceAttendee.Type.PILOT));
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.START));
			// 1
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco019)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco808)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco116)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco081)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco060)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco018)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco249)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco248)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco179)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco068)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco042)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco153)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco197)); //$NON-NLS-1$
			// 2
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco019)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco808)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco116)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco068)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco179)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco081)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco248)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco018)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco249)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco060)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco042)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco197)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco153)); //$NON-NLS-1$
			// 3
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco019)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco808)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco068)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco116)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco179)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco081)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco248)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco249)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco018)); //$NON-NLS-1$
			// 4
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco019)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco808)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco068)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco179)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco116)); //$NON-NLS-1$
			// 5
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco808)); //$NON-NLS-1$
			race2.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco019)); //$NON-NLS-1$
			raceDAO.persist(race2);

			DatabaseSession.commit();

			_race2 = race2;
		} finally {
			db.endSession();
		}
	}

	protected void createRace3Data() throws Exception {
		createEvent1Data();

		if (_race3 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event1 = eventDAO.find(series, EVENT1_NAME);

			Race race3 = new Race(event1, RACE3_NAME);
			race3.getAttendees().put(sco018, new RaceAttendee(race3, sco018, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco019, new RaceAttendee(race3, sco019, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco042, new RaceAttendee(race3, sco042, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco060, new RaceAttendee(race3, sco060, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco068, new RaceAttendee(race3, sco068, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco081, new RaceAttendee(race3, sco081, RaceAttendee.Type.PILOT));
			RaceAttendee att087 = new RaceAttendee(race3, sco087, RaceAttendee.Type.PILOT);
			att087.getPenalties().add(new Penalty(Penalty.Type.AUTOMATIC));
			race3.getAttendees().put(sco087, att087);
			race3.getAttendees().put(sco116, new RaceAttendee(race3, sco116, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco153, new RaceAttendee(race3, sco153, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco156, new RaceAttendee(race3, sco156, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco159, new RaceAttendee(race3, sco159, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco179, new RaceAttendee(race3, sco179, RaceAttendee.Type.M_RACE_MASTER));
			race3.getAttendees().put(sco197, new RaceAttendee(race3, sco197, RaceAttendee.Type.M_SCORER));
			race3.getAttendees().put(sco200, new RaceAttendee(race3, sco200, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco248, new RaceAttendee(race3, sco248, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco249, new RaceAttendee(race3, sco249, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco808, new RaceAttendee(race3, sco808, RaceAttendee.Type.PILOT));
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.START));
			// 1
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco068)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco200)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco081)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco019)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco159)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco248)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco060)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco042)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco087)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco249)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco018)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco116)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco153)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco808)); //$NON-NLS-1$
			// 2
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco068)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco200)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco081)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco019)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco159)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco060)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco248)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco087)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco116)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco249)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco042)); //$NON-NLS-1$
			// 3
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco068)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco200)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco081)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco159)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco060)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco248)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco087)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco116)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco249)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco042)); //$NON-NLS-1$
			// 4
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco068)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco200)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco081)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco159)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco060)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco248)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco087)); //$NON-NLS-1$
			// 5
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco200)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco081)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco159)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco068)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco060)); //$NON-NLS-1$
			// 6
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco200)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco081)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco159)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco068)); //$NON-NLS-1$
			// 7
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco200)); //$NON-NLS-1$
			race3.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco081)); //$NON-NLS-1$
			raceDAO.persist(race3);

			DatabaseSession.commit();

			_race3 = race3;
		} finally {
			db.endSession();
		}
	}

	protected void createEvent2Data() throws Exception {
		createSeriesData();

		if (_event2 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);

			Event event2 = new Event(series, EVENT2_NAME);
			eventDAO.persist(event2);

			DatabaseSession.commit();

			_event2 = event2;
		} finally {
			db.endSession();
		}
	}

	protected void createEvent2Races() throws Exception {
		createRace4Data();
	}

	protected void createRace4Data() throws Exception {
		createEvent2Data();

		if (_race4 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event2 = eventDAO.find(series, EVENT2_NAME);

			Race race4 = new Race(event2, RACE4_NAME);
			race4.getAttendees().put(sco018, new RaceAttendee(race4, sco018, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco019, new RaceAttendee(race4, sco019, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco060, new RaceAttendee(race4, sco060, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco068, new RaceAttendee(race4, sco068, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco081, new RaceAttendee(race4, sco081, RaceAttendee.Type.M_RACE_MASTER));
			race4.getAttendees().put(sco087, new RaceAttendee(race4, sco087, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco116, new RaceAttendee(race4, sco116, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco153, new RaceAttendee(race4, sco153, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco158, new RaceAttendee(race4, sco158, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco159, new RaceAttendee(race4, sco159, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco179, new RaceAttendee(race4, sco179, RaceAttendee.Type.M_SCORER));
			race4.getAttendees().put(sco200, new RaceAttendee(race4, sco200, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco248, new RaceAttendee(race4, sco248, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco249, new RaceAttendee(race4, sco249, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco808, new RaceAttendee(race4, sco808, RaceAttendee.Type.PILOT));
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.START));
			// 1
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco159)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco200)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco068)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco019)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco248)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco018)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco060)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco249)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco116)); //$NON-NLS-1$
			// 2
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco200)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco159)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco158)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco068)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco087)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco248)); //$NON-NLS-1$
			// 3
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco200)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco159)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco018)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco068)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco019)); //$NON-NLS-1$
			// 4
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco200)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco116)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco159)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco068)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco248)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco060)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco158)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco087)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco249)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco018)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco019)); //$NON-NLS-1$
			// 5
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco200)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco159)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco068)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco248)); //$NON-NLS-1$
			// 6
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco200)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco019)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco159)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco068)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco158)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco018)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco060)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco087)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco116)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco248)); //$NON-NLS-1$
			race4.getEvents().add(new RaceEvent(RaceEvent.Type.LAP, "", sco249)); //$NON-NLS-1$
			raceDAO.persist(race4);

			DatabaseSession.commit();

			_race4 = race4;
		} finally {
			db.endSession();
		}
	}
}