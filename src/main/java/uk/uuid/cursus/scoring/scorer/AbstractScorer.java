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
package uk.uuid.cursus.scoring.scorer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import uk.uuid.cursus.db.data.Event;
import uk.uuid.cursus.db.data.Pilot;
import uk.uuid.cursus.db.data.Race;
import uk.uuid.cursus.db.data.Series;
import uk.uuid.cursus.scoring.data.Scores;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;

public abstract class AbstractScorer implements Scorer {
	@Override
	public Scores scoreSeries(Series series) {
		return scoreSeries(series, Predicates.<Pilot>alwaysTrue());
	}

	@Override
	public Scores scoreSeries(Series series, Predicate<Pilot> fleetFilter) {
		return scoreSeries(series, Sets.filter(series.getPilots(), fleetFilter), fleetFilter);
	}

	@Override
	public Scores scoreSeries(Series series, Set<Pilot> pilots) {
		return scoreSeries(series, pilots, Predicates.<Pilot>alwaysTrue());
	}

	@Override
	public Scores scoreSeries(Series series, Set<Pilot> pilots, Predicate<Pilot> fleetFilter) {
		List<Race> races = new ArrayList<Race>();
		for (Event event : series.getEvents()) {
			races.addAll(event.getRaces());
		}
		return scoreRaces(races, pilots, Sets.newHashSet(series.getEvents()), fleetFilter);
	}

	@Override
	public Scores scoreEvent(Event event) {
		return scoreEvent(event, Predicates.<Pilot>alwaysTrue());
	}

	@Override
	public Scores scoreEvent(Event event, Predicate<Pilot> fleetFilter) {
		return scoreRaces(event.getRaces(), Sets.filter(event.getAllPilots(), fleetFilter), fleetFilter);
	}

	@Override
	public Scores scoreEvent(Event event, Set<Pilot> pilots) {
		return scoreEvent(event, pilots, Predicates.<Pilot>alwaysTrue());
	}

	@Override
	public Scores scoreEvent(Event event, Set<Pilot> pilots, Predicate<Pilot> fleetFilter) {
		return scoreRaces(event.getRaces(), pilots, fleetFilter);
	}

	@Override
	public Scores scoreRace(Race race) {
		return scoreRace(race, Predicates.<Pilot>alwaysTrue());
	}

	@Override
	public Scores scoreRace(Race race, Predicate<Pilot> fleetFilter) {
		return scoreRace(race, Sets.filter(race.getAttendees().keySet(), fleetFilter), fleetFilter);
	}

	@Override
	public Scores scoreRace(Race race, Set<Pilot> pilots) {
		return scoreRace(race, pilots, Predicates.<Pilot>alwaysTrue());
	}

	@Override
	public Scores scoreRace(Race race, Set<Pilot> pilots, Predicate<Pilot> fleetFilter) {
		return scoreRaces(ImmutableList.of(race), pilots, fleetFilter);
	}

	@Override
	public Scores scoreRaces(List<Race> races) {
		return scoreRaces(races, Predicates.<Pilot>alwaysTrue());
	}

	@Override
	public Scores scoreRaces(List<Race> races, Predicate<Pilot> fleetFilter) {
		Set<Pilot> pilots = new HashSet<Pilot>();
		for (Race race : races) {
			pilots.addAll(race.getAttendees().keySet());
		}
		return scoreRaces(races, Sets.filter(pilots, fleetFilter), fleetFilter);
	}

	@Override
	public Scores scoreRaces(List<Race> races, Set<Pilot> pilots) {
		return scoreRaces(races, pilots, Predicates.<Pilot>alwaysTrue());
	}

	@Override
	public Scores scoreRaces(List<Race> races, Set<Pilot> pilots, Predicate<Pilot> fleetFilter) {
		return scoreRaces(races, pilots, Collections.<Event>emptySet(), fleetFilter);
	}

	@Override
	public abstract Scores scoreRaces(List<Race> races, Set<Pilot> pilots, Set<Event> events, Predicate<Pilot> fleetFilter);

	public final String getUUID() {
		return getClass().getAnnotation(ScoringSystem.class).uuid();
	}
}