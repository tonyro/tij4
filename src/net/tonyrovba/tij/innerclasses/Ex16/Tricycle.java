package net.tonyrovba.tij.innerclasses.Ex16;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 24.09.13
 * Time: 19:00
 * To change this template use File | Settings | File Templates.
 */

public class Tricycle implements Cycle {
    private Tricycle(){}

    public void pedal() {
        System.out.println("Tricycle.pedal()");
    }

    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Tricycle();
        }
    };
}
