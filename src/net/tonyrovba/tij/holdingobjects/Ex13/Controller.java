package net.tonyrovba.tij.holdingobjects.Ex13;

/**
 * Created by tonyr on 2/4/14.
 */

import java.util.*;

public class Controller {
    // A class from java.util to hold Event objects:
    private LinkedList<Event> eventList = new LinkedList<Event>();

    public void addEvent(Event c) { eventList.add(c); }

    public void run() {
        ListIterator<Event> it = eventList.listIterator();
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
