package net.tonyrovba.tij.interfaces.Ex18;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 24.09.13
 * Time: 19:01
 * To change this template use File | Settings | File Templates.
 */
public class MainEx18 {
    public static void rideACycle(CycleFactory cycleFactory) {
        Cycle cycle = cycleFactory.getCycle();

        cycle.pedal();
    }

    public static void main(String[] args) {
        rideACycle(new UnicycleFactory());
        rideACycle(new BicycleFactory());
        rideACycle(new TricycleFactory());
    }
}
