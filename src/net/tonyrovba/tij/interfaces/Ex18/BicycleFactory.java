package net.tonyrovba.tij.interfaces.Ex18;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 24.09.13
 * Time: 18:58
 * To change this template use File | Settings | File Templates.
 */

class Bicycle implements Cycle {
    public void pedal() {
        System.out.println("Bicycle.pedal()");
    }
}

public class BicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Bicycle();
    }
}
