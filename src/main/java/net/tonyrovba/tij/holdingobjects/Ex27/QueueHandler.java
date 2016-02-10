package net.tonyrovba.tij.holdingobjects.Ex27;

import java.util.Queue;

/**
 * Created by tonnur on 2/10/16.
 */
public class QueueHandler {
    public static void operate(Queue<Command> queue) {
        while (queue.peek() != null) {
            queue.remove().operation();
        }
    }
}
