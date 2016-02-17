package net.tonyrovba.tij.holdingobjects.Ex29;

import java.util.PriorityQueue;

/**
 * Created by arovba on 2/17/16.
 *
 * (2) Create a simple class that inherits from Object and contains no members, and show that you cannot successfully
 *     add multiple elements of that class to a PriorityQueue. This issue will be fully explained
 *     in the Containers in Depth chapter.
 *
 */
public class Ex29Main {
    public static void main(String[] args) {
        PriorityQueue<A> pq = new PriorityQueue<>();

        for (int i = 0; i < 10; i++)
            pq.offer(new A());

        while (pq.peek() != null)
            System.out.println(pq.poll());
    }

    // Exception in thread "main" java.lang.ClassCastException: net.tonyrovba.tij.holdingobjects.Ex29.A cannot be cast to java.lang.Comparable
}
