/*
	cursus - Race series management program
	Copyright 2011-2014  Simon Arlott

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

import org.spka.cursus.scoring.SPKAConstants;
import org.spka.cursus.test.AbstractSPKASeries;

import uk.uuid.cursus.db.DatabaseSession;
import uk.uuid.cursus.db.data.Class;
import uk.uuid.cursus.db.data.Event;
import uk.uuid.cursus.db.data.Penalty;
import uk.uuid.cursus.db.data.Pilot;
import uk.uuid.cursus.db.data.Race;
import uk.uuid.cursus.db.data.RaceAttendee;
import uk.uuid.cursus.db.data.RaceTally;
import uk.uuid.cursus.db.data.Series;
import uk.uuid.cursus.db.data.Sex;

public class Series2011 extends AbstractSPKASeries {
	public Series2011() {
		super("SPKA Race Series 2011/12", SPKAConstants.UUID_2011); //$NON-NLS-1$
	}

	protected static final int SERIES_FLEET = 25;
	protected static final int SERIES_FLEET_AT_NON_EVENT1 = 23;
	protected static final int SERIES_FLEET_AT_EVENT1 = 23;
	protected static final int SERIES_FLEET_AT_NON_EVENT2 = 23;
	protected static final int SERIES_FLEET_AT_EVENT2 = 23;
	protected static final int SERIES_FLEET_AT_NON_EVENT3 = 23;
	protected static final int SERIES_FLEET_AT_EVENT3 = 23;
	protected static final int SERIES_FLEET_AT_EVENT4 = 25;
	protected static final int SERIES_FLEET_AT_EVENT5 = 25;

	protected static final String NON_EVENT1_NAME = "Non-Event 1"; //$NON-NLS-1$
	protected static final String NON_EVENT1_DESC = "Fraserburgh Esplanade (01/10/2011 and 02/10/2011)"; //$NON-NLS-1$

	protected static final String EVENT1_NAME = "Race Event 1"; //$NON-NLS-1$
	protected static final String EVENT1_DESC = "West Sands (29/10/2011 and 30/10/2011)"; //$NON-NLS-1$
	protected static final int EVENT1_FLEET = 22;
	protected static final String RACE1_NAME = "Race 1"; //$NON-NLS-1$
	protected static final String RACE1_DESC = "West Sands (30/10/2011)"; //$NON-NLS-1$
	protected static final int RACE1_PILOTS = 22;

	protected static final String NON_EVENT2_NAME = "Non-Event 2"; //$NON-NLS-1$
	protected static final String NON_EVENT2_DESC = "Luce Bay (03/12/2011 and 04/12/2011)"; //$NON-NLS-1$

	protected static final String EVENT2_NAME = "Race Event 2"; //$NON-NLS-1$
	protected static final String EVENT2_DESC = "West Sands (28/01/2012 and 29/01/2012)"; //$NON-NLS-1$
	protected static final int EVENT2_FLEET = 20;
	protected static final String RACE2_NAME = "Race 2"; //$NON-NLS-1$
	protected static final String RACE2_DESC = "West Sands (29/01/2012)"; //$NON-NLS-1$
	protected static final int RACE2_PILOTS = 20;
	protected static final String RACE3_NAME = "Race 3"; //$NON-NLS-1$
	protected static final String RACE3_DESC = "West Sands (29/01/2012)"; //$NON-NLS-1$
	protected static final int RACE3_PILOTS = 20;
	protected static final String RACE4_NAME = "Race 4"; //$NON-NLS-1$
	protected static final String RACE4_DESC = "West Sands (29/01/2012)"; //$NON-NLS-1$
	protected static final int RACE4_PILOTS = 20;

	protected static final String NON_EVENT3_NAME = "Non-Event 3"; //$NON-NLS-1$
	protected static final String NON_EVENT3_DESC = "Fraserburgh Esplanade (03/03/2012 and 04/03/2012)"; //$NON-NLS-1$

	protected static final String EVENT3_NAME = "Race Event 3"; //$NON-NLS-1$
	protected static final String EVENT3_DESC = "Luce Bay (31/03/2012 and 01/04/2012)"; //$NON-NLS-1$
	protected static final int EVENT3_FLEET = 19;
	protected static final String RACE5_NAME = "Race 5"; //$NON-NLS-1$
	protected static final String RACE5_DESC = "Luce Bay (31/03/2012)"; //$NON-NLS-1$
	protected static final int RACE5_PILOTS = 18;
	protected static final String RACE6_NAME = "Race 6"; //$NON-NLS-1$
	protected static final String RACE6_DESC = "Luce Bay (31/03/2012)"; //$NON-NLS-1$
	protected static final int RACE6_PILOTS = 18;
	protected static final String RACE7_NAME = "Race 7"; //$NON-NLS-1$
	protected static final String RACE7_DESC = "Luce Bay (31/03/2012)"; //$NON-NLS-1$
	protected static final int RACE7_PILOTS = 18;
	protected static final String RACE8_NAME = "Race 8"; //$NON-NLS-1$
	protected static final String RACE8_DESC = "Luce Bay (01/04/2012)"; //$NON-NLS-1$
	protected static final int RACE8_PILOTS = 18;
	protected static final String RACE9_NAME = "Race 9"; //$NON-NLS-1$
	protected static final String RACE9_DESC = "Luce Bay (01/04/2012)"; //$NON-NLS-1$
	protected static final int RACE9_PILOTS = 18;

	protected static final String EVENT4_NAME = "Race Event 4"; //$NON-NLS-1$
	protected static final String EVENT4_DESC = "West Sands (28/04/2012 and 29/04/2012)"; //$NON-NLS-1$
	protected static final int EVENT4_FLEET = 20;
	protected static final String RACE10_NAME = "Race 10"; //$NON-NLS-1$
	protected static final String RACE10_DESC = "West Sands (28/04/2012)"; //$NON-NLS-1$
	protected static final int RACE10_PILOTS = 20;
	protected static final String RACE11_NAME = "Race 11"; //$NON-NLS-1$
	protected static final String RACE11_DESC = "West Sands (28/04/2012)"; //$NON-NLS-1$
	protected static final int RACE11_PILOTS = 20;
	protected static final String RACE12_NAME = "Race 12"; //$NON-NLS-1$
	protected static final String RACE12_DESC = "West Sands (28/04/2012)"; //$NON-NLS-1$
	protected static final int RACE12_PILOTS = 20;
	protected static final String RACE13_NAME = "Race 13"; //$NON-NLS-1$
	protected static final String RACE13_DESC = "West Sands (28/04/2012)"; //$NON-NLS-1$
	protected static final int RACE13_PILOTS = 20;
	protected static final String RACE14_NAME = "Race 14"; //$NON-NLS-1$
	protected static final String RACE14_DESC = "West Sands (29/04/2012)"; //$NON-NLS-1$
	protected static final int RACE14_PILOTS = 19;
	protected static final String RACE15_NAME = "Race 15"; //$NON-NLS-1$
	protected static final String RACE15_DESC = "West Sands (29/04/2012)"; //$NON-NLS-1$
	protected static final int RACE15_PILOTS = 19;

	protected static final String EVENT5_NAME = "Race Event 5"; //$NON-NLS-1$
	protected static final String EVENT5_DESC = "West Sands (26/05/2012 and 27/05/2012)"; //$NON-NLS-1$
	protected static final int EVENT5_FLEET = 16;
	protected static final String RACE16_NAME = "Race 16"; //$NON-NLS-1$
	protected static final String RACE16_DESC = "West Sands (26/05/2012)"; //$NON-NLS-1$
	protected static final int RACE16_PILOTS = 16;
	protected static final String RACE17_NAME = "Race 17"; //$NON-NLS-1$
	protected static final String RACE17_DESC = "West Sands (26/05/2012)"; //$NON-NLS-1$
	protected static final int RACE17_PILOTS = 16;
	protected static final String RACE18_NAME = "Race 18"; //$NON-NLS-1$
	protected static final String RACE18_DESC = "West Sands (27/05/2012)"; //$NON-NLS-1$
	protected static final int RACE18_PILOTS = 16;
	protected static final String RACE19_NAME = "Race 19"; //$NON-NLS-1$
	protected static final String RACE19_DESC = "West Sands (27/05/2012)"; //$NON-NLS-1$
	protected static final int RACE19_PILOTS = 16;
	protected static final String RACE20_NAME = "Race 20"; //$NON-NLS-1$
	protected static final String RACE20_DESC = "West Sands (27/05/2012)"; //$NON-NLS-1$
	protected static final int RACE20_PILOTS = 16;

	protected Class junior;
	protected Class _16inWheel;
	protected Pilot sco018;
	protected Pilot sco019;
	protected Pilot sco040;
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
	protected Pilot sco198;
	protected Pilot sco200;
	protected Pilot sco248;
	protected Pilot sco249;
	protected Pilot sco315;
	protected Pilot sco320;
	protected Pilot sco467;
	protected Pilot sco528;
	protected Pilot sco529;
	protected Pilot sco808;
	protected Pilot b1045;

	private Series _series;
	private Event _nonEvent1;
	private Event _event1;
	private Race _race1;
	private Event _nonEvent2;
	private Event _event2;
	private Race _race2;
	private Race _race3;
	private Race _race4;
	private Event _nonEvent3;
	private Event _event3;
	private Race _race5;
	private Race _race6;
	private Race _race7;
	private Race _race8;
	private Race _race9;
	private Event _event4;
	private Race _race10;
	private Race _race11;
	private Race _race12;
	private Race _race13;
	private Race _race14;
	private Race _race15;
	private Event _event5;
	private Race _race16;
	private Race _race17;
	private Race _race18;
	private Race _race19;
	private Race _race20;

	@Override
	public void createAllData() throws Exception {
		createDatabase();
		createNonEvent1Data();
		createEvent1Races();
		createNonEvent2Data();
		createEvent2Races();
		createNonEvent3Data();
		createEvent3Races();
		createEvent4Races();
		createEvent5Races();
	}

	protected void createSeriesData() throws Exception {
		if (_series != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			// Create the 2011/12 series
			Series series = new Series(SERIES_NAME);

			// Create classes
			junior = new Class(series, "Junior"); //$NON-NLS-1$
			series.getClasses().add(junior);

			_16inWheel = new Class(series, "16\" Wheel"); //$NON-NLS-1$
			series.getClasses().add(_16inWheel);

			// Add all the pilots
			sco018 = new Pilot(series, "SCO018@2010", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(sco018);

			sco019 = new Pilot(series, "SCO019@2005", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(sco019);

			sco040 = new Pilot(series, "SCO040@2011", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(sco040);

			sco060 = new Pilot(series, "SCO060@2005", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(sco060);

			sco068 = new Pilot(series, "SCO068@2009", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(sco068);

			sco081 = new Pilot(series, "SCO081@2005", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(sco081);

			sco087 = new Pilot(series, "SCO087@2009", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			sco087.getClasses().add(_16inWheel);
			series.getPilots().add(sco087);

			sco116 = new Pilot(series, "SCO116@2010", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			sco116.getClasses().add(junior);
			series.getPilots().add(sco116);

			sco136 = new Pilot(series, "SCO136@2005", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(sco136);

			sco153 = new Pilot(series, "SCO153@2010", Sex.FEMALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			sco153.getClasses().add(_16inWheel);
			series.getPilots().add(sco153);

			sco156 = new Pilot(series, "SCO156@2010", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			sco156.getClasses().add(junior);
			series.getPilots().add(sco156);

			sco158 = new Pilot(series, "SCO158@2005", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			sco158.getClasses().add(_16inWheel);
			series.getPilots().add(sco158);

			sco159 = new Pilot(series, "SCO159@2005", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(sco159);

			sco179 = new Pilot(series, "SCO179@2005", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(sco179);

			sco197 = new Pilot(series, "SCO197@2006", Sex.FEMALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(sco197);

			sco198 = new Pilot(series, "SCO198@2006", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			sco198.getClasses().add(_16inWheel);
			series.getPilots().add(sco198);

			sco200 = new Pilot(series, "SCO200@2006", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(sco200);

			sco248 = new Pilot(series, "SCO248@2010", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			sco248.getClasses().add(_16inWheel);
			series.getPilots().add(sco248);

			sco249 = new Pilot(series, "SCO249@2011", Sex.FEMALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(sco249);

			sco315 = new Pilot(series, "SCO315@2011", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			sco315.getClasses().add(_16inWheel);
			series.getPilots().add(sco315);

			sco320 = new Pilot(series, "SCO320@2011", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			sco320.getClasses().add(_16inWheel);
			series.getPilots().add(sco320);

			sco467 = new Pilot(series, "SCO467@2011", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			sco467.getClasses().add(_16inWheel);
			series.getPilots().add(sco467);

			sco528 = new Pilot(series, "SCO528@2011", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			sco528.getClasses().add(_16inWheel);
			series.getPilots().add(sco528);

			sco529 = new Pilot(series, "SCO529@2011", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			sco529.getClasses().add(_16inWheel);
			series.getPilots().add(sco529);

			sco808 = new Pilot(series, "SCO808@2010", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(sco808);

			b1045 = new Pilot(series, "B1045@2011", Sex.MALE, "Belgium"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(b1045);

			createRaceNumbers(series.getPilots());

			// Save
			seriesDAO.persist(series);

			DatabaseSession.commit();

			_series = series;
		} finally {
			db.endSession();
		}
	}

	protected void createNonEvent1Data() throws Exception {
		createSeriesData();

		if (_nonEvent1 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);

			Event nonEvent1 = new Event(series, NON_EVENT1_NAME, NON_EVENT1_DESC);
			series.getEvents().add(nonEvent1);
			eventDAO.persist(nonEvent1);

			// attendEvent(nonEvent1, sco018);
			attendEvent(nonEvent1, sco019);
			attendEvent(nonEvent1, sco040);
			attendEvent(nonEvent1, sco060);
			attendEvent(nonEvent1, sco068);
			attendEvent(nonEvent1, sco081);
			attendEvent(nonEvent1, sco087);
			attendEvent(nonEvent1, sco116);
			attendEvent(nonEvent1, sco136);
			attendEvent(nonEvent1, sco153);
			attendEvent(nonEvent1, sco156);
			// attendEvent(nonEvent1, sco158);
			attendEvent(nonEvent1, sco159);
			attendEvent(nonEvent1, sco179);
			attendEvent(nonEvent1, sco197);
			// attendEvent(nonEvent1, sco198);
			attendEvent(nonEvent1, sco200);
			attendEvent(nonEvent1, sco248);
			attendEvent(nonEvent1, sco249);
			attendEvent(nonEvent1, sco320);
			attendEvent(nonEvent1, sco467);
			attendEvent(nonEvent1, sco528);
			attendEvent(nonEvent1, sco808);

			DatabaseSession.commit();

			_nonEvent1 = nonEvent1;
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

			Event event1 = new Event(series, EVENT1_NAME, EVENT1_DESC);
			series.getEvents().add(event1);
			eventDAO.persist(event1);

			DatabaseSession.commit();

			_event1 = event1;
		} finally {
			db.endSession();
		}
	}

	protected void createEvent1Races() throws Exception {
		createRace1Data();
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

			Race race1 = new Race(event1, RACE1_NAME, RACE1_DESC);
			event1.getRaces().add(race1);
			race1.getAttendees().put(sco018, new RaceAttendee(race1, sco018, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco019, new RaceAttendee(race1, sco019, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco060, new RaceAttendee(race1, sco060, RaceAttendee.Type.V_SCORER));
			race1.getAttendees().put(sco068, new RaceAttendee(race1, sco068, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco081, new RaceAttendee(race1, sco081, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco087, new RaceAttendee(race1, sco087, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco116, new RaceAttendee(race1, sco116, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco136, new RaceAttendee(race1, sco136, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco153, new RaceAttendee(race1, sco153, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco156, new RaceAttendee(race1, sco156, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco158, new RaceAttendee(race1, sco158, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco159, new RaceAttendee(race1, sco159, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco179, new RaceAttendee(race1, sco179, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco197, new RaceAttendee(race1, sco197, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco198, new RaceAttendee(race1, sco198, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco200, new RaceAttendee(race1, sco200, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco248, new RaceAttendee(race1, sco248, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco249, new RaceAttendee(race1, sco249, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco320, new RaceAttendee(race1, sco320, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco467, new RaceAttendee(race1, sco467, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco528, new RaceAttendee(race1, sco528, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco808, new RaceAttendee(race1, sco808, RaceAttendee.Type.PILOT));
			race1.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "136", sco136)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "19", sco019)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "198", sco198)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "197", sco197)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "158", sco158)); //$NON-NLS-1$
			// 2
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "136", sco136)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "19", sco019)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "198", sco198)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "197", sco197)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "158", sco158)); //$NON-NLS-1$
			// 3
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "136", sco136)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "19", sco019)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "198", sco198)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			// 4
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "136", sco136)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			// 5
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			raceDAO.persist(race1);

			DatabaseSession.commit();

			_race1 = race1;
		} finally {
			db.endSession();
		}
	}

	protected void createNonEvent2Data() throws Exception {
		createSeriesData();

		if (_nonEvent2 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);

			Event nonEvent2 = new Event(series, NON_EVENT2_NAME, NON_EVENT2_DESC);
			series.getEvents().add(nonEvent2);
			eventDAO.persist(nonEvent2);

			attendEvent(nonEvent2, sco018);
			attendEvent(nonEvent2, sco019);
			attendEvent(nonEvent2, sco040);
			attendEvent(nonEvent2, sco060);
			attendEvent(nonEvent2, sco068);
			attendEvent(nonEvent2, sco081);
			attendEvent(nonEvent2, sco087);
			attendEvent(nonEvent2, sco116);
			attendEvent(nonEvent2, sco136);
			attendEvent(nonEvent2, sco153);
			attendEvent(nonEvent2, sco156);
			// attendEvent(nonEvent2, sco158);
			attendEvent(nonEvent2, sco159);
			attendEvent(nonEvent2, sco179);
			attendEvent(nonEvent2, sco197);
			// attendEvent(nonEvent2, sco198);
			attendEvent(nonEvent2, sco200);
			attendEvent(nonEvent2, sco248);
			attendEvent(nonEvent2, sco249);
			attendEvent(nonEvent2, sco320);
			attendEvent(nonEvent2, sco467);
			attendEvent(nonEvent2, sco528);
			attendEvent(nonEvent2, sco808);

			DatabaseSession.commit();

			_nonEvent2 = nonEvent2;
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

			Event event2 = new Event(series, EVENT2_NAME, EVENT2_DESC);
			series.getEvents().add(event2);
			eventDAO.persist(event2);

			DatabaseSession.commit();

			_event2 = event2;
		} finally {
			db.endSession();
		}
	}

	protected void createEvent2Races() throws Exception {
		createRace2Data();
		createRace3Data();
		createRace4Data();
	}

	protected void createRace2Data() throws Exception {
		createEvent2Data();

		if (_race2 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event2 = eventDAO.find(series, EVENT2_NAME);

			Race race2 = new Race(event2, RACE2_NAME, RACE2_DESC);
			event2.getRaces().add(race2);
			// race2.getAttendees().put(sco018, new RaceAttendee(race2, sco018, RaceAttendee.Type.PILOT));
			RaceAttendee att019 = new RaceAttendee(race2, sco019, RaceAttendee.Type.PILOT);
			att019.getPenalties().add(new Penalty(Penalty.Type.AUTOMATIC, "Hit a mark")); //$NON-NLS-1$
			race2.getAttendees().put(sco019, att019);
			race2.getAttendees().put(sco060, new RaceAttendee(race2, sco060, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco068, new RaceAttendee(race2, sco068, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco081, new RaceAttendee(race2, sco081, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco087, new RaceAttendee(race2, sco087, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco116, new RaceAttendee(race2, sco116, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco136, new RaceAttendee(race2, sco136, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco153, new RaceAttendee(race2, sco153, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco159, new RaceAttendee(race2, sco159, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco179, new RaceAttendee(race2, sco179, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco197, new RaceAttendee(race2, sco197, RaceAttendee.Type.M_RACE_MASTER));
			race2.getAttendees().put(sco198, new RaceAttendee(race2, sco198, RaceAttendee.Type.M_SCORER));
			race2.getAttendees().put(sco200, new RaceAttendee(race2, sco200, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco248, new RaceAttendee(race2, sco248, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco249, new RaceAttendee(race2, sco249, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco320, new RaceAttendee(race2, sco320, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco467, new RaceAttendee(race2, sco467, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco528, new RaceAttendee(race2, sco528, RaceAttendee.Type.PILOT));
			RaceAttendee att808 = new RaceAttendee(race2, sco808, RaceAttendee.Type.PILOT);
			att808.getPenalties().add(new Penalty(Penalty.Type.AUTOMATIC, "Hit a mark")); //$NON-NLS-1$
			race2.getAttendees().put(sco808, att808);
			RaceAttendee att1045 = new RaceAttendee(race2, b1045, RaceAttendee.Type.PILOT);
			// http://www.flickr.com/photos/lp0/6838159693/in/set-72157629234378617/
			// B1045 didn't cross the start line before the race started
			att1045.getPenalties().add(new Penalty(Penalty.Type.ADJUST_LAPS, -1, "Jumped start")); //$NON-NLS-1$
			race2.getAttendees().put(b1045, att1045);
			race2.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "B1045", b1045)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			// 2
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "B1045", b1045)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			// 3
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "B1045", b1045)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			// 4
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "B1045", b1045)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			// 5
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "B1045", b1045)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			// 6
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "19", sco019)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "B1045", b1045)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			raceDAO.persist(race2);

			DatabaseSession.commit();

			_race2 = race2;
		} finally {
			db.endSession();
		}
	}

	protected void createRace3Data() throws Exception {
		createEvent2Data();

		if (_race3 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event2 = eventDAO.find(series, EVENT2_NAME);

			Race race3 = new Race(event2, RACE3_NAME, RACE3_DESC);
			event2.getRaces().add(race3);
			race3.getAttendees().put(sco019, new RaceAttendee(race3, sco019, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco060, new RaceAttendee(race3, sco060, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco068, new RaceAttendee(race3, sco068, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco081, new RaceAttendee(race3, sco081, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco087, new RaceAttendee(race3, sco087, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco116, new RaceAttendee(race3, sco116, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco136, new RaceAttendee(race3, sco136, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco153, new RaceAttendee(race3, sco153, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco159, new RaceAttendee(race3, sco159, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco179, new RaceAttendee(race3, sco179, RaceAttendee.Type.M_SCORER));
			race3.getAttendees().put(sco197, new RaceAttendee(race3, sco197, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco198, new RaceAttendee(race3, sco198, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco200, new RaceAttendee(race3, sco200, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco248, new RaceAttendee(race3, sco248, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco249, new RaceAttendee(race3, sco249, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco320, new RaceAttendee(race3, sco320, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco467, new RaceAttendee(race3, sco467, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco528, new RaceAttendee(race3, sco528, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco808, new RaceAttendee(race3, sco808, RaceAttendee.Type.M_RACE_MASTER));
			race3.getAttendees().put(b1045, new RaceAttendee(race3, b1045, RaceAttendee.Type.PILOT));
			race3.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "B1045", b1045)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "136", sco136)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			// 2
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "B1045", b1045)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "19", sco019)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			// 3
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "B1045", b1045)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "136", sco136)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			// 4
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "B1045", b1045)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "19", sco019)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			// 5
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "136", sco136)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "198", sco198)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "B1045", b1045)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			// 6
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "B1045", b1045)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "136", sco136)); //$NON-NLS-1$
			// 7
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "B1045", b1045)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "136", sco136)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "19", sco019)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			raceDAO.persist(race3);

			DatabaseSession.commit();

			_race3 = race3;
		} finally {
			db.endSession();
		}
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

			Race race4 = new Race(event2, RACE4_NAME, RACE4_DESC);
			event2.getRaces().add(race4);
			race4.getAttendees().put(sco019, new RaceAttendee(race4, sco019, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco060, new RaceAttendee(race4, sco060, RaceAttendee.Type.M_SCORER));
			race4.getAttendees().put(sco068, new RaceAttendee(race4, sco068, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco081, new RaceAttendee(race4, sco081, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco087, new RaceAttendee(race4, sco087, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco116, new RaceAttendee(race4, sco116, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco136, new RaceAttendee(race4, sco136, RaceAttendee.Type.M_RACE_MASTER));
			race4.getAttendees().put(sco153, new RaceAttendee(race4, sco153, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco159, new RaceAttendee(race4, sco159, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco179, new RaceAttendee(race4, sco179, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco197, new RaceAttendee(race4, sco197, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco198, new RaceAttendee(race4, sco198, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco200, new RaceAttendee(race4, sco200, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco248, new RaceAttendee(race4, sco248, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco249, new RaceAttendee(race4, sco249, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco320, new RaceAttendee(race4, sco320, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco467, new RaceAttendee(race4, sco467, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco528, new RaceAttendee(race4, sco528, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco808, new RaceAttendee(race4, sco808, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(b1045, new RaceAttendee(race4, b1045, RaceAttendee.Type.PILOT));
			race4.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "B1045", b1045)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			// 2
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "B1045", b1045)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			// 3
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "B1045", b1045)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			// 4
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "B1045", b1045)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			// 5
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "B1045", b1045)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			// 6
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "B1045", b1045)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			// 7
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "B1045", b1045)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			raceDAO.persist(race4);

			DatabaseSession.commit();

			_race4 = race4;
		} finally {
			db.endSession();
		}
	}

	protected void createNonEvent3Data() throws Exception {
		createSeriesData();

		if (_nonEvent3 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);

			Event nonEvent3 = new Event(series, NON_EVENT3_NAME, NON_EVENT3_DESC);
			series.getEvents().add(nonEvent3);
			eventDAO.persist(nonEvent3);

			attendEvent(nonEvent3, sco018);
			attendEvent(nonEvent3, sco019);
			attendEvent(nonEvent3, sco040);
			attendEvent(nonEvent3, sco060);
			attendEvent(nonEvent3, sco068);
			attendEvent(nonEvent3, sco081);
			attendEvent(nonEvent3, sco087);
			attendEvent(nonEvent3, sco116);
			// attendEvent(nonEvent3, sco136);
			attendEvent(nonEvent3, sco153);
			attendEvent(nonEvent3, sco156);
			// attendEvent(nonEvent3, sco158);
			attendEvent(nonEvent3, sco159);
			attendEvent(nonEvent3, sco179);
			attendEvent(nonEvent3, sco197);
			// attendEvent(nonEvent3, sco198);
			attendEvent(nonEvent3, sco200);
			attendEvent(nonEvent3, sco248);
			attendEvent(nonEvent3, sco249);
			attendEvent(nonEvent3, sco320);
			attendEvent(nonEvent3, sco467);
			attendEvent(nonEvent3, sco528);
			attendEvent(nonEvent3, sco808);

			DatabaseSession.commit();

			_nonEvent3 = nonEvent3;
		} finally {
			db.endSession();
		}
	}

	protected void createEvent3Data() throws Exception {
		createSeriesData();

		if (_event3 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);

			Event event3 = new Event(series, EVENT3_NAME, EVENT3_DESC);
			series.getEvents().add(event3);
			eventDAO.persist(event3);

			DatabaseSession.commit();

			_event3 = event3;
		} finally {
			db.endSession();
		}
	}

	protected void createEvent3Races() throws Exception {
		createRace5Data();
		createRace6Data();
		createRace7Data();
		createRace8Data();
		createRace9Data();
	}

	protected void createRace5Data() throws Exception {
		createEvent3Data();

		if (_race5 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event3 = eventDAO.find(series, EVENT3_NAME);

			Race race5 = new Race(event3, RACE5_NAME, RACE5_DESC);
			event3.getRaces().add(race5);
			race5.getAttendees().put(sco018, new RaceAttendee(race5, sco018, RaceAttendee.Type.M_SCORER));
			race5.getAttendees().put(sco019, new RaceAttendee(race5, sco019, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco040, new RaceAttendee(race5, sco040, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco060, new RaceAttendee(race5, sco060, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco068, new RaceAttendee(race5, sco068, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco081, new RaceAttendee(race5, sco081, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco087, new RaceAttendee(race5, sco087, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco116, new RaceAttendee(race5, sco116, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco153, new RaceAttendee(race5, sco153, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco156, new RaceAttendee(race5, sco156, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco159, new RaceAttendee(race5, sco159, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco179, new RaceAttendee(race5, sco179, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco248, new RaceAttendee(race5, sco248, RaceAttendee.Type.M_RACE_MASTER));
			race5.getAttendees().put(sco249, new RaceAttendee(race5, sco249, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco320, new RaceAttendee(race5, sco320, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco467, new RaceAttendee(race5, sco467, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco528, new RaceAttendee(race5, sco528, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco808, new RaceAttendee(race5, sco808, RaceAttendee.Type.PILOT));
			race5.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "19", sco019)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "40", sco040)); //$NON-NLS-1$
			// 2
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "19", sco019)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			// 3
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "19", sco019)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			// 4
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "19", sco019)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			// 5
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "19", sco019)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			// 6
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			raceDAO.persist(race5);

			DatabaseSession.commit();

			_race5 = race5;
		} finally {
			db.endSession();
		}
	}

	protected void createRace6Data() throws Exception {
		createEvent3Data();

		if (_race6 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event3 = eventDAO.find(series, EVENT3_NAME);

			Race race6 = new Race(event3, RACE6_NAME, RACE6_DESC);
			event3.getRaces().add(race6);
			race6.getAttendees().put(sco018, new RaceAttendee(race6, sco018, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco019, new RaceAttendee(race6, sco019, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco040, new RaceAttendee(race6, sco040, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco060, new RaceAttendee(race6, sco060, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco068, new RaceAttendee(race6, sco068, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco081, new RaceAttendee(race6, sco081, RaceAttendee.Type.M_RACE_MASTER));
			race6.getAttendees().put(sco087, new RaceAttendee(race6, sco087, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco116, new RaceAttendee(race6, sco116, RaceAttendee.Type.M_SCORER));
			race6.getAttendees().put(sco153, new RaceAttendee(race6, sco153, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco156, new RaceAttendee(race6, sco156, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco159, new RaceAttendee(race6, sco159, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco179, new RaceAttendee(race6, sco179, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco248, new RaceAttendee(race6, sco248, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco249, new RaceAttendee(race6, sco249, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco320, new RaceAttendee(race6, sco320, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco467, new RaceAttendee(race6, sco467, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco528, new RaceAttendee(race6, sco528, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco808, new RaceAttendee(race6, sco808, RaceAttendee.Type.PILOT));
			race6.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "19", sco019)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			// 2
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "19", sco019)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "40", sco040)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			// 3
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "19", sco019)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			// 4
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "40", sco040)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "19", sco019)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			// 5
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "19", sco019)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			// 6
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			// 7
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "19", sco019)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			// 8
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "19", sco019)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			// 9
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "19", sco019)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			// 10
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "19", sco019)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			raceDAO.persist(race6);

			DatabaseSession.commit();

			_race6 = race6;
		} finally {
			db.endSession();
		}
	}

	protected void createRace7Data() throws Exception {
		createEvent3Data();

		if (_race7 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event3 = eventDAO.find(series, EVENT3_NAME);

			Race race7 = new Race(event3, RACE7_NAME, RACE7_DESC);
			event3.getRaces().add(race7);
			race7.getAttendees().put(sco018, new RaceAttendee(race7, sco018, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco019, new RaceAttendee(race7, sco019, RaceAttendee.Type.M_SCORER));
			race7.getAttendees().put(sco040, new RaceAttendee(race7, sco040, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco060, new RaceAttendee(race7, sco060, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco068, new RaceAttendee(race7, sco068, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco081, new RaceAttendee(race7, sco081, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco087, new RaceAttendee(race7, sco087, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco116, new RaceAttendee(race7, sco116, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco153, new RaceAttendee(race7, sco153, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco156, new RaceAttendee(race7, sco156, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco159, new RaceAttendee(race7, sco159, RaceAttendee.Type.M_RACE_MASTER));
			race7.getAttendees().put(sco179, new RaceAttendee(race7, sco179, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco248, new RaceAttendee(race7, sco248, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco249, new RaceAttendee(race7, sco249, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco320, new RaceAttendee(race7, sco320, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco467, new RaceAttendee(race7, sco467, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco528, new RaceAttendee(race7, sco528, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco808, new RaceAttendee(race7, sco808, RaceAttendee.Type.PILOT));
			race7.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			// 2
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			// 3
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			// 4
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			raceDAO.persist(race7);

			DatabaseSession.commit();

			_race7 = race7;
		} finally {
			db.endSession();
		}
	}

	protected void createRace8Data() throws Exception {
		createEvent3Data();

		if (_race8 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event3 = eventDAO.find(series, EVENT3_NAME);

			Race race8 = new Race(event3, RACE8_NAME, RACE8_DESC);
			event3.getRaces().add(race8);
			race8.getAttendees().put(sco019, new RaceAttendee(race8, sco019, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco060, new RaceAttendee(race8, sco060, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco068, new RaceAttendee(race8, sco068, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco081, new RaceAttendee(race8, sco081, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco087, new RaceAttendee(race8, sco087, RaceAttendee.Type.M_RACE_MASTER));
			race8.getAttendees().put(sco116, new RaceAttendee(race8, sco116, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco153, new RaceAttendee(race8, sco153, RaceAttendee.Type.M_SCORER));
			race8.getAttendees().put(sco156, new RaceAttendee(race8, sco156, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco159, new RaceAttendee(race8, sco159, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco179, new RaceAttendee(race8, sco179, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco200, new RaceAttendee(race8, sco200, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco248, new RaceAttendee(race8, sco248, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco249, new RaceAttendee(race8, sco249, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco320, new RaceAttendee(race8, sco320, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco467, new RaceAttendee(race8, sco467, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco528, new RaceAttendee(race8, sco528, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco808, new RaceAttendee(race8, sco808, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco040, new RaceAttendee(race8, sco040, RaceAttendee.Type.PILOT));
			race8.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "40", sco040)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "156", sco156)); //$NON-NLS-1$
			// 2
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "40", sco040)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "156", sco156)); //$NON-NLS-1$
			// 3
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "40", sco040)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "156", sco156)); //$NON-NLS-1$
			// 4
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "40", sco040)); //$NON-NLS-1$
			// 5
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			// 6
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			// 7
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			raceDAO.persist(race8);

			DatabaseSession.commit();

			_race8 = race8;
		} finally {
			db.endSession();
		}
	}

	protected void createRace9Data() throws Exception {
		createEvent3Data();

		if (_race9 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event3 = eventDAO.find(series, EVENT3_NAME);

			Race race9 = new Race(event3, RACE9_NAME, RACE9_DESC);
			event3.getRaces().add(race9);
			race9.getAttendees().put(sco019, new RaceAttendee(race9, sco019, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco060, new RaceAttendee(race9, sco060, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco068, new RaceAttendee(race9, sco068, RaceAttendee.Type.M_SCORER));
			race9.getAttendees().put(sco081, new RaceAttendee(race9, sco081, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco087, new RaceAttendee(race9, sco087, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco116, new RaceAttendee(race9, sco116, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco153, new RaceAttendee(race9, sco153, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco156, new RaceAttendee(race9, sco156, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco159, new RaceAttendee(race9, sco159, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco179, new RaceAttendee(race9, sco179, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco200, new RaceAttendee(race9, sco200, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco248, new RaceAttendee(race9, sco248, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco249, new RaceAttendee(race9, sco249, RaceAttendee.Type.M_RACE_MASTER));
			race9.getAttendees().put(sco320, new RaceAttendee(race9, sco320, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco467, new RaceAttendee(race9, sco467, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco528, new RaceAttendee(race9, sco528, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco808, new RaceAttendee(race9, sco808, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco040, new RaceAttendee(race9, sco040, RaceAttendee.Type.PILOT));
			race9.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			// 2
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			// 3
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			// 4
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			// 5
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			raceDAO.persist(race9);

			DatabaseSession.commit();

			_race9 = race9;
		} finally {
			db.endSession();
		}
	}

	protected void createEvent4Data() throws Exception {
		createSeriesData();

		if (_event4 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);

			Event event4 = new Event(series, EVENT4_NAME, EVENT4_DESC);
			series.getEvents().add(event4);
			eventDAO.persist(event4);

			DatabaseSession.commit();

			_event4 = event4;
		} finally {
			db.endSession();
		}
	}

	protected void createEvent4Races() throws Exception {
		createRace10Data();
		createRace11Data();
		createRace12Data();
		createRace13Data();
		createRace14Data();
		createRace15Data();
	}

	protected void createRace10Data() throws Exception {
		createEvent4Data();

		if (_race10 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event4 = eventDAO.find(series, EVENT4_NAME);

			Race race10 = new Race(event4, RACE10_NAME, RACE10_DESC);
			event4.getRaces().add(race10);
			race10.getAttendees().put(sco018, new RaceAttendee(race10, sco018, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco060, new RaceAttendee(race10, sco060, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco068, new RaceAttendee(race10, sco068, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco081, new RaceAttendee(race10, sco081, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco087, new RaceAttendee(race10, sco087, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco116, new RaceAttendee(race10, sco116, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco153, new RaceAttendee(race10, sco153, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco156, new RaceAttendee(race10, sco156, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco158, new RaceAttendee(race10, sco158, RaceAttendee.Type.M_SCORER));
			race10.getAttendees().put(sco159, new RaceAttendee(race10, sco159, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco179, new RaceAttendee(race10, sco179, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco200, new RaceAttendee(race10, sco200, RaceAttendee.Type.M_RACE_MASTER));
			race10.getAttendees().put(sco248, new RaceAttendee(race10, sco248, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco249, new RaceAttendee(race10, sco249, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco315, new RaceAttendee(race10, sco315, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco320, new RaceAttendee(race10, sco320, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco467, new RaceAttendee(race10, sco467, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco528, new RaceAttendee(race10, sco528, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco529, new RaceAttendee(race10, sco529, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco808, new RaceAttendee(race10, sco808, RaceAttendee.Type.PILOT));
			race10.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			// 2
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			// 3
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "156", sco156)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			// 4
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			// 5
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			// 6
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			// 7
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "156", sco156)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			raceDAO.persist(race10);

			DatabaseSession.commit();

			_race10 = race10;
		} finally {
			db.endSession();
		}
	}

	protected void createRace11Data() throws Exception {
		createEvent4Data();

		if (_race11 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event4 = eventDAO.find(series, EVENT4_NAME);

			Race race11 = new Race(event4, RACE11_NAME, RACE11_DESC);
			event4.getRaces().add(race11);
			race11.getAttendees().put(sco018, new RaceAttendee(race11, sco018, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco060, new RaceAttendee(race11, sco060, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco068, new RaceAttendee(race11, sco068, RaceAttendee.Type.M_RACE_MASTER));
			race11.getAttendees().put(sco081, new RaceAttendee(race11, sco081, RaceAttendee.Type.M_SCORER));
			race11.getAttendees().put(sco087, new RaceAttendee(race11, sco087, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco116, new RaceAttendee(race11, sco116, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco153, new RaceAttendee(race11, sco153, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco156, new RaceAttendee(race11, sco156, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco158, new RaceAttendee(race11, sco158, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco159, new RaceAttendee(race11, sco159, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco179, new RaceAttendee(race11, sco179, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco200, new RaceAttendee(race11, sco200, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco248, new RaceAttendee(race11, sco248, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco249, new RaceAttendee(race11, sco249, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco315, new RaceAttendee(race11, sco315, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco320, new RaceAttendee(race11, sco320, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco467, new RaceAttendee(race11, sco467, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco528, new RaceAttendee(race11, sco528, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco529, new RaceAttendee(race11, sco529, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco808, new RaceAttendee(race11, sco808, RaceAttendee.Type.PILOT));
			race11.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			// 2
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "158", sco158)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "156", sco156)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			// 3
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "158", sco158)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			// 4
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			// 5
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			// 6
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "156", sco156)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "158", sco158)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			// 7
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			// 8
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "158", sco158)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "156", sco156)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			raceDAO.persist(race11);

			DatabaseSession.commit();

			_race11 = race11;
		} finally {
			db.endSession();
		}
	}

	protected void createRace12Data() throws Exception {
		createEvent4Data();

		if (_race12 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event4 = eventDAO.find(series, EVENT4_NAME);

			Race race12 = new Race(event4, RACE12_NAME, RACE12_DESC);
			event4.getRaces().add(race12);
			race12.getAttendees().put(sco018, new RaceAttendee(race12, sco018, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco060, new RaceAttendee(race12, sco060, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco068, new RaceAttendee(race12, sco068, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco081, new RaceAttendee(race12, sco081, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco087, new RaceAttendee(race12, sco087, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco116, new RaceAttendee(race12, sco116, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco153, new RaceAttendee(race12, sco153, RaceAttendee.Type.M_RACE_MASTER));
			race12.getAttendees().put(sco156, new RaceAttendee(race12, sco156, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco158, new RaceAttendee(race12, sco158, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco159, new RaceAttendee(race12, sco159, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco179, new RaceAttendee(race12, sco179, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco200, new RaceAttendee(race12, sco200, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco248, new RaceAttendee(race12, sco248, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco249, new RaceAttendee(race12, sco249, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco315, new RaceAttendee(race12, sco315, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco320, new RaceAttendee(race12, sco320, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco467, new RaceAttendee(race12, sco467, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco528, new RaceAttendee(race12, sco528, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco529, new RaceAttendee(race12, sco529, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco808, new RaceAttendee(race12, sco808, RaceAttendee.Type.M_SCORER));
			race12.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "158", sco158)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "156", sco156)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			// 2
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "158", sco158)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "156", sco156)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			// 3
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "158", sco158)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "156", sco156)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			// 4
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "158", sco158)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			// 5
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "158", sco158)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			// 6
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "158", sco158)); //$NON-NLS-1$
			// 7
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			// 8
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			raceDAO.persist(race12);

			DatabaseSession.commit();

			_race12 = race12;
		} finally {
			db.endSession();
		}
	}

	protected void createRace13Data() throws Exception {
		createEvent4Data();

		if (_race13 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event4 = eventDAO.find(series, EVENT4_NAME);

			Race race13 = new Race(event4, RACE13_NAME, RACE13_DESC);
			event4.getRaces().add(race13);
			race13.getAttendees().put(sco018, new RaceAttendee(race13, sco018, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco060, new RaceAttendee(race13, sco060, RaceAttendee.Type.V_SCORER));
			race13.getAttendees().put(sco068, new RaceAttendee(race13, sco068, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco081, new RaceAttendee(race13, sco081, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco087, new RaceAttendee(race13, sco087, RaceAttendee.Type.M_RACE_MASTER));
			race13.getAttendees().put(sco116, new RaceAttendee(race13, sco116, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco153, new RaceAttendee(race13, sco153, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco156, new RaceAttendee(race13, sco156, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco158, new RaceAttendee(race13, sco158, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco159, new RaceAttendee(race13, sco159, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco179, new RaceAttendee(race13, sco179, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco200, new RaceAttendee(race13, sco200, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco248, new RaceAttendee(race13, sco248, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco249, new RaceAttendee(race13, sco249, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco315, new RaceAttendee(race13, sco315, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco320, new RaceAttendee(race13, sco320, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco467, new RaceAttendee(race13, sco467, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco528, new RaceAttendee(race13, sco528, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco529, new RaceAttendee(race13, sco529, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco808, new RaceAttendee(race13, sco808, RaceAttendee.Type.PILOT));
			race13.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "158", sco158)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			// 2
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "156", sco156)); //$NON-NLS-1$
			// 3
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "158", sco158)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			// 4
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "158", sco158)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			// 5
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "156", sco156)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			// 6
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "158", sco158)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			// 7
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "158", sco158)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "156", sco156)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			// 8
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			// 9
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "158", sco158)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "156", sco156)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			// 10
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "158", sco158)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			// 11
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "156", sco156)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			// 12
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "158", sco158)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "158", sco158)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "156", sco156)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			raceDAO.persist(race13);

			DatabaseSession.commit();

			_race13 = race13;
		} finally {
			db.endSession();
		}
	}

	protected void createRace14Data() throws Exception {
		createEvent4Data();

		if (_race14 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event4 = eventDAO.find(series, EVENT4_NAME);

			Race race14 = new Race(event4, RACE14_NAME, RACE14_DESC);
			event4.getRaces().add(race14);
			race14.getAttendees().put(sco018, new RaceAttendee(race14, sco018, RaceAttendee.Type.PILOT));
			RaceAttendee att060 = new RaceAttendee(race14, sco060, RaceAttendee.Type.PILOT);
			att060.getPenalties().add(new Penalty(Penalty.Type.AUTOMATIC, 1, "Hit mark 5")); //$NON-NLS-1$
			race14.getAttendees().put(sco060, att060);
			race14.getAttendees().put(sco068, new RaceAttendee(race14, sco068, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco081, new RaceAttendee(race14, sco081, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco087, new RaceAttendee(race14, sco087, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco116, new RaceAttendee(race14, sco116, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco153, new RaceAttendee(race14, sco153, RaceAttendee.Type.PILOT));
			RaceAttendee att156 = new RaceAttendee(race14, sco156, RaceAttendee.Type.PILOT);
			att156.getPenalties().add(new Penalty(Penalty.Type.AUTOMATIC, 1, "Hit mark 5")); //$NON-NLS-1$
			race14.getAttendees().put(sco156, att156);
			race14.getAttendees().put(sco158, new RaceAttendee(race14, sco158, RaceAttendee.Type.M_RACE_MASTER));
			race14.getAttendees().put(sco159, new RaceAttendee(race14, sco159, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco179, new RaceAttendee(race14, sco179, RaceAttendee.Type.M_SCORER));
			race14.getAttendees().put(sco200, new RaceAttendee(race14, sco200, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco248, new RaceAttendee(race14, sco248, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco249, new RaceAttendee(race14, sco249, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco315, new RaceAttendee(race14, sco315, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco320, new RaceAttendee(race14, sco320, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco528, new RaceAttendee(race14, sco528, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco529, new RaceAttendee(race14, sco529, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco808, new RaceAttendee(race14, sco808, RaceAttendee.Type.PILOT));
			race14.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			// 2
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			// 3
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			// 4
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "156", sco156)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			// 5
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			// 6
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			// 7
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "156", sco156)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			// 8
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "156", sco156)); //$NON-NLS-1$
			raceDAO.persist(race14);

			DatabaseSession.commit();

			_race14 = race14;
		} finally {
			db.endSession();
		}
	}

	protected void createRace15Data() throws Exception {
		createEvent4Data();

		if (_race15 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event4 = eventDAO.find(series, EVENT4_NAME);

			Race race15 = new Race(event4, RACE15_NAME, RACE15_DESC);
			event4.getRaces().add(race15);
			race15.getAttendees().put(sco018, new RaceAttendee(race15, sco018, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco060, new RaceAttendee(race15, sco060, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco068, new RaceAttendee(race15, sco068, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco081, new RaceAttendee(race15, sco081, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco087, new RaceAttendee(race15, sco087, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco116, new RaceAttendee(race15, sco116, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco153, new RaceAttendee(race15, sco153, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco156, new RaceAttendee(race15, sco156, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco158, new RaceAttendee(race15, sco158, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco159, new RaceAttendee(race15, sco159, RaceAttendee.Type.M_SCORER));
			race15.getAttendees().put(sco179, new RaceAttendee(race15, sco179, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco200, new RaceAttendee(race15, sco200, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco248, new RaceAttendee(race15, sco248, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco249, new RaceAttendee(race15, sco249, RaceAttendee.Type.M_RACE_MASTER));
			race15.getAttendees().put(sco315, new RaceAttendee(race15, sco315, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco320, new RaceAttendee(race15, sco320, RaceAttendee.Type.PILOT));
			RaceAttendee att528 = new RaceAttendee(race15, sco528, RaceAttendee.Type.PILOT);
			att528.getPenalties().add(new Penalty(Penalty.Type.AUTOMATIC, 1, "Hit mark 5")); //$NON-NLS-1$
			race15.getAttendees().put(sco528, att528);
			race15.getAttendees().put(sco529, new RaceAttendee(race15, sco529, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco808, new RaceAttendee(race15, sco808, RaceAttendee.Type.PILOT));
			race15.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "158", sco158)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "158", sco158)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "315", sco315)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "18", sco018)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			raceDAO.persist(race15);

			DatabaseSession.commit();

			_race15 = race15;
		} finally {
			db.endSession();
		}
	}

	protected void createEvent5Data() throws Exception {
		createSeriesData();

		if (_event5 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);

			Event event5 = new Event(series, EVENT5_NAME, EVENT5_DESC);
			series.getEvents().add(event5);
			eventDAO.persist(event5);

			DatabaseSession.commit();

			_event5 = event5;
		} finally {
			db.endSession();
		}
	}

	protected void createEvent5Races() throws Exception {
		createRace16Data();
		createRace17Data();
		createRace18Data();
		createRace19Data();
		createRace20Data();
	}

	protected void createRace16Data() throws Exception {
		createEvent5Data();

		if (_race16 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event5 = eventDAO.find(series, EVENT5_NAME);

			Race race16 = new Race(event5, RACE16_NAME, RACE16_DESC);
			event5.getRaces().add(race16);
			race16.getAttendees().put(sco060, new RaceAttendee(race16, sco060, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco068, new RaceAttendee(race16, sco068, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco081, new RaceAttendee(race16, sco081, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco087, new RaceAttendee(race16, sco087, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco116, new RaceAttendee(race16, sco116, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco153, new RaceAttendee(race16, sco153, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco159, new RaceAttendee(race16, sco159, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco179, new RaceAttendee(race16, sco179, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco200, new RaceAttendee(race16, sco200, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco248, new RaceAttendee(race16, sco248, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco249, new RaceAttendee(race16, sco249, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco320, new RaceAttendee(race16, sco320, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco467, new RaceAttendee(race16, sco467, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco528, new RaceAttendee(race16, sco528, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco529, new RaceAttendee(race16, sco529, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco808, new RaceAttendee(race16, sco808, RaceAttendee.Type.PILOT));
			race16.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			// 2
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			// 3
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			// 4
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			// 5
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			// 6
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			raceDAO.persist(race16);

			DatabaseSession.commit();

			_race16 = race16;
		} finally {
			db.endSession();
		}
	}

	protected void createRace17Data() throws Exception {
		createEvent5Data();

		if (_race17 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event5 = eventDAO.find(series, EVENT5_NAME);

			Race race17 = new Race(event5, RACE17_NAME, RACE17_DESC);
			event5.getRaces().add(race17);
			race17.getAttendees().put(sco060, new RaceAttendee(race17, sco060, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco068, new RaceAttendee(race17, sco068, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco081, new RaceAttendee(race17, sco081, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco087, new RaceAttendee(race17, sco087, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco116, new RaceAttendee(race17, sco116, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco153, new RaceAttendee(race17, sco153, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco159, new RaceAttendee(race17, sco159, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco179, new RaceAttendee(race17, sco179, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco200, new RaceAttendee(race17, sco200, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco248, new RaceAttendee(race17, sco248, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco249, new RaceAttendee(race17, sco249, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco320, new RaceAttendee(race17, sco320, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco467, new RaceAttendee(race17, sco467, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco528, new RaceAttendee(race17, sco528, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco529, new RaceAttendee(race17, sco529, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco808, new RaceAttendee(race17, sco808, RaceAttendee.Type.PILOT));
			race17.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			// 2
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			// 3
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			// 4
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			raceDAO.persist(race17);

			DatabaseSession.commit();

			_race17 = race17;
		} finally {
			db.endSession();
		}
	}

	protected void createRace18Data() throws Exception {
		createEvent5Data();

		if (_race18 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event5 = eventDAO.find(series, EVENT5_NAME);

			Race race18 = new Race(event5, RACE18_NAME, RACE18_DESC);
			event5.getRaces().add(race18);
			race18.getAttendees().put(sco060, new RaceAttendee(race18, sco060, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco068, new RaceAttendee(race18, sco068, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco081, new RaceAttendee(race18, sco081, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco087, new RaceAttendee(race18, sco087, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco116, new RaceAttendee(race18, sco116, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco153, new RaceAttendee(race18, sco153, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco159, new RaceAttendee(race18, sco159, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco179, new RaceAttendee(race18, sco179, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco200, new RaceAttendee(race18, sco200, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco248, new RaceAttendee(race18, sco248, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco249, new RaceAttendee(race18, sco249, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco320, new RaceAttendee(race18, sco320, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco467, new RaceAttendee(race18, sco467, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco528, new RaceAttendee(race18, sco528, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco529, new RaceAttendee(race18, sco529, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco808, new RaceAttendee(race18, sco808, RaceAttendee.Type.PILOT));
			race18.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			// 2
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			// 3
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			// 4
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			// 5
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			raceDAO.persist(race18);

			DatabaseSession.commit();

			_race18 = race18;
		} finally {
			db.endSession();
		}
	}

	protected void createRace19Data() throws Exception {
		createEvent5Data();

		if (_race19 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event5 = eventDAO.find(series, EVENT5_NAME);

			Race race19 = new Race(event5, RACE19_NAME, RACE19_DESC);
			event5.getRaces().add(race19);
			race19.getAttendees().put(sco060, new RaceAttendee(race19, sco060, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco068, new RaceAttendee(race19, sco068, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco081, new RaceAttendee(race19, sco081, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco087, new RaceAttendee(race19, sco087, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco116, new RaceAttendee(race19, sco116, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco153, new RaceAttendee(race19, sco153, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco159, new RaceAttendee(race19, sco159, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco179, new RaceAttendee(race19, sco179, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco200, new RaceAttendee(race19, sco200, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco248, new RaceAttendee(race19, sco248, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco249, new RaceAttendee(race19, sco249, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco320, new RaceAttendee(race19, sco320, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco467, new RaceAttendee(race19, sco467, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco528, new RaceAttendee(race19, sco528, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco529, new RaceAttendee(race19, sco529, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco808, new RaceAttendee(race19, sco808, RaceAttendee.Type.PILOT));
			race19.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			// 2
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			// 3
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			// 4
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			// 5
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			// 6
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			// 7
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			// 8
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			raceDAO.persist(race19);

			DatabaseSession.commit();

			_race19 = race19;
		} finally {
			db.endSession();
		}
	}

	protected void createRace20Data() throws Exception {
		createEvent5Data();

		if (_race20 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event5 = eventDAO.find(series, EVENT5_NAME);

			Race race20 = new Race(event5, RACE20_NAME, RACE20_DESC);
			event5.getRaces().add(race20);
			race20.getAttendees().put(sco060, new RaceAttendee(race20, sco060, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco068, new RaceAttendee(race20, sco068, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco081, new RaceAttendee(race20, sco081, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco087, new RaceAttendee(race20, sco087, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco116, new RaceAttendee(race20, sco116, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco153, new RaceAttendee(race20, sco153, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco159, new RaceAttendee(race20, sco159, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco179, new RaceAttendee(race20, sco179, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco200, new RaceAttendee(race20, sco200, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco248, new RaceAttendee(race20, sco248, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco249, new RaceAttendee(race20, sco249, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco320, new RaceAttendee(race20, sco320, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco467, new RaceAttendee(race20, sco467, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco528, new RaceAttendee(race20, sco528, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco529, new RaceAttendee(race20, sco529, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco808, new RaceAttendee(race20, sco808, RaceAttendee.Type.PILOT));
			race20.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			// 2
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			// 3
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			// 4
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			// 5
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			// 6
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			// 7
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			// 8
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			// 9
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			// 10
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			// 11
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "200", sco200)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "159", sco159)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "249", sco249)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "248", sco248)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "81", sco081)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "467", sco467)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "808", sco808)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "87", sco087)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "153", sco153)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "179", sco179)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "529", sco529)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "68", sco068)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "528", sco528)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "116", sco116)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "60", sco060)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "320", sco320)); //$NON-NLS-1$
			raceDAO.persist(race20);

			DatabaseSession.commit();

			_race20 = race20;
		} finally {
			db.endSession();
		}
	}
}