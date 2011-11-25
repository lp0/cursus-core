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
package eu.lp0.cursus.ui.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import eu.lp0.cursus.db.dao.EventDAO;
import eu.lp0.cursus.db.data.Event;
import eu.lp0.cursus.db.data.Race;
import eu.lp0.cursus.ui.component.DatabaseWindow;
import eu.lp0.cursus.ui.component.Displayable;
import eu.lp0.cursus.ui.event.EventDetailDialog;
import eu.lp0.cursus.ui.race.RaceDetailDialog;
import eu.lp0.cursus.util.Constants;
import eu.lp0.cursus.util.Messages;

public class EventPopupMenu extends AbstractNamedEntityPopupMenu<Event> implements ActionListener {
	private JMenuItem mnuNewRace;
	private JMenuItem mnuEditEvent;
	private JMenuItem mnuDeleteEvent;
	private JSeparator mnuSeparator1;
	private JMenuItem mnuNewEvent;

	private static final EventDAO eventDAO = new EventDAO();

	public enum Command {
		NEW_RACE, EDIT_EVENT, DELETE_EVENT, NEW_EVENT;
	}

	public EventPopupMenu(DatabaseWindow win, Event event) {
		super(win, event);

		mnuNewRace = new JMenuItem(Messages.getString("menu.race.new")); //$NON-NLS-1$
		mnuNewRace.setActionCommand(Command.NEW_RACE.toString());
		mnuNewRace.addActionListener(this);
		add(mnuNewRace);

		mnuEditEvent = new JMenuItem(Messages.getString("menu.event.edit")); //$NON-NLS-1$
		mnuEditEvent.setActionCommand(Command.EDIT_EVENT.toString());
		mnuEditEvent.addActionListener(this);
		add(mnuEditEvent);

		mnuDeleteEvent = new JMenuItem(Messages.getString("menu.event.delete")); //$NON-NLS-1$
		mnuDeleteEvent.setActionCommand(Command.DELETE_EVENT.toString());
		mnuDeleteEvent.addActionListener(this);
		add(mnuDeleteEvent);

		mnuSeparator1 = new JSeparator();
		add(mnuSeparator1);

		mnuNewEvent = new JMenuItem(Messages.getString("menu.event.new")); //$NON-NLS-1$
		mnuNewEvent.setActionCommand(Command.NEW_EVENT.toString());
		mnuNewEvent.addActionListener(this);
		add(mnuNewEvent);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		doCommand(Command.valueOf(ae.getActionCommand()));
	}

	public void doCommand(Command cmd) {
		Displayable dialog = null;

		switch (cmd) {
		case NEW_RACE:
			dialog = new RaceDetailDialog(win, item.getName() + Constants.EN_DASH + Messages.getString("menu.race.new"), new Race(item), false); //$NON-NLS-1$
			break;
		case EDIT_EVENT:
			dialog = new EventDetailDialog(win, Messages.getString("menu.event.edit") + Constants.EN_DASH + item.getName(), item, true); //$NON-NLS-1$
			break;
		case DELETE_EVENT:
			confirmDelete("menu.event.delete"); //$NON-NLS-1$
			break;
		case NEW_EVENT:
			dialog = new EventDetailDialog(win, item.getName() + Constants.EN_DASH + Messages.getString("menu.event.new"), new Event(item.getSeries()), false); //$NON-NLS-1$
			break;
		}

		if (dialog != null) {
			dialog.display();
		}
	}

	@Override
	protected void doDelete() {
		Event event = eventDAO.get(item);
		event.getSeries().getEvents().remove(event);
	}

	@Override
	protected void doRefresh() {
		win.refreshRaceList();
	}
}