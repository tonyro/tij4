package net.tonyrovba.tij.polymorphism.ex9;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 12.07.13
 * Time: 7:11
 * To change this template use File | Settings | File Templates.
 */
public class Mouse implements Rodent {
    private Shelter shelter;

    protected Mouse() {}

    public Mouse(Shelter shelter) {
        System.out.println("Creating " + this);
        this.shelter = shelter;
        this.shelter.addRef();
    }


    public void eat() {
        System.out.println("Mouse.eat()");
    }


    public void hide() {
        System.out.println("Mouse.hide()");
    }

    public String toString() {
        return "Mouse";
    }

    public void dispose() {
        System.out.println("Disposing " + this);
        this.shelter.dispose();
    }
}
