package net.tonyrovba.tij.polymorphism.ex9;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 12.07.13
 * Time: 7:13
 * To change this template use File | Settings | File Templates.
 */
public class Hamster implements Rodent {
    private Shelter shelter;

    public Hamster(Shelter shelter) {
        System.out.println("Creating " + this);
        this.shelter = shelter;
        this.shelter.addRef();
    }


    public void eat() {
        System.out.println("Hamster.eat()");
    }


    public void hide() {
        System.out.println("Hamster.hide()");
    }

    public String toString() {
        return "Hamster";
    }

    public void dispose() {
        System.out.println("Disposing " + this);
        this.shelter.dispose();
    }
}
