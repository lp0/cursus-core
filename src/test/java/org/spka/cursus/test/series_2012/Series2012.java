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
package org.spka.cursus.test.series_2012;

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

public class Series2012 extends AbstractSPKASeries {
	public Series2012() {
		super("SPKA Race Series 2012/13", SPKAConstants.UUID_2012); //$NON-NLS-1$
	}

	protected static final int SERIES_FLEET = 22;
	protected static final int SERIES_FLEET_AT_EVENT1 = 21;
	protected static final int SERIES_FLEET_AT_EVENT2 = 22;
	protected static final int SERIES_FLEET_AT_EVENT3 = 22;
	protected static final int SERIES_FLEET_AT_EVENT4 = 22;
	protected static final int SERIES_FLEET_AT_EVENT5 = 22;

	protected static final String NON_EVENT1_NAME = "Non-Event 1"; //$NON-NLS-1$
	protected static final String NON_EVENT1_DESC = "Fraserburgh Esplanade (20/10/2012 and 21/10/2012)"; //$NON-NLS-1$

	protected static final String NON_EVENT2_NAME = "Non-Event 2"; //$NON-NLS-1$
	protected static final String NON_EVENT2_DESC = "West Sands (16/02/2013 and 17/02/2013)"; //$NON-NLS-1$

	protected static final String EVENT1_NAME = "Race Event 1"; //$NON-NLS-1$
	protected static final String EVENT1_DESC = "West Sands (17/11/2012 and 18/11/2012)"; //$NON-NLS-1$
	protected static final int EVENT1_FLEET = 21;
	protected static final String RACE1_NAME = "Race 1"; //$NON-NLS-1$
	protected static final String RACE1_DESC = "West Sands (17/11/2012)"; //$NON-NLS-1$
	protected static final int RACE1_PILOTS = 16;
	protected static final String RACE2_NAME = "Race 2"; //$NON-NLS-1$
	protected static final String RACE2_DESC = "West Sands (17/11/2012)"; //$NON-NLS-1$
	protected static final int RACE2_PILOTS = 16;
	protected static final String RACE3_NAME = "Race 3"; //$NON-NLS-1$
	protected static final String RACE3_DESC = "West Sands (18/11/2012)"; //$NON-NLS-1$
	protected static final int RACE3_PILOTS = 16;
	protected static final String RACE4_NAME = "Race 4"; //$NON-NLS-1$
	protected static final String RACE4_DESC = "West Sands (18/11/2012)"; //$NON-NLS-1$
	protected static final int RACE4_PILOTS = 16;
	protected static final String RACE5_NAME = "Race 5"; //$NON-NLS-1$
	protected static final String RACE5_DESC = "West Sands (18/11/2012)"; //$NON-NLS-1$
	protected static final int RACE5_PILOTS = 16;
	protected static final String RACE6_NAME = "Race 6"; //$NON-NLS-1$
	protected static final String RACE6_DESC = "West Sands (18/11/2012)"; //$NON-NLS-1$
	protected static final int RACE6_PILOTS = 16;

	protected static final String EVENT2_NAME = "Race Event 2"; //$NON-NLS-1$
	protected static final String EVENT2_DESC = "Luce Bay (19/01/2013 and 20/01/2013)"; //$NON-NLS-1$
	protected static final int EVENT2_FLEET = 17;
	protected static final String RACE7_NAME = "Race 7"; //$NON-NLS-1$
	protected static final String RACE7_DESC = "Luce Bay (19/01/2013)"; //$NON-NLS-1$
	protected static final int RACE7_PILOTS = 16;
	protected static final String RACE8_NAME = "Race 8"; //$NON-NLS-1$
	protected static final String RACE8_DESC = "Luce Bay (19/01/2013)"; //$NON-NLS-1$
	protected static final int RACE8_PILOTS = 16;
	protected static final String RACE9_NAME = "Race 9"; //$NON-NLS-1$
	protected static final String RACE9_DESC = "Luce Bay (19/01/2013)"; //$NON-NLS-1$
	protected static final int RACE9_PILOTS = 16;
	protected static final String RACE10_NAME = "Race 10"; //$NON-NLS-1$
	protected static final String RACE10_DESC = "Luce Bay (20/01/2013)"; //$NON-NLS-1$
	protected static final int RACE10_PILOTS = 16;
	protected static final String RACE11_NAME = "Race 11"; //$NON-NLS-1$
	protected static final String RACE11_DESC = "Luce Bay (20/01/2013)"; //$NON-NLS-1$
	protected static final int RACE11_PILOTS = 16;
	protected static final String RACE12_NAME = "Race 12"; //$NON-NLS-1$
	protected static final String RACE12_DESC = "Luce Bay (20/01/2013)"; //$NON-NLS-1$
	protected static final int RACE12_PILOTS = 16;

	protected static final String EVENT3_NAME = "Race Event 3"; //$NON-NLS-1$
	protected static final String EVENT3_DESC = "West Sands (16/03/2013 and 17/03/2013)"; //$NON-NLS-1$
	protected static final int EVENT3_FLEET = 19;
	protected static final String RACE13_NAME = "Race 13"; //$NON-NLS-1$
	protected static final String RACE13_DESC = "West Sands (17/03/2013)"; //$NON-NLS-1$
	protected static final int RACE13_PILOTS = 18;
	protected static final String RACE14_NAME = "Race 14"; //$NON-NLS-1$
	protected static final String RACE14_DESC = "West Sands (17/03/2013)"; //$NON-NLS-1$
	protected static final int RACE14_PILOTS = 18;
	protected static final String RACE15_NAME = "Race 15"; //$NON-NLS-1$
	protected static final String RACE15_DESC = "West Sands (17/03/2013)"; //$NON-NLS-1$
	protected static final int RACE15_PILOTS = 18;

	protected static final String EVENT4_NAME = "Race Event 4"; //$NON-NLS-1$
	protected static final String EVENT4_DESC = "West Sands (27/04/2013 and 28/04/2013)"; //$NON-NLS-1$
	protected static final int EVENT4_FLEET = 17;
	protected static final String RACE16_NAME = "Race 16"; //$NON-NLS-1$
	protected static final String RACE16_DESC = "West Sands (27/04/2013)"; //$NON-NLS-1$
	protected static final int RACE16_PILOTS = 16;
	protected static final String RACE17_NAME = "Race 17"; //$NON-NLS-1$
	protected static final String RACE17_DESC = "West Sands (27/04/2013)"; //$NON-NLS-1$
	protected static final int RACE17_PILOTS = 16;

	protected static final String EVENT5_NAME = "Race Event 5"; //$NON-NLS-1$
	protected static final String EVENT5_DESC = "West Sands (11/05/2013 and 12/05/2013)"; //$NON-NLS-1$
	protected static final int EVENT5_FLEET = 18;
	protected static final String RACE18_NAME = "Race 18"; //$NON-NLS-1$
	protected static final String RACE18_DESC = "West Sands (11/05/2013)"; //$NON-NLS-1$
	protected static final int RACE18_PILOTS = 17;
	protected static final String RACE19_NAME = "Race 19"; //$NON-NLS-1$
	protected static final String RACE19_DESC = "West Sands (11/05/2013)"; //$NON-NLS-1$
	protected static final int RACE19_PILOTS = 17;
	protected static final String RACE20_NAME = "Race 20"; //$NON-NLS-1$
	protected static final String RACE20_DESC = "West Sands (11/05/2013)"; //$NON-NLS-1$
	protected static final int RACE20_PILOTS = 17;
	protected static final String RACE21_NAME = "Race 21"; //$NON-NLS-1$
	protected static final String RACE21_DESC = "West Sands (12/05/2013)"; //$NON-NLS-1$
	protected static final int RACE21_PILOTS = 17;
	protected static final String RACE22_NAME = "Race 22"; //$NON-NLS-1$
	protected static final String RACE22_DESC = "West Sands (12/05/2013)"; //$NON-NLS-1$
	protected static final int RACE22_PILOTS = 17;
	protected static final String RACE23_NAME = "Race 23"; //$NON-NLS-1$
	protected static final String RACE23_DESC = "West Sands (12/05/2013)"; //$NON-NLS-1$
	protected static final int RACE23_PILOTS = 17;

