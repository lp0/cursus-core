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
package uk.uuid.cursus.db.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import uk.uuid.cursus.db.InvalidDatabaseException;
import uk.uuid.cursus.db.TooManyCursusRowsException;
import uk.uuid.cursus.db.data.Cursus;

public class CursusDAO extends AbstractEntityDAO<Cursus> {
	public CursusDAO() {
		super(Cursus.class);
	}

	public Cursus findSingleton() throws InvalidDatabaseException {
		EntityManager em = getEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();

		CriteriaQuery<Cursus> q = cb.createQuery(Cursus.class);
		Root<Cursus> c = q.from(Cursus.class);
		q.select(c);

		TypedQuery<Cursus> tq = em.createQuery(q);
		List<Cursus> rs = tq.getResultList();

		if (rs.size() > 1) {
			throw new TooManyCursusRowsException(rs.size());
		}

		return rs.isEmpty() ? null : rs.get(0);
	}
}