package net.tonyrovba.tij.polymorphism.ex13;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 03.08.13
 * Time: 23:04
 * To change this template use File | Settings | File Templates.
 */
class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared() {
        System.out.println("Creating " + this);
    }

    public void addRef() { refcount++; }
    protected void dispose() {
        System.out.println("Disposing " + this);
    }
    public String toString() { return "Shared " + id; }

    protected void finalize() {
        if(--refcount == 0)
            this.dispose();
        else
            System.out.println("Still got reference");
    }
}
class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose() {
        System.out.println("disposing " + this);
        shared.finalize();
    }
    public String toString() { return "Composing " + id; }
}
public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = { new Composing(shared),
                new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared) };
        for(Composing c : composing)
            c.dispose();
    }
}