	protected Class junior;
	protected Class _16inWheel;
	protected Pilot sco018;
	protected Pilot sco060;
	protected Pilot sco076;
	protected Pilot sco081;
	protected Pilot sco087;
	protected Pilot sco100;
	protected Pilot sco116;
	protected Pilot sco117;
	protected Pilot sco153;
	protected Pilot sco156;
	protected Pilot sco158;
	protected Pilot sco159;
	protected Pilot sco179;
	protected Pilot sco200;
	protected Pilot sco315;
	protected Pilot sco320;
	protected Pilot sco467;
	protected Pilot sco528;
	protected Pilot sco561;
	protected Pilot sco666;
	protected Pilot sco777;
	protected Pilot sco808;
	protected Pilot ir027;
	protected Pilot ir053;
	protected Pilot ir075;
	protected Pilot ir085;
	protected Pilot ir181;

	private Series _series;
	private Event _nonEvent1;
	private Event _nonEvent2;
	private Event _event1;
	private Race _race1;
	private Race _race2;
	private Race _race3;
	private Race _race4;
	private Race _race5;
	private Race _race6;
	private Event _event2;
	private Race _race7;
	private Race _race8;
	private Race _race9;
	private Race _race10;
	private Race _race11;
	private Race _race12;
	private Event _event3;
	private Race _race13;
	private Race _race14;
	private Race _race15;
	private Event _event4;
	private Race _race16;
	private Race _race17;
	private Event _event5;
	private Race _race18;
	private Race _race19;
	private Race _race20;
	private Race _race21;
	private Race _race22;
	private Race _race23;

