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
package eu.lp0.cursus.xml.scores.results;

import java.util.ArrayList;
import java.util.Collection;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import eu.lp0.cursus.db.data.Event;
import eu.lp0.cursus.db.data.Race;
import eu.lp0.cursus.scoring.Scores;
import eu.lp0.cursus.xml.ExportReferenceManager;
import eu.lp0.cursus.xml.scores.ref.ScoresXMLEventRef;

@Root(name = "seriesEventResults")
public class ScoresXMLSeriesEventResults {
	public ScoresXMLSeriesEventResults() {
	}

	public ScoresXMLSeriesEventResults(ExportReferenceManager refMgr, Scores scores, Event event, Collection<Race> races) {
		this.event = refMgr.get(event);

		this.raceResults = new ArrayList<ScoresXMLEventRaceResults>(races.size());
		for (Race race : races) {
			this.raceResults.add(new ScoresXMLEventRaceResults(refMgr, scores, race));
		}
	}

	@Element
	private ScoresXMLEventRef event;

	public ScoresXMLEventRef getEvent() {
		return event;
	}

	public void setEvent(ScoresXMLEventRef event) {
		this.event = event;
	}

	@ElementList
	private ArrayList<ScoresXMLEventRaceResults> raceResults;

	public ArrayList<ScoresXMLEventRaceResults> getRaceResults() {
		return raceResults;
	}

	public void setRaceResults(ArrayList<ScoresXMLEventRaceResults> raceResults) {
		this.raceResults = raceResults;
	}
}