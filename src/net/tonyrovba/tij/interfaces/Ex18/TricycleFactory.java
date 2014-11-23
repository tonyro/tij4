package net.tonyrovba.tij.interfaces.Ex18;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 24.09.13
 * Time: 19:00
 * To change this template use File | Settings | File Templates.
 */

class Tricycle implements Cycle {
    public void pedal() {
        System.out.println("Tricycle.pedal()");
    }
}

public class TricycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Tricycle();
    }
}