	@Override
	public void createAllData() throws Exception {
		createDatabase();
		createNonEvent1Data();
		createNonEvent2Data();
		createEvent1Races();
		createEvent2Races();
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

			// Create the 2012/13 series
			Series series = new Series(SERIES_NAME);

			// Create classes
			junior = new Class(series, "Junior"); //$NON-NLS-1$
			series.getClasses().add(junior);

			_16inWheel = new Class(series, "16\" Wheel"); //$NON-NLS-1$
			series.getClasses().add(_16inWheel);

			// Add all the pilots
			sco018 = new Pilot(series, "SCO018@2010", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(sco018);

			sco060 = new Pilot(series, "SCO060@2005", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(sco060);

			sco076 = new Pilot(series, "SCO076@2012", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(sco076);

			sco081 = new Pilot(series, "SCO081@2005", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(sco081);

			sco087 = new Pilot(series, "SCO087@2009", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(sco087);

			sco100 = new Pilot(series, "SCO100@2005", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			sco100.getClasses().add(_16inWheel);
			series.getPilots().add(sco100);

			sco116 = new Pilot(series, "SCO116@2010", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			sco116.getClasses().add(junior);
			series.getPilots().add(sco116);

			sco117 = new Pilot(series, "SCO117@2005", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(sco117);

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

			sco200 = new Pilot(series, "SCO200@2006", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(sco200);

			sco315 = new Pilot(series, "SCO315@2011", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			sco315.getClasses().add(_16inWheel);
			series.getPilots().add(sco315);

			sco320 = new Pilot(series, "SCO320@2011", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			sco320.getClasses().add(_16inWheel);
			series.getPilots().add(sco320);

			sco467 = new Pilot(series, "SCO467@2011", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(sco467);

			sco528 = new Pilot(series, "SCO528@2011", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(sco528);

			sco561 = new Pilot(series, "SCO561@2012", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(sco561);

			sco666 = new Pilot(series, "SCO666@2012", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(sco666);

			sco777 = new Pilot(series, "SCO777@2012", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(sco777);

			sco808 = new Pilot(series, "SCO808@2010", Sex.MALE, "Scotland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(sco808);

			ir027 = new Pilot(series, "IR027@2005", Sex.MALE, "Ireland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(ir027);

			ir053 = new Pilot(series, "IR053@2010", Sex.MALE, "Ireland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(ir053);

			ir075 = new Pilot(series, "IR075@2010", Sex.MALE, "Ireland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(ir075);

			ir085 = new Pilot(series, "IR085@2008", Sex.MALE, "Ireland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(ir085);

			ir181 = new Pilot(series, "IR181@2010", Sex.MALE, "Ireland"); //$NON-NLS-1$ //$NON-NLS-2$
			series.getPilots().add(ir181);

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

			attendEvent(nonEvent1, sco060);
			attendEvent(nonEvent1, sco076);
			attendEvent(nonEvent1, sco081);
			attendEvent(nonEvent1, sco100);
			attendEvent(nonEvent1, sco116);
			attendEvent(nonEvent1, sco153);
			attendEvent(nonEvent1, sco156);
			attendEvent(nonEvent1, sco159);
			attendEvent(nonEvent1, sco179);
			attendEvent(nonEvent1, sco200);
			attendEvent(nonEvent1, sco320);
			attendEvent(nonEvent1, sco467);
			attendEvent(nonEvent1, sco528);
			attendEvent(nonEvent1, sco561);
			attendEvent(nonEvent1, sco666);
			attendEvent(nonEvent1, sco777);
			attendEvent(nonEvent1, sco808);

			DatabaseSession.commit();

			_nonEvent1 = nonEvent1;
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
			attendEvent(nonEvent2, sco060);
			attendEvent(nonEvent2, sco076);
			attendEvent(nonEvent2, sco081);
			attendEvent(nonEvent2, sco100);
			attendEvent(nonEvent2, sco116);
			attendEvent(nonEvent2, sco117);
			attendEvent(nonEvent2, sco153);
			attendEvent(nonEvent2, sco156);
			attendEvent(nonEvent2, sco159);
			attendEvent(nonEvent2, sco179);
			attendEvent(nonEvent2, sco200);
			attendEvent(nonEvent2, sco315);
			attendEvent(nonEvent2, sco528);
			attendEvent(nonEvent2, sco561);
			attendEvent(nonEvent2, sco666);
			attendEvent(nonEvent2, sco777);
			attendEvent(nonEvent2, sco808);
			attendEvent(nonEvent2, ir181);

			DatabaseSession.commit();

			_nonEvent2 = nonEvent2;
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
		createRace2Data();
		createRace3Data();
		createRace4Data();
		createRace5Data();
		createRace6Data();
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
			race1.getAttendees().put(sco060, new RaceAttendee(race1, sco060, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco076, new RaceAttendee(race1, sco076, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco081, new RaceAttendee(race1, sco081, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco116, new RaceAttendee(race1, sco116, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco117, new RaceAttendee(race1, sco117, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco153, new RaceAttendee(race1, sco153, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco158, new RaceAttendee(race1, sco158, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco159, new RaceAttendee(race1, sco159, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco179, new RaceAttendee(race1, sco179, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco200, new RaceAttendee(race1, sco200, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco315, new RaceAttendee(race1, sco315, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco528, new RaceAttendee(race1, sco528, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco666, new RaceAttendee(race1, sco666, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(sco777, new RaceAttendee(race1, sco777, RaceAttendee.Type.PILOT));
			RaceAttendee att808 = new RaceAttendee(race1, sco808, RaceAttendee.Type.PILOT);
			att808.getPenalties().add(new Penalty(Penalty.Type.AUTOMATIC, "Hit a mark")); //$NON-NLS-1$
			race1.getAttendees().put(sco808, att808);
			race1.getAttendees().put(ir027, new RaceAttendee(race1, ir027, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(ir053, new RaceAttendee(race1, ir053, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(ir075, new RaceAttendee(race1, ir075, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(ir085, new RaceAttendee(race1, ir085, RaceAttendee.Type.PILOT));
			race1.getAttendees().put(ir181, new RaceAttendee(race1, ir181, RaceAttendee.Type.PILOT));
			race1.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir027)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir075)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir053)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir085)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco777)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco158)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			// 2
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir027)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir075)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir085)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco777)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco158)); //$NON-NLS-1$
			// 3
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir027)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir085)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir075)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco777)); //$NON-NLS-1$
			// 4
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir027)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir085)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			// 5
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir027)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race1.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
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

			Race race2 = new Race(event1, RACE2_NAME, RACE2_DESC);
			event1.getRaces().add(race2);
			race2.getAttendees().put(sco018, new RaceAttendee(race2, sco018, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco060, new RaceAttendee(race2, sco060, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco076, new RaceAttendee(race2, sco076, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco081, new RaceAttendee(race2, sco081, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco116, new RaceAttendee(race2, sco116, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco117, new RaceAttendee(race2, sco117, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco153, new RaceAttendee(race2, sco153, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco158, new RaceAttendee(race2, sco158, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco159, new RaceAttendee(race2, sco159, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco179, new RaceAttendee(race2, sco179, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco200, new RaceAttendee(race2, sco200, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco315, new RaceAttendee(race2, sco315, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco528, new RaceAttendee(race2, sco528, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco666, new RaceAttendee(race2, sco666, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco777, new RaceAttendee(race2, sco777, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(sco808, new RaceAttendee(race2, sco808, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(ir027, new RaceAttendee(race2, ir027, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(ir053, new RaceAttendee(race2, ir053, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(ir075, new RaceAttendee(race2, ir075, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(ir085, new RaceAttendee(race2, ir085, RaceAttendee.Type.PILOT));
			race2.getAttendees().put(ir181, new RaceAttendee(race2, ir181, RaceAttendee.Type.PILOT));
			race2.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir075)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir027)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			// 2
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir075)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir027)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			// 3
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir075)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir027)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			// 4
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir075)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir027)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			// 5
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir075)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			// 6
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir075)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			// 7
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race2.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
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

			Race race3 = new Race(event1, RACE3_NAME, RACE3_DESC);
			event1.getRaces().add(race3);
			race3.getAttendees().put(sco060, new RaceAttendee(race3, sco060, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco076, new RaceAttendee(race3, sco076, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco081, new RaceAttendee(race3, sco081, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco116, new RaceAttendee(race3, sco116, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco117, new RaceAttendee(race3, sco117, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco153, new RaceAttendee(race3, sco153, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco158, new RaceAttendee(race3, sco158, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco159, new RaceAttendee(race3, sco159, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco179, new RaceAttendee(race3, sco179, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco200, new RaceAttendee(race3, sco200, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco315, new RaceAttendee(race3, sco315, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco528, new RaceAttendee(race3, sco528, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco666, new RaceAttendee(race3, sco666, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco777, new RaceAttendee(race3, sco777, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(sco808, new RaceAttendee(race3, sco808, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(ir027, new RaceAttendee(race3, ir027, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(ir053, new RaceAttendee(race3, ir053, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(ir075, new RaceAttendee(race3, ir075, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(ir085, new RaceAttendee(race3, ir085, RaceAttendee.Type.PILOT));
			race3.getAttendees().put(ir181, new RaceAttendee(race3, ir181, RaceAttendee.Type.PILOT));
			race3.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir027)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir085)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir053)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco777)); //$NON-NLS-1$
			// 2
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir027)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco777)); //$NON-NLS-1$
			// 3
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir027)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			// 4
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir027)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			// 5
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir027)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race3.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			raceDAO.persist(race3);

			DatabaseSession.commit();

			_race3 = race3;
		} finally {
			db.endSession();
		}
	}

	protected void createRace4Data() throws Exception {
		createEvent1Data();

		if (_race4 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event1 = eventDAO.find(series, EVENT1_NAME);

			Race race4 = new Race(event1, RACE4_NAME, RACE4_DESC);
			event1.getRaces().add(race4);
			race4.getAttendees().put(sco060, new RaceAttendee(race4, sco060, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco076, new RaceAttendee(race4, sco076, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco081, new RaceAttendee(race4, sco081, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco116, new RaceAttendee(race4, sco116, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco117, new RaceAttendee(race4, sco117, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco153, new RaceAttendee(race4, sco153, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco158, new RaceAttendee(race4, sco158, RaceAttendee.Type.PILOT));
			RaceAttendee att159 = new RaceAttendee(race4, sco159, RaceAttendee.Type.PILOT);
			att159.getPenalties().add(new Penalty(Penalty.Type.AUTOMATIC, "Hit a mark")); //$NON-NLS-1$
			race4.getAttendees().put(sco159, att159);
			race4.getAttendees().put(sco179, new RaceAttendee(race4, sco179, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco200, new RaceAttendee(race4, sco200, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco315, new RaceAttendee(race4, sco315, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco528, new RaceAttendee(race4, sco528, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco666, new RaceAttendee(race4, sco666, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco777, new RaceAttendee(race4, sco777, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(sco808, new RaceAttendee(race4, sco808, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(ir027, new RaceAttendee(race4, ir027, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(ir053, new RaceAttendee(race4, ir053, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(ir075, new RaceAttendee(race4, ir075, RaceAttendee.Type.PILOT));
			race4.getAttendees().put(ir085, new RaceAttendee(race4, ir085, RaceAttendee.Type.PILOT));
			RaceAttendee att181 = new RaceAttendee(race4, ir181, RaceAttendee.Type.PILOT);
			att181.getPenalties().add(new Penalty(Penalty.Type.AUTOMATIC, "Hit a mark")); //$NON-NLS-1$
			race4.getAttendees().put(ir181, att181);
			race4.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir027)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir075)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco777)); //$NON-NLS-1$
			// 2
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir075)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			// 3
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir075)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			// 4
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir075)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			// 5
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			// 6
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race4.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			raceDAO.persist(race4);

			DatabaseSession.commit();

			_race4 = race4;
		} finally {
			db.endSession();
		}
	}

	protected void createRace5Data() throws Exception {
		createEvent1Data();

		if (_race5 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event1 = eventDAO.find(series, EVENT1_NAME);

			Race race5 = new Race(event1, RACE5_NAME, RACE5_DESC);
			event1.getRaces().add(race5);
			race5.getAttendees().put(sco060, new RaceAttendee(race5, sco060, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco076, new RaceAttendee(race5, sco076, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco081, new RaceAttendee(race5, sco081, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco116, new RaceAttendee(race5, sco116, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco117, new RaceAttendee(race5, sco117, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco153, new RaceAttendee(race5, sco153, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco158, new RaceAttendee(race5, sco158, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco159, new RaceAttendee(race5, sco159, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco179, new RaceAttendee(race5, sco179, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco200, new RaceAttendee(race5, sco200, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco315, new RaceAttendee(race5, sco315, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco528, new RaceAttendee(race5, sco528, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco666, new RaceAttendee(race5, sco666, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco777, new RaceAttendee(race5, sco777, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(sco808, new RaceAttendee(race5, sco808, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(ir027, new RaceAttendee(race5, ir027, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(ir053, new RaceAttendee(race5, ir053, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(ir075, new RaceAttendee(race5, ir075, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(ir085, new RaceAttendee(race5, ir085, RaceAttendee.Type.PILOT));
			race5.getAttendees().put(ir181, new RaceAttendee(race5, ir181, RaceAttendee.Type.PILOT));
			race5.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco158)); //$NON-NLS-1$
			// 2
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			// 3
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			// 4
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			// 5
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			// 6
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			// 7
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race5.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			raceDAO.persist(race5);

			DatabaseSession.commit();

			_race5 = race5;
		} finally {
			db.endSession();
		}
	}

	protected void createRace6Data() throws Exception {
		createEvent1Data();

		if (_race6 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event1 = eventDAO.find(series, EVENT1_NAME);

			Race race6 = new Race(event1, RACE6_NAME, RACE6_DESC);
			event1.getRaces().add(race6);
			race6.getAttendees().put(sco060, new RaceAttendee(race6, sco060, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco076, new RaceAttendee(race6, sco076, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco081, new RaceAttendee(race6, sco081, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco116, new RaceAttendee(race6, sco116, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco117, new RaceAttendee(race6, sco117, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco153, new RaceAttendee(race6, sco153, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco158, new RaceAttendee(race6, sco158, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco159, new RaceAttendee(race6, sco159, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco179, new RaceAttendee(race6, sco179, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco200, new RaceAttendee(race6, sco200, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco315, new RaceAttendee(race6, sco315, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco528, new RaceAttendee(race6, sco528, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco666, new RaceAttendee(race6, sco666, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco777, new RaceAttendee(race6, sco777, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(sco808, new RaceAttendee(race6, sco808, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(ir027, new RaceAttendee(race6, ir027, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(ir053, new RaceAttendee(race6, ir053, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(ir075, new RaceAttendee(race6, ir075, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(ir085, new RaceAttendee(race6, ir085, RaceAttendee.Type.PILOT));
			race6.getAttendees().put(ir181, new RaceAttendee(race6, ir181, RaceAttendee.Type.PILOT));
			race6.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco158)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			// 2
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco158)); //$NON-NLS-1$
			// 3
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			// 4
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			// 5
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			// 6
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			// 7
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race6.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			raceDAO.persist(race6);

			DatabaseSession.commit();

			_race6 = race6;
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
		createRace7Data();
		createRace8Data();
		createRace9Data();
		createRace10Data();
		createRace11Data();
		createRace12Data();
	}

	protected void createRace7Data() throws Exception {
		createEvent2Data();

		if (_race7 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event2 = eventDAO.find(series, EVENT2_NAME);

			Race race7 = new Race(event2, RACE7_NAME, RACE7_DESC);
			event2.getRaces().add(race7);
			race7.getAttendees().put(sco018, new RaceAttendee(race7, sco018, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco060, new RaceAttendee(race7, sco060, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco076, new RaceAttendee(race7, sco076, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco081, new RaceAttendee(race7, sco081, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco087, new RaceAttendee(race7, sco087, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco100, new RaceAttendee(race7, sco100, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco116, new RaceAttendee(race7, sco116, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco153, new RaceAttendee(race7, sco153, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco156, new RaceAttendee(race7, sco156, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco159, new RaceAttendee(race7, sco159, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco179, new RaceAttendee(race7, sco179, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco200, new RaceAttendee(race7, sco200, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco315, new RaceAttendee(race7, sco315, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco528, new RaceAttendee(race7, sco528, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco666, new RaceAttendee(race7, sco666, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(sco808, new RaceAttendee(race7, sco808, RaceAttendee.Type.PILOT));
			race7.getAttendees().put(ir181, new RaceAttendee(race7, ir181, RaceAttendee.Type.PILOT));
			race7.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco087)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			// 2
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco087)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			// 3
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco087)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			// 4
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			// 5
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			// 6
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race7.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			raceDAO.persist(race7);

			DatabaseSession.commit();

			_race7 = race7;
		} finally {
			db.endSession();
		}
	}

	protected void createRace8Data() throws Exception {
		createEvent2Data();

		if (_race8 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event2 = eventDAO.find(series, EVENT2_NAME);

			Race race8 = new Race(event2, RACE8_NAME, RACE8_DESC);
			event2.getRaces().add(race8);
			race8.getAttendees().put(sco018, new RaceAttendee(race8, sco018, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco060, new RaceAttendee(race8, sco060, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco076, new RaceAttendee(race8, sco076, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco081, new RaceAttendee(race8, sco081, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco087, new RaceAttendee(race8, sco087, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco100, new RaceAttendee(race8, sco100, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco116, new RaceAttendee(race8, sco116, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco153, new RaceAttendee(race8, sco153, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco156, new RaceAttendee(race8, sco156, RaceAttendee.Type.V_SCORER));
			race8.getAttendees().put(sco159, new RaceAttendee(race8, sco159, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco179, new RaceAttendee(race8, sco179, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco200, new RaceAttendee(race8, sco200, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco315, new RaceAttendee(race8, sco315, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco528, new RaceAttendee(race8, sco528, RaceAttendee.Type.PILOT));
			race8.getAttendees().put(sco666, new RaceAttendee(race8, sco666, RaceAttendee.Type.PILOT));
			RaceAttendee att808 = new RaceAttendee(race8, sco808, RaceAttendee.Type.PILOT);
			att808.getPenalties().add(new Penalty(Penalty.Type.AUTOMATIC, "Hit a mark")); //$NON-NLS-1$
			race8.getAttendees().put(sco808, att808);
			race8.getAttendees().put(ir181, new RaceAttendee(race8, ir181, RaceAttendee.Type.PILOT));
			race8.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco087)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			// 2
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco087)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			// 3
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco087)); //$NON-NLS-1$
			// 4
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			// 5
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			// 6
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race8.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			raceDAO.persist(race8);

			DatabaseSession.commit();

			_race8 = race8;
		} finally {
			db.endSession();
		}
	}

	protected void createRace9Data() throws Exception {
		createEvent2Data();

		if (_race9 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event2 = eventDAO.find(series, EVENT2_NAME);

			Race race9 = new Race(event2, RACE9_NAME, RACE9_DESC);
			event2.getRaces().add(race9);
			race9.getAttendees().put(sco018, new RaceAttendee(race9, sco018, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco060, new RaceAttendee(race9, sco060, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco076, new RaceAttendee(race9, sco076, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco081, new RaceAttendee(race9, sco081, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco087, new RaceAttendee(race9, sco087, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco100, new RaceAttendee(race9, sco100, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco116, new RaceAttendee(race9, sco116, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco153, new RaceAttendee(race9, sco153, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco156, new RaceAttendee(race9, sco156, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco159, new RaceAttendee(race9, sco159, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco179, new RaceAttendee(race9, sco179, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco200, new RaceAttendee(race9, sco200, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco315, new RaceAttendee(race9, sco315, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco528, new RaceAttendee(race9, sco528, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco666, new RaceAttendee(race9, sco666, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(sco808, new RaceAttendee(race9, sco808, RaceAttendee.Type.PILOT));
			race9.getAttendees().put(ir181, new RaceAttendee(race9, ir181, RaceAttendee.Type.PILOT));
			race9.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco087)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			// 2
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco087)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			// 3
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco087)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			// 4
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco087)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			// 5
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			// 6
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race9.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			raceDAO.persist(race9);

			DatabaseSession.commit();

			_race9 = race9;
		} finally {
			db.endSession();
		}
	}

	protected void createRace10Data() throws Exception {
		createEvent2Data();

		if (_race10 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event2 = eventDAO.find(series, EVENT2_NAME);

			Race race10 = new Race(event2, RACE10_NAME, RACE10_DESC);
			event2.getRaces().add(race10);
			race10.getAttendees().put(sco018, new RaceAttendee(race10, sco018, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco060, new RaceAttendee(race10, sco060, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco076, new RaceAttendee(race10, sco076, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco081, new RaceAttendee(race10, sco081, RaceAttendee.Type.V_SCORER));
			race10.getAttendees().put(sco087, new RaceAttendee(race10, sco087, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco100, new RaceAttendee(race10, sco100, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco116, new RaceAttendee(race10, sco116, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco153, new RaceAttendee(race10, sco153, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco156, new RaceAttendee(race10, sco156, RaceAttendee.Type.V_SCORER));
			race10.getAttendees().put(sco159, new RaceAttendee(race10, sco159, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco179, new RaceAttendee(race10, sco179, RaceAttendee.Type.PILOT));
			RaceAttendee att200 = new RaceAttendee(race10, sco200, RaceAttendee.Type.PILOT);
			att200.getPenalties().add(new Penalty(Penalty.Type.AUTOMATIC, "Wrong side of the start line at 5 minute flag")); //$NON-NLS-1$
			race10.getAttendees().put(sco200, att200);
			race10.getAttendees().put(sco315, new RaceAttendee(race10, sco315, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco528, new RaceAttendee(race10, sco528, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco666, new RaceAttendee(race10, sco666, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(sco808, new RaceAttendee(race10, sco808, RaceAttendee.Type.PILOT));
			race10.getAttendees().put(ir181, new RaceAttendee(race10, ir181, RaceAttendee.Type.PILOT));
			race10.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco087)); //$NON-NLS-1$
			// 2
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			// 3
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco087)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			// 4
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			// 5
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco087)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			// 6
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco087)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			// 7
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			// 8
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco087)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			// 9
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco087)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race10.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			raceDAO.persist(race10);

			DatabaseSession.commit();

			_race10 = race10;
		} finally {
			db.endSession();
		}
	}

	protected void createRace11Data() throws Exception {
		createEvent2Data();

		if (_race11 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event2 = eventDAO.find(series, EVENT2_NAME);

			Race race11 = new Race(event2, RACE11_NAME, RACE11_DESC);
			event2.getRaces().add(race11);
			race11.getAttendees().put(sco018, new RaceAttendee(race11, sco018, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco060, new RaceAttendee(race11, sco060, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco076, new RaceAttendee(race11, sco076, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco081, new RaceAttendee(race11, sco081, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco087, new RaceAttendee(race11, sco087, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco100, new RaceAttendee(race11, sco100, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco116, new RaceAttendee(race11, sco116, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco153, new RaceAttendee(race11, sco153, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco156, new RaceAttendee(race11, sco156, RaceAttendee.Type.V_SCORER));
			race11.getAttendees().put(sco159, new RaceAttendee(race11, sco159, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco179, new RaceAttendee(race11, sco179, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco200, new RaceAttendee(race11, sco200, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco315, new RaceAttendee(race11, sco315, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco528, new RaceAttendee(race11, sco528, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco666, new RaceAttendee(race11, sco666, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(sco808, new RaceAttendee(race11, sco808, RaceAttendee.Type.PILOT));
			race11.getAttendees().put(ir181, new RaceAttendee(race11, ir181, RaceAttendee.Type.PILOT));
			race11.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco087)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			// 2
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco087)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			// 3
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco087)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			// 4
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco087)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			// 5
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco087)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			// 6
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco087)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			// 7
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			// 8
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			// 9
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race11.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			raceDAO.persist(race11);

			DatabaseSession.commit();

			_race11 = race11;
		} finally {
			db.endSession();
		}
	}

	protected void createRace12Data() throws Exception {
		createEvent2Data();

		if (_race12 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event2 = eventDAO.find(series, EVENT2_NAME);

			Race race12 = new Race(event2, RACE12_NAME, RACE12_DESC);
			event2.getRaces().add(race12);
			race12.getAttendees().put(sco018, new RaceAttendee(race12, sco018, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco060, new RaceAttendee(race12, sco060, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco076, new RaceAttendee(race12, sco076, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco081, new RaceAttendee(race12, sco081, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco087, new RaceAttendee(race12, sco087, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco100, new RaceAttendee(race12, sco100, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco116, new RaceAttendee(race12, sco116, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco153, new RaceAttendee(race12, sco153, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco156, new RaceAttendee(race12, sco156, RaceAttendee.Type.V_SCORER));
			race12.getAttendees().put(sco159, new RaceAttendee(race12, sco159, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco179, new RaceAttendee(race12, sco179, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco200, new RaceAttendee(race12, sco200, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco315, new RaceAttendee(race12, sco315, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(sco528, new RaceAttendee(race12, sco528, RaceAttendee.Type.PILOT));
			RaceAttendee att666 = new RaceAttendee(race12, sco666, RaceAttendee.Type.PILOT);
			att666.getPenalties().add(new Penalty(Penalty.Type.AUTOMATIC, "Wrong side of the start line at 5 minute flag")); //$NON-NLS-1$
			race12.getAttendees().put(sco666, att666);
			race12.getAttendees().put(sco808, new RaceAttendee(race12, sco808, RaceAttendee.Type.PILOT));
			race12.getAttendees().put(ir181, new RaceAttendee(race12, ir181, RaceAttendee.Type.PILOT));
			race12.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco087)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			// 2
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco087)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			// 3
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco087)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			// 4
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco087)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			// 5
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			// 6
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			// 7
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			// 8
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			// 9
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race12.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			raceDAO.persist(race12);

			DatabaseSession.commit();

			_race12 = race12;
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
		createRace13Data();
		createRace14Data();
		createRace15Data();
	}

	protected void createRace13Data() throws Exception {
		createEvent3Data();

		if (_race13 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event3 = eventDAO.find(series, EVENT3_NAME);

			Race race13 = new Race(event3, RACE13_NAME, RACE13_DESC);
			event3.getRaces().add(race13);
			race13.getAttendees().put(sco018, new RaceAttendee(race13, sco018, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco060, new RaceAttendee(race13, sco060, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco076, new RaceAttendee(race13, sco076, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco081, new RaceAttendee(race13, sco081, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco116, new RaceAttendee(race13, sco116, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco117, new RaceAttendee(race13, sco117, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco153, new RaceAttendee(race13, sco153, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco156, new RaceAttendee(race13, sco156, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco159, new RaceAttendee(race13, sco159, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco179, new RaceAttendee(race13, sco179, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco200, new RaceAttendee(race13, sco200, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco315, new RaceAttendee(race13, sco315, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco320, new RaceAttendee(race13, sco320, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco528, new RaceAttendee(race13, sco528, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco561, new RaceAttendee(race13, sco561, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco666, new RaceAttendee(race13, sco666, RaceAttendee.Type.PILOT));
			race13.getAttendees().put(sco777, new RaceAttendee(race13, sco777, RaceAttendee.Type.PILOT));
			RaceAttendee att808 = new RaceAttendee(race13, sco808, RaceAttendee.Type.PILOT);
			att808.getPenalties().add(new Penalty(Penalty.Type.AUTOMATIC, "Hit a mark")); //$NON-NLS-1$
			race13.getAttendees().put(sco808, att808);
			race13.getAttendees().put(ir181, new RaceAttendee(race13, ir181, RaceAttendee.Type.PILOT));
			race13.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco320)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco153)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco777)); //$NON-NLS-1$
			// 2
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco153)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco320)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			// 3
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco153)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			// 4
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco153)); //$NON-NLS-1$
			// 5
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			// 6
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			// 7
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			// 8
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			// 9
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race13.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			raceDAO.persist(race13);

			DatabaseSession.commit();

			_race13 = race13;
		} finally {
			db.endSession();
		}
	}

	protected void createRace14Data() throws Exception {
		createEvent3Data();

		if (_race14 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event3 = eventDAO.find(series, EVENT3_NAME);

			Race race14 = new Race(event3, RACE14_NAME, RACE14_DESC);
			event3.getRaces().add(race14);
			race14.getAttendees().put(sco018, new RaceAttendee(race14, sco018, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco060, new RaceAttendee(race14, sco060, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco076, new RaceAttendee(race14, sco076, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco081, new RaceAttendee(race14, sco081, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco116, new RaceAttendee(race14, sco116, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco117, new RaceAttendee(race14, sco117, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco153, new RaceAttendee(race14, sco153, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco156, new RaceAttendee(race14, sco156, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco159, new RaceAttendee(race14, sco159, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco179, new RaceAttendee(race14, sco179, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco200, new RaceAttendee(race14, sco200, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco315, new RaceAttendee(race14, sco315, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco320, new RaceAttendee(race14, sco320, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco528, new RaceAttendee(race14, sco528, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco561, new RaceAttendee(race14, sco561, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco666, new RaceAttendee(race14, sco666, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco777, new RaceAttendee(race14, sco777, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(sco808, new RaceAttendee(race14, sco808, RaceAttendee.Type.PILOT));
			race14.getAttendees().put(ir181, new RaceAttendee(race14, ir181, RaceAttendee.Type.PILOT));
			race14.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco561)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco777)); //$NON-NLS-1$
			// 2
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco777)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco561)); //$NON-NLS-1$
			// 3
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco777)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			// 4
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco777)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			// 5
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			// 6
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			// 7
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			// 8
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			// 9
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race14.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			raceDAO.persist(race14);

			DatabaseSession.commit();

			_race14 = race14;
		} finally {
			db.endSession();
		}
	}

	protected void createRace15Data() throws Exception {
		createEvent3Data();

		if (_race15 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event3 = eventDAO.find(series, EVENT3_NAME);

			Race race15 = new Race(event3, RACE15_NAME, RACE15_DESC);
			event3.getRaces().add(race15);
			race15.getAttendees().put(sco018, new RaceAttendee(race15, sco018, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco060, new RaceAttendee(race15, sco060, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco076, new RaceAttendee(race15, sco076, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco081, new RaceAttendee(race15, sco081, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco116, new RaceAttendee(race15, sco116, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco117, new RaceAttendee(race15, sco117, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco153, new RaceAttendee(race15, sco153, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco156, new RaceAttendee(race15, sco156, RaceAttendee.Type.PILOT));
			RaceAttendee att159 = new RaceAttendee(race15, sco159, RaceAttendee.Type.PILOT);
			att159.getPenalties().add(new Penalty(Penalty.Type.AUTOMATIC, "Priority on finish line")); //$NON-NLS-1$
			race15.getAttendees().put(sco159, att159);
			race15.getAttendees().put(sco179, new RaceAttendee(race15, sco179, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco200, new RaceAttendee(race15, sco200, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco315, new RaceAttendee(race15, sco315, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco320, new RaceAttendee(race15, sco320, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco528, new RaceAttendee(race15, sco528, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco561, new RaceAttendee(race15, sco561, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco666, new RaceAttendee(race15, sco666, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco777, new RaceAttendee(race15, sco777, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(sco808, new RaceAttendee(race15, sco808, RaceAttendee.Type.PILOT));
			race15.getAttendees().put(ir181, new RaceAttendee(race15, ir181, RaceAttendee.Type.PILOT));
			race15.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco777)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco153)); //$NON-NLS-1$
			// 2
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco777)); //$NON-NLS-1$
			// 3
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			// 4
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			// 5
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			// 6
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			// 7
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			// 8
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race15.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			raceDAO.persist(race15);

			DatabaseSession.commit();

			_race15 = race15;
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
		createRace16Data();
		createRace17Data();
	}

	protected void createRace16Data() throws Exception {
		createEvent4Data();

		if (_race16 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event4 = eventDAO.find(series, EVENT4_NAME);

			Race race16 = new Race(event4, RACE16_NAME, RACE16_DESC);
			event4.getRaces().add(race16);
			race16.getAttendees().put(sco018, new RaceAttendee(race16, sco018, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco060, new RaceAttendee(race16, sco060, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco076, new RaceAttendee(race16, sco076, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco081, new RaceAttendee(race16, sco081, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco116, new RaceAttendee(race16, sco116, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco117, new RaceAttendee(race16, sco117, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco153, new RaceAttendee(race16, sco153, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco156, new RaceAttendee(race16, sco156, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco159, new RaceAttendee(race16, sco159, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco179, new RaceAttendee(race16, sco179, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco200, new RaceAttendee(race16, sco200, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco315, new RaceAttendee(race16, sco315, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco528, new RaceAttendee(race16, sco528, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco561, new RaceAttendee(race16, sco561, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco777, new RaceAttendee(race16, sco777, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(sco808, new RaceAttendee(race16, sco808, RaceAttendee.Type.PILOT));
			race16.getAttendees().put(ir181, new RaceAttendee(race16, ir181, RaceAttendee.Type.PILOT));
			race16.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco777)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco156)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco153)); //$NON-NLS-1$
			// 2
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco777)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco156)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco153)); //$NON-NLS-1$
			// 3
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco777)); //$NON-NLS-1$
			// 4
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			// 5
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			// 6
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race16.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			raceDAO.persist(race16);

			DatabaseSession.commit();

			_race16 = race16;
		} finally {
			db.endSession();
		}
	}

	protected void createRace17Data() throws Exception {
		createEvent4Data();

		if (_race17 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event4 = eventDAO.find(series, EVENT4_NAME);

			Race race17 = new Race(event4, RACE17_NAME, RACE17_DESC);
			event4.getRaces().add(race17);
			race17.getAttendees().put(sco018, new RaceAttendee(race17, sco018, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco060, new RaceAttendee(race17, sco060, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco076, new RaceAttendee(race17, sco076, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco081, new RaceAttendee(race17, sco081, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco116, new RaceAttendee(race17, sco116, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco117, new RaceAttendee(race17, sco117, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco153, new RaceAttendee(race17, sco153, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco156, new RaceAttendee(race17, sco156, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco159, new RaceAttendee(race17, sco159, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco179, new RaceAttendee(race17, sco179, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco200, new RaceAttendee(race17, sco200, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco315, new RaceAttendee(race17, sco315, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco528, new RaceAttendee(race17, sco528, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco561, new RaceAttendee(race17, sco561, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco777, new RaceAttendee(race17, sco777, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(sco808, new RaceAttendee(race17, sco808, RaceAttendee.Type.PILOT));
			race17.getAttendees().put(ir181, new RaceAttendee(race17, ir181, RaceAttendee.Type.PILOT));
			race17.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco156)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco777)); //$NON-NLS-1$
			// 2
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco156)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			// 3
			race17.getTallies().add(new RaceTally(RaceTally.Type.INVALID_LAP, "", ir181)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco081)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			// 4
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race17.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			raceDAO.persist(race17);

			DatabaseSession.commit();

			_race17 = race17;
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
		createRace18Data();
		createRace19Data();
		createRace20Data();
		createRace21Data();
		createRace22Data();
		createRace23Data();
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
			race18.getAttendees().put(sco018, new RaceAttendee(race18, sco018, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco060, new RaceAttendee(race18, sco060, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco076, new RaceAttendee(race18, sco076, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco100, new RaceAttendee(race18, sco100, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco116, new RaceAttendee(race18, sco116, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco117, new RaceAttendee(race18, sco117, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco153, new RaceAttendee(race18, sco153, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco156, new RaceAttendee(race18, sco156, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco159, new RaceAttendee(race18, sco159, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco179, new RaceAttendee(race18, sco179, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco200, new RaceAttendee(race18, sco200, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco315, new RaceAttendee(race18, sco315, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco528, new RaceAttendee(race18, sco528, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco561, new RaceAttendee(race18, sco561, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco666, new RaceAttendee(race18, sco666, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(sco808, new RaceAttendee(race18, sco808, RaceAttendee.Type.PILOT));
			race18.getAttendees().put(ir181, new RaceAttendee(race18, ir181, RaceAttendee.Type.PILOT));
			race18.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco156)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco153)); //$NON-NLS-1$
			// 2
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco156)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco153)); //$NON-NLS-1$
			// 3
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco156)); //$NON-NLS-1$
			// 4
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			// 5
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			// 6
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			// 7
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race18.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
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
			race19.getAttendees().put(sco018, new RaceAttendee(race19, sco018, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco060, new RaceAttendee(race19, sco060, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco076, new RaceAttendee(race19, sco076, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco100, new RaceAttendee(race19, sco100, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco116, new RaceAttendee(race19, sco116, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco117, new RaceAttendee(race19, sco117, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco153, new RaceAttendee(race19, sco153, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco156, new RaceAttendee(race19, sco156, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco159, new RaceAttendee(race19, sco159, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco179, new RaceAttendee(race19, sco179, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco200, new RaceAttendee(race19, sco200, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco315, new RaceAttendee(race19, sco315, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco528, new RaceAttendee(race19, sco528, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco561, new RaceAttendee(race19, sco561, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco666, new RaceAttendee(race19, sco666, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(sco808, new RaceAttendee(race19, sco808, RaceAttendee.Type.PILOT));
			race19.getAttendees().put(ir181, new RaceAttendee(race19, ir181, RaceAttendee.Type.PILOT));
			race19.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco156)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco153)); //$NON-NLS-1$
			// 2
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco156)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco153)); //$NON-NLS-1$
			// 3
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco156)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco153)); //$NON-NLS-1$
			// 4
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco156)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			// 5
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco156)); //$NON-NLS-1$
			// 6
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			// 7
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race19.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
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
			race20.getAttendees().put(sco018, new RaceAttendee(race20, sco018, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco060, new RaceAttendee(race20, sco060, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco076, new RaceAttendee(race20, sco076, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco100, new RaceAttendee(race20, sco100, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco116, new RaceAttendee(race20, sco116, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco117, new RaceAttendee(race20, sco117, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco153, new RaceAttendee(race20, sco153, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco156, new RaceAttendee(race20, sco156, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco159, new RaceAttendee(race20, sco159, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco179, new RaceAttendee(race20, sco179, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco200, new RaceAttendee(race20, sco200, RaceAttendee.Type.PILOT));
			RaceAttendee att315 = new RaceAttendee(race20, sco315, RaceAttendee.Type.PILOT);
			att315.getPenalties().add(new Penalty(Penalty.Type.AUTOMATIC, "Hit a mark")); //$NON-NLS-1$
			race20.getAttendees().put(sco315, att315);
			race20.getAttendees().put(sco528, new RaceAttendee(race20, sco528, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco561, new RaceAttendee(race20, sco561, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco666, new RaceAttendee(race20, sco666, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(sco808, new RaceAttendee(race20, sco808, RaceAttendee.Type.PILOT));
			race20.getAttendees().put(ir181, new RaceAttendee(race20, ir181, RaceAttendee.Type.PILOT));
			race20.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco156)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco153)); //$NON-NLS-1$
			// 2
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			// 3
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco100)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			// 4
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			// 5
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race20.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			raceDAO.persist(race20);

			DatabaseSession.commit();

			_race20 = race20;
		} finally {
			db.endSession();
		}
	}

	protected void createRace21Data() throws Exception {
		createEvent5Data();

		if (_race21 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event5 = eventDAO.find(series, EVENT5_NAME);

			Race race21 = new Race(event5, RACE21_NAME, RACE21_DESC);
			event5.getRaces().add(race21);
			race21.getAttendees().put(sco018, new RaceAttendee(race21, sco018, RaceAttendee.Type.PILOT));
			race21.getAttendees().put(sco060, new RaceAttendee(race21, sco060, RaceAttendee.Type.PILOT));
			race21.getAttendees().put(sco076, new RaceAttendee(race21, sco076, RaceAttendee.Type.PILOT));
			race21.getAttendees().put(sco116, new RaceAttendee(race21, sco116, RaceAttendee.Type.PILOT));
			race21.getAttendees().put(sco117, new RaceAttendee(race21, sco117, RaceAttendee.Type.PILOT));
			race21.getAttendees().put(sco153, new RaceAttendee(race21, sco153, RaceAttendee.Type.PILOT));
			race21.getAttendees().put(sco156, new RaceAttendee(race21, sco156, RaceAttendee.Type.PILOT));
			race21.getAttendees().put(sco159, new RaceAttendee(race21, sco159, RaceAttendee.Type.PILOT));
			RaceAttendee att179 = new RaceAttendee(race21, sco179, RaceAttendee.Type.PILOT);
			att179.getPenalties().add(new Penalty(Penalty.Type.AUTOMATIC, "Hit a mark")); //$NON-NLS-1$
			race21.getAttendees().put(sco179, att179);
			race21.getAttendees().put(sco200, new RaceAttendee(race21, sco200, RaceAttendee.Type.PILOT));
			race21.getAttendees().put(sco315, new RaceAttendee(race21, sco315, RaceAttendee.Type.PILOT));
			race21.getAttendees().put(sco528, new RaceAttendee(race21, sco528, RaceAttendee.Type.PILOT));
			race21.getAttendees().put(sco561, new RaceAttendee(race21, sco561, RaceAttendee.Type.PILOT));
			race21.getAttendees().put(sco666, new RaceAttendee(race21, sco666, RaceAttendee.Type.PILOT));
			race21.getAttendees().put(sco777, new RaceAttendee(race21, sco777, RaceAttendee.Type.PILOT));
			race21.getAttendees().put(sco808, new RaceAttendee(race21, sco808, RaceAttendee.Type.PILOT));
			race21.getAttendees().put(ir181, new RaceAttendee(race21, ir181, RaceAttendee.Type.PILOT));
			race21.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco156)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco153)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco777)); //$NON-NLS-1$
			// 2
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco156)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco153)); //$NON-NLS-1$
			// 3
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco156)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			// 4
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			// 5
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco528)); //$NON-NLS-1$
			// 6
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race21.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			raceDAO.persist(race21);

			DatabaseSession.commit();

			_race21 = race21;
		} finally {
			db.endSession();
		}
	}

	protected void createRace22Data() throws Exception {
		createEvent5Data();

		if (_race22 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event5 = eventDAO.find(series, EVENT5_NAME);

			Race race22 = new Race(event5, RACE22_NAME, RACE22_DESC);
			event5.getRaces().add(race22);
			race22.getAttendees().put(sco018, new RaceAttendee(race22, sco018, RaceAttendee.Type.PILOT));
			race22.getAttendees().put(sco060, new RaceAttendee(race22, sco060, RaceAttendee.Type.PILOT));
			race22.getAttendees().put(sco076, new RaceAttendee(race22, sco076, RaceAttendee.Type.PILOT));
			race22.getAttendees().put(sco116, new RaceAttendee(race22, sco116, RaceAttendee.Type.PILOT));
			race22.getAttendees().put(sco117, new RaceAttendee(race22, sco117, RaceAttendee.Type.PILOT));
			race22.getAttendees().put(sco153, new RaceAttendee(race22, sco153, RaceAttendee.Type.PILOT));
			race22.getAttendees().put(sco156, new RaceAttendee(race22, sco156, RaceAttendee.Type.PILOT));
			race22.getAttendees().put(sco159, new RaceAttendee(race22, sco159, RaceAttendee.Type.PILOT));
			race22.getAttendees().put(sco179, new RaceAttendee(race22, sco179, RaceAttendee.Type.PILOT));
			race22.getAttendees().put(sco200, new RaceAttendee(race22, sco200, RaceAttendee.Type.PILOT));
			race22.getAttendees().put(sco315, new RaceAttendee(race22, sco315, RaceAttendee.Type.PILOT));
			race22.getAttendees().put(sco528, new RaceAttendee(race22, sco528, RaceAttendee.Type.PILOT));
			race22.getAttendees().put(sco561, new RaceAttendee(race22, sco561, RaceAttendee.Type.PILOT));
			race22.getAttendees().put(sco666, new RaceAttendee(race22, sco666, RaceAttendee.Type.PILOT));
			race22.getAttendees().put(sco777, new RaceAttendee(race22, sco777, RaceAttendee.Type.PILOT));
			race22.getAttendees().put(sco808, new RaceAttendee(race22, sco808, RaceAttendee.Type.PILOT));
			race22.getAttendees().put(ir181, new RaceAttendee(race22, ir181, RaceAttendee.Type.PILOT));
			race22.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco117)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco153)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco777)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			// 2
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco153)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco777)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			// 3
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco777)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco153)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			// 4
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco777)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco153)); //$NON-NLS-1$
			// 5
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco777)); //$NON-NLS-1$
			// 6
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			// 7
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			// 8
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			// 9
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race22.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			raceDAO.persist(race22);

			DatabaseSession.commit();

			_race22 = race22;
		} finally {
			db.endSession();
		}
	}

	protected void createRace23Data() throws Exception {
		createEvent5Data();

		if (_race23 != null) {
			return;
		}

		db.startSession();
		try {
			DatabaseSession.begin();

			Series series = seriesDAO.find(SERIES_NAME);
			Event event5 = eventDAO.find(series, EVENT5_NAME);

			Race race23 = new Race(event5, RACE23_NAME, RACE23_DESC);
			event5.getRaces().add(race23);
			race23.getAttendees().put(sco018, new RaceAttendee(race23, sco018, RaceAttendee.Type.PILOT));
			race23.getAttendees().put(sco060, new RaceAttendee(race23, sco060, RaceAttendee.Type.PILOT));
			race23.getAttendees().put(sco076, new RaceAttendee(race23, sco076, RaceAttendee.Type.PILOT));
			race23.getAttendees().put(sco116, new RaceAttendee(race23, sco116, RaceAttendee.Type.PILOT));
			race23.getAttendees().put(sco117, new RaceAttendee(race23, sco117, RaceAttendee.Type.PILOT));
			RaceAttendee att153 = new RaceAttendee(race23, sco153, RaceAttendee.Type.PILOT);
			att153.getPenalties().add(new Penalty(Penalty.Type.AUTOMATIC, "Hit a mark")); //$NON-NLS-1$
			race23.getAttendees().put(sco153, att153);
			race23.getAttendees().put(sco156, new RaceAttendee(race23, sco156, RaceAttendee.Type.PILOT));
			race23.getAttendees().put(sco159, new RaceAttendee(race23, sco159, RaceAttendee.Type.PILOT));
			race23.getAttendees().put(sco179, new RaceAttendee(race23, sco179, RaceAttendee.Type.PILOT));
			race23.getAttendees().put(sco200, new RaceAttendee(race23, sco200, RaceAttendee.Type.PILOT));
			race23.getAttendees().put(sco315, new RaceAttendee(race23, sco315, RaceAttendee.Type.PILOT));
			race23.getAttendees().put(sco528, new RaceAttendee(race23, sco528, RaceAttendee.Type.PILOT));
			race23.getAttendees().put(sco561, new RaceAttendee(race23, sco561, RaceAttendee.Type.PILOT));
			race23.getAttendees().put(sco666, new RaceAttendee(race23, sco666, RaceAttendee.Type.PILOT));
			race23.getAttendees().put(sco777, new RaceAttendee(race23, sco777, RaceAttendee.Type.PILOT));
			race23.getAttendees().put(sco808, new RaceAttendee(race23, sco808, RaceAttendee.Type.PILOT));
			race23.getAttendees().put(ir181, new RaceAttendee(race23, ir181, RaceAttendee.Type.PILOT));
			race23.getTallies().add(new RaceTally(RaceTally.Type.START));
			// 1
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco777)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco153)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco156)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			// 2
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco777)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco156)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco153)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco315)); //$NON-NLS-1$
			// 3
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco060)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco777)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco156)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco153)); //$NON-NLS-1$
			// 4
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			// 5
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco666)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco159)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco076)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco018)); //$NON-NLS-1$
			// 6
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			// 7
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", ir181)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco179)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco808)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco116)); //$NON-NLS-1$
			race23.getTallies().add(new RaceTally(RaceTally.Type.LAP, "", sco200)); //$NON-NLS-1$
			raceDAO.persist(race23);

			DatabaseSession.commit();

			_race23 = race23;
		} finally {
			db.endSession();
		}
	}
}
