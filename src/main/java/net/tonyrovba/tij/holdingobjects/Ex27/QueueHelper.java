package net.tonyrovba.tij.holdingobjects.Ex27;

import java.util.Queue;

/**
 * Created by tonnur on 2/10/16.
 */
public class QueueHelper {
    private static final int COUNT = 6;

    public static Queue<Command> fillQueue(Queue<Command> queue) {
        for (int i = 0; i < COUNT; i++)
            queue.offer(new Command("String_" + i));

        return queue;
    }
}
