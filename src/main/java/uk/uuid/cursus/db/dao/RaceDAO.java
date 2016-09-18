/*
	cursus - Race series management program
	Copyright 2011, 2014  Simon Arlott

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
package uk.uuid.cursus.db.dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import uk.uuid.cursus.db.data.Event;
import uk.uuid.cursus.db.data.Race;

import com.google.common.collect.ObjectArrays;

public class RaceDAO extends NamedEntityDAO<Race> {
	public RaceDAO() {
		super(Race.class);
	}

	public Race find(Event event, String name) {
		EntityManager em = getEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();

		CriteriaQuery<Race> q = cb.createQuery(Race.class);
		Root<Race> r = q.from(Race.class);
		q.select(r);
		q.where(cb.equal(r.get("event"), event)); //$NON-NLS-1$
		q.where(cb.equal(r.get("name"), name)); //$NON-NLS-1$

		TypedQuery<Race> tq = em.createQuery(q);
		return tq.getSingleResult();
	}

	@Override
	protected Predicate[] withParentRestriction(CriteriaBuilder cb, Root<Race> r, Race race, Predicate... predicates) {
		return ObjectArrays.concat(predicates, cb.equal(r.get("event"), race.getEvent())); //$NON-NLS-1$
	}
}