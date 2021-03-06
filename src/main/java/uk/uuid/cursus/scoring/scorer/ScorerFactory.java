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

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.uuid.cursus.util.ReflectionsUtil;

import com.google.common.collect.ImmutableMap;

public class ScorerFactory {
	private static final Map<String, Class<? extends Scorer>> scoringSystems;
	private static final Logger log = LoggerFactory.getLogger(ScorerFactory.class);

	static {
		Map<String, Class<? extends Scorer>> map = new HashMap<String, Class<? extends Scorer>>();
		for (Class<? extends Scorer> clazz : ReflectionsUtil.getInstance().getSubTypesOf(Scorer.class)) {
			try {
				clazz.getConstructor();
			} catch (SecurityException e) {
				log.error("Cannot find no arguments constructor for " + clazz, e); //$NON-NLS-1$
				continue;
			} catch (NoSuchMethodException e) {
				log.error("Cannot find no arguments constructor for " + clazz, e); //$NON-NLS-1$
				continue;
			}

			ScoringSystem scoringSystem = clazz.getAnnotation(ScoringSystem.class);
			if (scoringSystem != null) {
				if (map.containsKey(scoringSystem.uuid())) {
					log.warn("Duplicate scoring system " + clazz + " as " + scoringSystem.uuid() + " ignored"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				} else {
					map.put(scoringSystem.uuid(), clazz);
					log.info("Registered scoring system " + clazz + " as " + scoringSystem.uuid()); //$NON-NLS-1$ //$NON-NLS-2$
				}
			}
		}
		scoringSystems = ImmutableMap.copyOf(map);
	}

	public static Scorer newScorer(String uuid) {
		Class<? extends Scorer> scorer = scoringSystems.get(uuid);
		if (scorer != null) {
			try {
				return Scorer.class.cast(scorer.newInstance());
			} catch (InstantiationException e) {
				log.error("Cannot instantiate " + uuid, e); //$NON-NLS-1$
				return null;
			} catch (IllegalAccessException e) {
				log.error("Cannot instantiate " + uuid, e); //$NON-NLS-1$
				return null;
			} catch (ClassCastException e) {
				log.error("Cannot instantiate " + uuid, e); //$NON-NLS-1$
				return null;
			}
		} else {
			log.error("Cannot find " + uuid); //$NON-NLS-1$
			return null;
		}
	}
}