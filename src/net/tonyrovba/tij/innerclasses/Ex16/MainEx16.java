package net.tonyrovba.tij.innerclasses.Ex16;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 24.09.13
 * Time: 19:01
 * To change this template use File | Settings | File Templates.
 */
public class MainEx16 {
    public static void rideACycle(CycleFactory cycleFactory) {
        Cycle cycle = cycleFactory.getCycle();

        cycle.pedal();
    }

    public static void main(String[] args) {
        rideACycle(Unicycle.factory);
        rideACycle(Bicycle.factory);
        rideACycle(Tricycle.factory);
    }
}
