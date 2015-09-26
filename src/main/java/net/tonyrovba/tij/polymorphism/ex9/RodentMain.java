package net.tonyrovba.tij.polymorphism.ex9;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 12.07.13
 * Time: 7:14
 * To change this template use File | Settings | File Templates.
 */
public class RodentMain {

    public static void testRodent(Rodent[] rodents) {
        for(Rodent r : rodents) {
            System.out.println("------------------------------------------");
            r.eat();
            r.hide();
        }
    }

    public static void main(String[] args) {
        Shelter hole = new Shelter();
        Rodent[] rodents = { new Mouse(hole),
                             new Hamster(hole),
                             new HouseMouse(hole)};

        testRodent(rodents);

        System.out.println("------------------------------------------");

        for(Rodent r : rodents)
            r.dispose();
    }
}
