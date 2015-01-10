package net.tonyrovba.tij.holdingobjects.Ex1;

/**
 * Created by tonyr on 2/6/14.
 */
public class Gerbil {

    private int gerbilNumber = 0;
    private static int count;

    public Gerbil() {
        gerbilNumber = ++count;
    }

    public void hop() {
        System.out.println("Gerbil " + gerbilNumber + " hops!");
    }
}
