package net.tonyrovba.tij.polymorphism.ex9;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 07.08.13
 * Time: 22:06
 * To change this template use File | Settings | File Templates.
 */
public class Shelter {
    private int refCount = 0;
    private static long counter = 0;
    private static long id = counter++;

    public Shelter() {
        System.out.println("Creating " + this);
    }

    public String toString() {
        return "Shelter" + id;
    }

    public void addRef() { refCount++; }

    public void dispose() {
        if(--refCount == 0) {
            System.out.println("Disposing " + this);
        }
        else
            System.out.println("Still got reference");
    }
}
