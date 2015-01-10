package net.tonyrovba.tij.polymorphism.ex11;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 12.07.13
 * Time: 7:51
 *
 * Changed during Exercise 8 of chapter Interfaces
 */
class Meal {
    Meal() { System.out.println("Meal()"); }
}

class Bread {
    Bread() { System.out.println("Bread()"); }
}

class Cheese {
    Cheese() { System.out.println("Cheese()"); }
}

class Lettuce {
    Lettuce() { System.out.println("Lettuce()"); }
}

class Pickle {
    Pickle() { System.out.println("Pickle()"); }
}

class Lunch extends Meal {
    Lunch() { System.out.println("Lunch()"); }
}

class PortableLunch extends Lunch {
    PortableLunch() { System.out.println("PortableLunch()");}
}

public class Sandwich extends PortableLunch implements FastFood{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();
//    public Sandwich() { System.out.println("Sandwich()"); }

    public void makeMeal() { System.out.println("Sandwich.makeMeal()"); }

    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        sandwich.makeMeal();
    }
}
