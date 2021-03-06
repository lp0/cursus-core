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
package uk.uuid.cursus.db.data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

import uk.uuid.cursus.db.Constants;

/**
 * Race series
 */
@Entity(name = "series")
public final class Series extends AbstractEntity implements Comparable<Series>, RaceEntity {
	public Series() {
		this("", ""); //$NON-NLS-1$ //$NON-NLS-2$
	}

	public Series(String name) {
		this(name, ""); //$NON-NLS-1$
	}

	public Series(String name, String description) {
		setName(name);
		setDescription(description);
	}

	private String name;

	@Column(nullable = false, unique = true, length = Constants.MAX_STRING_LEN)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String description;

	@Column(nullable = false, length = Constants.MAX_STRING_LEN)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private List<Event> events = new ArrayList<Event>();

	// Should be bidirectional, but Hibernate refuse to fix HHH-5390
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "series_id", nullable = false)
	@OrderColumn(name = "series_order", nullable = false)
	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	private Set<Pilot> pilots = new HashSet<Pilot>();

	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "series", orphanRemoval = true)
	public Set<Pilot> getPilots() {
		return pilots;
	}

	public void setPilots(Set<Pilot> pilots) {
		this.pilots = pilots;
	}

	private Set<RaceNumber> raceNumbers = new HashSet<RaceNumber>();

	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "series", orphanRemoval = true)
	public Set<RaceNumber> getRaceNumbers() {
		return raceNumbers;
	}

	public void setRaceNumbers(Set<RaceNumber> raceNumbers) {
		this.raceNumbers = raceNumbers;
	}

	private Set<Class> classes = new HashSet<Class>();

	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "series", orphanRemoval = true)
	public Set<Class> getClasses() {
		return classes;
	}

	public void setClasses(Set<Class> classes) {
		this.classes = classes;
	}

	@Override
	public String toString() {
		return getName().length() > 0 ? getName() : "[#" + getId() + "]"; //$NON-NLS-1$ //$NON-NLS-2$ 
	}

	@Override
	public int compareTo(Series o) {
		return getName().compareTo(o.getName());
	}
}