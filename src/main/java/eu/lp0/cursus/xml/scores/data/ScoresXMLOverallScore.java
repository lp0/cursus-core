/*
	cursus - Race series management program
	Copyright 2012  Simon Arlott

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
package eu.lp0.cursus.xml.scores.data;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import eu.lp0.cursus.db.data.Penalty;
import eu.lp0.cursus.db.data.Pilot;
import eu.lp0.cursus.db.data.Race;
import eu.lp0.cursus.scoring.data.Scores;
import eu.lp0.cursus.xml.common.AbstractXMLEntity;
import eu.lp0.cursus.xml.scores.ref.ScoresXMLPilotRef;
import eu.lp0.cursus.xml.scores.ref.ScoresXMLRaceDiscard;

@Root(name = "overallScore")
public class ScoresXMLOverallScore implements ScoresXMLPilotRef {
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
			simulatedPenalties = new ArrayList<ScoresXMLPenalty>();
			for (Penalty penalty : simulatedPenalties_) {
				simulatedPenalties.add(new ScoresXMLPenalty(penalty));
			}
		}
	}

	@Attribute
	private String pilot;

	public String getPilot() {
		return pilot;
	}

	public void setPilot(String pilot) {
		this.pilot = pilot;
	}

	@Attribute
	private int penalties;

	public int getPenalties() {
		return penalties;
	}

	public void setPenalties(int penalties) {
		this.penalties = penalties;
	}

	@Attribute
	private int points;

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	@Attribute
	private int position;

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@ElementList(required = false, inline = true)
	private ArrayList<ScoresXMLRaceDiscard> discards;

	public ArrayList<ScoresXMLRaceDiscard> getDiscards() {
		return discards;
	}

	public void setDiscards(ArrayList<ScoresXMLRaceDiscard> discards) {
		this.discards = discards;
	}

	@ElementList(required = false, inline = true)
	private ArrayList<ScoresXMLPenalty> simulatedPenalties;

	public ArrayList<ScoresXMLPenalty> getSimulatedPenalties() {
		return simulatedPenalties;
	}

	public void setSimulatedPenalties(ArrayList<ScoresXMLPenalty> simulatedPenalties) {
		this.simulatedPenalties = simulatedPenalties;
	}
}