package net.tonyrovba.tij.holdingobjects.Ex27;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by tonnur on 2/10/16.
 *
 * (2) Write a class called Command that contains a String and has a
 * method operation( ) that displays the String. Write a second class with a method that fills
 * a Queue with Command objects and returns it. Pass the filled Queue to a method in a
 * third class that consumes the objects in the Queue and calls their operation( ) methods.
 *
 */
public class Ex27Main {
    public static void main(String[] args) {
        Queue<Command> q = new LinkedList<>();

        QueueHandler.operate(QueueHelper.fillQueue(q));
    }
}
