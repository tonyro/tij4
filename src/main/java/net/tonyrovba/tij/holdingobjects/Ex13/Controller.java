package net.tonyrovba.tij.holdingobjects.Ex13;

/**
 * Created by tonyr on 2/4/14.
 */

import java.util.*;

class Controller {
    // A class from java.util to hold Event objects:
    private LinkedList<Event> eventList = new LinkedList<Event>();

    void addEvent(Event c) { eventList.add(c); }

    void run() {
        // Making a copy of eventList so that we do not modify initial list
        LinkedList<Event> eventsListCopy = new LinkedList<>(eventList);
        ListIterator<Event> it = eventsListCopy.listIterator();
        while (it.hasNext()) {
            Event e = it.next();
            if(e.ready()) {
                System.out.println(e);
                e.action();
                it.remove();
            }
        }
    }
}
