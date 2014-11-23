package net.tonyrovba.tij.interfaces.Ex18;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 24.09.13
 * Time: 18:54
 * To change this template use File | Settings | File Templates.
 */

class Unicycle implements Cycle {
    public void pedal() {
        System.out.println("Unicycle.pedal()");
    }
}

public class UnicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Unicycle();
    }
}
