/*
	cursus - Race series management program
	Copyright 2014  Simon Arlott

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
package uk.me.sa.cursus.app;

import org.junit.Ignore;
import org.spka.cursus.test.series_2009.AbstractSeries2009;

public class CreateSPKATests2009 {
	@Ignore
	public static class AllScores extends AbstractSeries2009 {
		@SuppressWarnings("nls")
		public AllScores() throws Exception {
			createDatabase();
			CreateSPKATests create = new CreateSPKATests(db, "series_2009", "Series2009", SERIES_NAME, scorer);

			createEvent1Races();
			create.generate("Series2009Event1Scores");
			createEvent2Races();
			create.generate("Series2009Event2Scores");
			createEvent3Races();
			create.generate("Series2009Event3Scores");
			createEvent4Races();
			create.generate("Series2009Event4Scores");
		}
	}

	public static void main(String[] args) throws Exception {
		new AllScores();
	}
}
