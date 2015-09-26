package net.tonyrovba.tij.polymorphism.ex1;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 11.07.13
 * Time: 13:24
 * To change this template use File | Settings | File Templates.
 */


class Cycle {

    public void drive() {
        System.out.println("Cycle.drive()");
    }

    public int wheels() { return 0; }
}

class Unicycle extends Cycle {
    @Override
    public void drive() {
        System.out.println("Unicycle.drive()");
    }

    public int wheels() { return 1; }

    public void balance() {
        System.out.println("Unicycle.balance()");
    }
}

class Bicycle extends Cycle {
    @Override
    public void drive() {
        System.out.println("Bicycle.drive()");
    }

    public void stop() {
        System.out.println("Bicycle.stop()");
    }

    public int wheels() { return 2; }

    public void balance() {
        System.out.println("Bicycle.balance()");
    }
}

class Tricycle extends Cycle {
    @Override
    public void drive() {
        System.out.println("Tricycle.drive()");
    }

    public int wheels() { return 3; }
}

public class Driving {

    public static void ride(Cycle cycle) {
        cycle.drive();
        System.out.println("Number of wheels: " + cycle.wheels());
    }

    public static void main(String[] args) {
        /*Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        Cycle c = new Bicycle();

        ride(unicycle);
        ride(bicycle);
        ride(tricycle);
        ride(c);*/

        Cycle[] cycles = {  new Unicycle(),
                            new Bicycle(),
                            new Tricycle() };

        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
        //((Unicycle)cycles[2]).balance(); -- ClassCastException
    }
}
