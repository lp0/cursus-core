/*
	cursus - Race series management program
	Copyright 2019  Simon Arlott

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
package org.spka.cursus.test.uk_2019;

import static uk.uuid.cursus.db.data.RaceAttendee.Type.PILOT;
import static uk.uuid.cursus.db.data.Sex.FEMALE;
import static uk.uuid.cursus.db.data.Sex.MALE;

import java.util.Set;

import javax.annotation.Nonnull;

import org.spka.cursus.test.AbstractSPKASeries;

import com.google.common.base.Predicate;
import com.google.common.collect.Sets;

import uk.uuid.cursus.db.data.Event;
import uk.uuid.cursus.db.data.Penalty;
import uk.uuid.cursus.db.data.Penalty.Type;
import uk.uuid.cursus.db.data.Pilot;
import uk.uuid.cursus.db.data.Series;

@SuppressWarnings("nls")
public class UKSeries2019 extends AbstractSPKASeries {
	private String type;

	public UKSeries2019(String type, String desc, String scorer) {
		super("4 Nations Championship 2019 (" + desc + ")", scorer); //$NON-NLS-1$
		this.type = type;
	}

	protected static final int SERIES_FLEET = 19;
	protected static final int SERIES_FLEET_AT_EVENT1 = 17;
	protected static final int SERIES_FLEET_AT_EVENT2 = 19;
	protected static final int SERIES_FLEET_AT_EVENT3 = 19;
	protected static final int SERIES_FLEET_AT_EVENT4 = 19;

	@Override
	public Set<Pilot> getSeriesResultsPilots(final Series series) {
		return Sets.filter(series.getPilots(), new Predicate<Pilot>() {
			@Override
			public boolean apply(@Nonnull Pilot pilot) {
				if (type.equals("d")) {
					return pilot.getClasses().contains(classDAO.find(series, "DP"));
				} else if (type.equals("b")) {
					return pilot.getClasses().contains(classDAO.find(series, "FB"));
				} else if (type.equals("w")) {
					return pilot.getClasses().contains(classDAO.find(series, "16in"));
				}
				return type.equals("a") || type.equals("c") || pilot.getSex().name().charAt(0) == type.toUpperCase().charAt(0);
			}
		});
	}

	@Override
	public Set<Pilot> getSeriesResultsPilots(final Series series, final Event event) {
		return getSeriesResultsPilots(series);
	}

	@Override
	public Set<Pilot> getEventResultsPilots(final Series series, final Event event) {
		return Sets.filter(series.getPilots(), new Predicate<Pilot>() {
			@Override
			public boolean apply(@Nonnull Pilot pilot) {
				if (type.equals("d")) {
					return pilot.getClasses().contains(classDAO.find(series, "DP" + event.getName().substring(event.getName().length() - 1)));
				} else if (type.equals("b")) {
					return pilot.getClasses().contains(classDAO.find(series, "FB" + event.getName().substring(event.getName().length() - 1)));
				} else if (type.equals("w")) {
					return pilot.getClasses().contains(classDAO.find(series, "16in"));
				}
				return type.equals("a") || type.equals("c") || pilot.getSex().name().charAt(0) == type.toUpperCase().charAt(0);
			}
		});
	}

	@Override
	public void createAllData() throws Exception {
		createDatabase();
		createEvent1Races();
		createEvent2Races();
		createEvent3Races();
		createEvent4Races();
	}

	@Override
	public void createDatabase() throws Exception {
		super.createDatabase();

		addSeries();
		addPilot("SCO045@2016", MALE, "Scotland", "DP", "DP1", "DP2", "DP3", "DP4");
		addPilot("SCO066@2013", MALE, "Scotland", "DP", "DP1", "DP2", "DP3", "DP4");
		addPilot("SCO087@2009", MALE, "Scotland", "FB", "FB1", "FB2", "FB3", "FB4");
		addPilot("SCO116@2010", MALE, "Scotland", "DP", "DP1", "DP2", "DP3", "DP4");
		addPilot("SCO156@2010", MALE, "Scotland", "FB", "FB1", "FB2", "FB3", "FB4");
		addPilot("SCO179@2005", MALE, "Scotland", "DP", "DP1", "DP2", "DP3", "DP4");
		addPilot("SCO808@2010", MALE, "Scotland", "DP", "DP1", "DP2", "DP3", "DP4");
		addPilot("K020@2019", MALE, "Scotland", "DP", "DP1", "DP2", "DP3", "DP4");

		addPilot("K040@2017", MALE, "England", "DP", "DP1", "DP2", "DP3", "DP4");
		addPilot("K053@2017", FEMALE, "England", "DP", "DP1", "DP2", "DP3", "DP4");
		addPilot("K060@2017", MALE, "England", "DP", "DP1", "DP2", "DP3", "DP4");
		addPilot("K101@2017", MALE, "England", "DP", "DP1", "DP2", "DP3", "DP4");
		addPilot("K169@2019", MALE, "England", "FB", "FB1", "FB2", "FB3", "FB4");
		addPilot("K171@2019", MALE, "England", "FB", "FB1", "FB2", "FB3", "FB4");
		addPilot("K176@2017", MALE, "England", "FB", "FB1", "FB2", "FB3", "FB4", "16in");
		addPilot("K705@2017", MALE, "England", "DP", "DP1", "DP2", "DP3", "DP4");
		addPilot("K854@2015", MALE, "England", "DP", "DP1", "DP2", "DP3", "DP4");
		addPilot("K862@2019", FEMALE, "England", "DP", "DP1", "DP2", "DP3", "DP4");
		addPilot("K866@2019", MALE, "England", "DP", "DP1", "DP2", "DP3", "DP4");
		addPilot("SW1148@2019", MALE, "England", "FB", "FB1", "FB2", "FB3", "FB4");

		addAlias("SCO066", "SCO004");
		addAlias("SCO116", "SCO001");
		addAlias("SCO179", "SCO002");
		addAlias("SCO808", "SCO003");
		addAlias("K020", "SCO011");
	}

	protected void createEvent1Races() throws Exception {
		addEvent(1, "Luce Bay (05/09/2019)");

		addRace(1, 1, "Luce Bay (05/09/2019)");
		addAttendees(1, 1, PILOT, "SCO045", "SCO066", "SCO116", "SCO156", "SCO179", "SCO808", "K020");
		addAttendees(1, 1, PILOT, "K040", "K053", "K060", "K101", "K169", "K176", "K705", "K854", "K866", "SW1148");
		addPenalty(1, 1, "K176", new Penalty(Type.AUTOMATIC, "Hit mark 2"));
		addPenalty(1, 1, "K176", new Penalty(Type.AUTOMATIC, "Hit mark 8"));
		addLaps(1, 1, "101,1,854,11,866,705,4,40,3,60,2,45,53");
		addLaps(1, 1, "101,854,1,11,705,866,40,3,176,4,2,53,60,156,45");
		addLaps(1, 1, "101,854,1,11,705,866,40,3,2,4,53,60,156");

		addRace(1, 2, "Luce Bay (05/09/2019)");
		addAttendees(1, 2, PILOT, "SCO045", "SCO066", "SCO116", "SCO156", "SCO179", "SCO808", "K020");
		addAttendees(1, 2, PILOT, "K040", "K053", "K060", "K101", "K169", "K176", "K705", "K854", "K866", "SW1148");
		addLaps(1, 2, "101,1,866,854,11,2,3,53,40,4,60,45");
		addLaps(1, 2, "101,156,866,176,11,40,854,3,4,53");
		addLaps(1, 2, "101,866,11,40,854,3,4,60,45,176,156");

		addRace(1, 3, "Luce Bay (05/09/2019)");
		addAttendees(1, 3, PILOT, "SCO045", "SCO066", "SCO116", "SCO156", "SCO179", "SCO808", "K020");
		addAttendees(1, 3, PILOT, "K040", "K053", "K060", "K101", "K169", "K176", "K705", "K854", "K866", "SW1148");
		addLaps(1, 3, "101,1,3,40,11,854,53,866,4,60,156");
		addLaps(1, 3, "101,176,45,1,40,3,11,854,866,2,53,4,60");
		addLaps(1, 3, "101,1,40,854,11,3,866,53,156,4,176,2,45,60");
	}

	protected void createEvent2Races() throws Exception {
		addEvent(2, "Luce Bay (06/09/2019)");

		addRace(2, 4, "Luce Bay (06/09/2019)");
		addAttendees(2, 4, PILOT, "SCO045", "SCO066", "SCO116", "SCO156", "SCO179", "SCO808", "K020");
		addAttendees(2, 4, PILOT, "K040", "K053", "K060", "K101", "K169", "K171", "K176", "K854", "K862", "K866");
		addLaps(2, 4, "101,1,854,40,11,866,3,4,53,45,60");
		addLaps(2, 4, "101,854,1,11,40,866,156,3,4,53");
		addLaps(2, 4, "101,854,1,40,11,866,3,60,53,45,4");
		addLaps(2, 4, "101,854,1,176,156,11,40,866,3,53,4,60,45,169");

		addRace(2, 5, "Luce Bay (06/09/2019)");
		addAttendees(2, 5, PILOT, "SCO045", "SCO066", "SCO116", "SCO156", "SCO179", "SCO808", "K020");
		addAttendees(2, 5, PILOT, "K040", "K053", "K060", "K101", "K169", "K171", "K176", "K854", "K862", "K866");
		addLaps(2, 5, "101,854,1,11,53,40,866,3,2,60,4,45,176,156,169");
		addLaps(2, 5, "101,854,1,866,3");
		addLaps(2, 5, "101,854,45,60,1,156,176,866,169,3,2");
		addLaps(2, 5, "101,11,854,1,45,866,3,176,2,169,60");
	}

	protected void createEvent3Races() throws Exception {
		addEvent(3, "Luce Bay (07/09/2019)");

		addRace(3, 6, "Luce Bay (07/09/2019)");
		addAttendees(3, 6, PILOT, "SCO045", "SCO066", "SCO116", "SCO156", "SCO179", "SCO808", "K020");
		addAttendees(3, 6, PILOT, "K040", "K053", "K060", "K101", "K169", "K171", "K176", "K705", "K854", "K862", "K866");
		addLaps(3, 6, "2,11,101,4,1,866");
		addLaps(3, 6, "101,40,2,854,11,53,3,1,866,176");
		addLaps(3, 6, "101,11,2,3,4,40,1,854,53,866");

		addRace(3, 7, "Luce Bay (07/09/2019)");
		addAttendees(3, 7, PILOT, "SCO045", "SCO066", "SCO116", "SCO156", "SCO179", "SCO808", "K020");
		addAttendees(3, 7, PILOT, "K040", "K053", "K060", "K101", "K169", "K171", "K176", "K705", "K854", "K862", "K866");
		addLaps(3, 7, "854,40,101,1,2,866,11,3,4,53,60");
		addLaps(3, 7, "854,40,101,1,2,11,4,60,866");
		addLaps(3, 7, "854,40,53,101,2,1,11,3,4");
		addLaps(3, 7, "854,40,60,101,2,11,3,4,866,156,53,1,176");

		addRace(3, 8, "Luce Bay (07/09/2019)");
		addAttendees(3, 8, PILOT, "SCO045", "SCO066", "SCO116", "SCO156", "SCO179", "SCO808", "K020");
		addAttendees(3, 8, PILOT, "K040", "K053", "K060", "K101", "K169", "K171", "K176", "K705", "K854", "K862", "K866");
		addLaps(3, 8, "101,1,40,854,866,11,2,4,3,60,53");
		addLaps(3, 8, "101,1,854,45,40,2,866,11,4,60,3,176");
		addLaps(3, 8, "101,1,854,40,2,866,11,4,53,3,45");
		addLaps(3, 8, "101,60,1,854,40,2,866,11,4,3");
		addLaps(3, 8, "101,1,854,53,60,2,40,45,866,11,4,3");
	}

	protected void createEvent4Races() throws Exception {
		addEvent(4, "Luce Bay (08/09/2019)");

		addRace(4, 9, "Luce Bay (08/09/2019)");
		addAttendees(4, 9, PILOT, "SCO045", "SCO066", "SCO087", "SCO116", "SCO156", "SCO179", "SCO808", "K020");
		addAttendees(4, 9, PILOT, "K040", "K053", "K060", "K101", "K169", "K176", "K705", "K854", "K862", "K866");
		addLaps(4, 9, "11,866,60,1,40,101,3,53,176,2,4,45,87");

		addRace(4, 10, "Luce Bay (08/09/2019)");
		addAttendees(4, 10, PILOT, "SCO045", "SCO066", "SCO087", "SCO116", "SCO156", "SCO179", "SCO808", "K020");
		addAttendees(4, 10, PILOT, "K040", "K053", "K060", "K101", "K169", "K176", "K705", "K854", "K862", "K866");
		addLaps(4, 10, "40,101,866,854,11,53,2,4,60,1,3,176,87");
		addLaps(4, 10, "2,40,45,101,866,854,11,53,169,4,1,60,3");
		// addLaps(4, 10, "2");
		addLaps(4, 10, "176,87");
	}
}
