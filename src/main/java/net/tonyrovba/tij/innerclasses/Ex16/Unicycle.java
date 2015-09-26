package net.tonyrovba.tij.innerclasses.Ex16;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 24.09.13
 * Time: 18:54
 * To change this template use File | Settings | File Templates.
 */

public class Unicycle implements Cycle {
    private Unicycle() {}

    public void pedal() {
        System.out.println("Unicycle.pedal()");
    }

    public static CycleFactory factory = new CycleFactory() {
        public Cycle getCycle() {
            return new Unicycle();
        }
    };
}
