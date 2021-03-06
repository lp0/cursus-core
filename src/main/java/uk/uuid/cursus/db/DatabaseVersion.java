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
package uk.uuid.cursus.db;

public enum DatabaseVersion {
	_0_0_1;

	public long asLong() {
		String[] ver = name().split("_"); //$NON-NLS-1$
		return (Long.valueOf(ver[1]) << 40) | (Long.valueOf(ver[2]) << 16) | Long.valueOf(ver[3]);
	}

	public static DatabaseVersion getLatest() {
		return values()[values().length - 1];
	}

	public static String parseLong(long ver) {
		return String.format("%d.%d.%d", (ver >> 40), (ver >> 16) & 0xFFFF, ver & 0xFFFF); //$NON-NLS-1$
	}

	@Override
	public String toString() {
		return parseLong(asLong());
	}
}