package net.tonyrovba.tij.innerclasses.Ex16;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 24.09.13
 * Time: 18:58
 * To change this template use File | Settings | File Templates.
 */

public class Bicycle implements Cycle {

    private Bicycle(){}

    public void pedal() {
        System.out.println("Bicycle.pedal()");
    }

    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Bicycle();
        }
    };
}
