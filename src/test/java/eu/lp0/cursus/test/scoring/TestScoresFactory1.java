/*
	cursus - Race series management program
	Copyright 2011, 2013  Simon Arlott

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
package eu.lp0.cursus.test.scoring;

import java.math.RoundingMode;

import org.fisly.cursus.scoring.FISLYScoresFactory2010;

import eu.lp0.cursus.scoring.data.RacePointsData;
import eu.lp0.cursus.scoring.data.Scores;
import eu.lp0.cursus.scoring.scores.impl.AveragingRacePointsData;
import eu.lp0.cursus.scoring.scores.impl.GenericRacePointsData;

public class TestScoresFactory1 extends FISLYScoresFactory2010 {
	@Override
	public RacePointsData newRacePointsData(Scores scores) {
		return new AveragingRacePointsData<Scores>(scores, GenericRacePointsData.FleetMethod.RACE, AveragingRacePointsData.AveragingMethod.AFTER_DISCARDS,
				RoundingMode.HALF_UP);
	}
}