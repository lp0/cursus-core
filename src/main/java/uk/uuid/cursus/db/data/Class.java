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

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import uk.uuid.cursus.db.Constants;

import com.google.common.collect.ComparisonChain;

/**
 * Pilot class groupings within series (to segregate race scores)
 */
@Entity(name = "class")
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "series_id", "name" }) })
public final class Class extends AbstractEntity implements Comparable<Class>, NamedEntity {
	private String name;

	Class() {
	}

	public Class(Series series) {
		this(series, "", ""); //$NON-NLS-1$ //$NON-NLS-2$
	}

	public Class(Series series, String name) {
		this(series, name, ""); //$NON-NLS-1$
	}

	public Class(Series series, String name, String description) {
		setSeries(series);
		setName(name);
		setDescription(description);
	}

	@Column(nullable = false, length = Constants.MAX_STRING_LEN)
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

	private Series series;

	@ManyToOne(optional = false)
	@JoinColumn(name = "series_id", nullable = false)
	public Series getSeries() {
		return series;
	}

	public void setSeries(Series series) {
		this.series = series;
	}

	private Set<Pilot> pilots = new HashSet<Pilot>();

	@ManyToMany(mappedBy = "classes")
	public Set<Pilot> getPilots() {
		return pilots;
	}

	public void setPilots(Set<Pilot> pilots) {
		this.pilots = pilots;
	}

	@Override
	public String toString() {
		return getName().length() > 0 ? getName() : "[#" + getId() + "]"; //$NON-NLS-1$ //$NON-NLS-2$;
	}

	@Override
	public int compareTo(Class o) {
		return ComparisonChain.start().compare(getSeries(), o.getSeries()).compare(getName(), o.getName()).result();
	}
}