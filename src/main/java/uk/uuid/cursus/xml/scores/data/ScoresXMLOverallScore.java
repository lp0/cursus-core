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
package uk.uuid.cursus.xml.scores.data;

import java.util.ArrayList;
import java.util.List;

import uk.uuid.cursus.db.data.Penalty;
import uk.uuid.cursus.db.data.Pilot;
import uk.uuid.cursus.db.data.Race;
import uk.uuid.cursus.scoring.data.Scores;
import uk.uuid.cursus.xml.common.AbstractXMLEntity;
import uk.uuid.cursus.xml.data.entity.DataXMLPenalty;
import uk.uuid.cursus.xml.data.ref.DataXMLPilotRef;
import uk.uuid.cursus.xml.scores.ref.ScoresXMLRaceDiscard;

public class ScoresXMLOverallScore implements DataXMLPilotRef {
	public ScoresXMLOverallScore() {
	}

	public ScoresXMLOverallScore(Scores scores, Pilot pilot) {
		this.pilot = AbstractXMLEntity.generateId(pilot);

		penalties = scores.getOverallPenalties(pilot);
		points = scores.getOverallPoints(pilot);
		position = scores.getOverallPosition(pilot);

		if (scores.getDiscardCount() > 0) {
			discards = new ArrayList<ScoresXMLRaceDiscard>(scores.getDiscardCount());
			for (Race race : scores.getDiscardedRaces(pilot)) {
				discards.add(new ScoresXMLRaceDiscard(race));
			}
		}

		List<Penalty> simulatedPenalties_ = scores.getSimulatedOverallPenalties(pilot);
		if (!simulatedPenalties_.isEmpty()) {
			simulatedPenalties = new ArrayList<DataXMLPenalty>();
			for (Penalty penalty : simulatedPenalties_) {
				simulatedPenalties.add(new DataXMLPenalty(penalty));
			}
		}
	}

	private String pilot;

	public String getPilot() {
		return pilot;
	}

	public void setPilot(String pilot) {
		this.pilot = pilot;
	}

	private int penalties;

	public int getPenalties() {
		return penalties;
	}

	public void setPenalties(int penalties) {
		this.penalties = penalties;
	}

	private int points;

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	private int position;

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	private ArrayList<ScoresXMLRaceDiscard> discards;

	public ArrayList<ScoresXMLRaceDiscard> getDiscards() {
		return discards;
	}

	public void setDiscards(ArrayList<ScoresXMLRaceDiscard> discards) {
		this.discards = discards;
	}

	private ArrayList<DataXMLPenalty> simulatedPenalties;

	public ArrayList<DataXMLPenalty> getSimulatedPenalties() {
		return simulatedPenalties;
	}

	public void setSimulatedPenalties(ArrayList<DataXMLPenalty> simulatedPenalties) {
		this.simulatedPenalties = simulatedPenalties;
	}
}