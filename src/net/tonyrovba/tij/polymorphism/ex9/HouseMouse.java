package net.tonyrovba.tij.polymorphism.ex9;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 12.07.13
 * Time: 7:19
 * To change this template use File | Settings | File Templates.
 */
public class HouseMouse extends Mouse {
    private Shelter shelter;

    public HouseMouse(Shelter shelter) {
        System.out.println("Creating " + this);
        this.shelter = shelter;
        this.shelter.addRef();
    }

    @Override
    public void eat() {
        System.out.println("HouseMouse.eat()");
    }

    @Override
    public void hide() {
        System.out.println("HouseMouse.hide()");
    }

    public String toString() {
        return "HouseMouse";
    }

    public void dispose() {
        System.out.println("Disposing " + this);
        this.shelter.dispose();
    }
}
