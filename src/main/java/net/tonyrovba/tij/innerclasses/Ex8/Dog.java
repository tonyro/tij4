package net.tonyrovba.tij.innerclasses.Ex8;

/**
 * Created by Anton on 10.09.2014.
 */
public class Dog {

    class Owner {
        private String name = "Joe Doe";

        private void feed() {
            System.out.println("Yummi!!!");
        }
    }

    public void askFood() {
        Owner master = new Owner();
        System.out.println("Hey, " + master.name + "! Give some food!");

        master.feed();
    }
}
