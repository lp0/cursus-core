/*
	cursus - Race series management program
	Copyright 2011  Simon Arlott

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
package eu.lp0.cursus.ui.component;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import eu.lp0.cursus.db.data.RaceEntity;
import eu.lp0.cursus.i18n.Messages;

public abstract class AbstractDatabaseTab<T extends RaceEntity> extends JPanel implements DatabaseTabSync<T> {
	private final Class<T> clazz;
	protected final DatabaseWindow win;
	private final String messagesKey;

	public AbstractDatabaseTab(Class<T> clazz, DatabaseWindow win, String messagesKey) {
		this.clazz = clazz;
		this.win = win;
		this.messagesKey = messagesKey;

		setBorder(new EmptyBorder(2, 2, 2, 2));
	}

	private String getTitle() {
		return Messages.getString(messagesKey);
	}

	private int getMnemonic() {
		return Messages.getKeyEvent(messagesKey);
	}

	public Class<T> getType() {
		return clazz;
	}

	public void addToTabbedPane(JTabbedPane tabbedPane, int index) {
		assert (SwingUtilities.isEventDispatchThread());

		tabbedPane.insertTab(getTitle(), null, this, null, index);
		tabbedPane.setMnemonicAt(index, getMnemonic());
	}

	public final void updateLocale(JTabbedPane tabbedPane, int index) {
		tabbedPane.setTitleAt(index, getTitle());
		tabbedPane.setMnemonicAt(index, getMnemonic());
	}
}