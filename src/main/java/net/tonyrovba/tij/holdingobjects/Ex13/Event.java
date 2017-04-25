package net.tonyrovba.tij.holdingobjects.Ex13;

/**
 * Created by tonyr on 2/4/14.
 */
public abstract class Event {
    private long eventTime;
    final long delayTime;
    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }
    void start() { // Allows restarting
        eventTime = System.nanoTime() + delayTime;
    }
    boolean ready() {
        return System.nanoTime() >= eventTime;
    }
    public abstract void action();
}