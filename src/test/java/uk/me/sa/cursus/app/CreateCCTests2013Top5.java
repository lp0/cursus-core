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
import org.spka.cursus.test.cc_2013.AbstractSeries2013Top5;

public class CreateCCTests2013Top5 {
	@Ignore
	public static class AllScores extends AbstractSeries2013Top5 {
		@SuppressWarnings("nls")
		public AllScores() throws Exception {
			createDatabase();
			CreateSPKATests create = new CreateSPKATests(db, "cc_2013", "Series2013Top5", SERIES_NAME, scorer);

			createEvent1Races();
			create.generate("Series2013Top5Event1Scores");
			createEvent2Races();
			create.generate("Series2013Top5Event2Scores");
		}
	}

	public static void main(String[] args) throws Exception {
		new AllScores();
	}
}