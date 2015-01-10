package net.tonyrovba.tij.holdingobjects.Ex10;

import net.tonyrovba.tij.polymorphism.ex9.*;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by tonyr on 2/12/14.
 */
public class Ex10Main {

    public static void testRodent(Iterator<Rodent> iterator) {
        Rodent rodent;
        while (iterator.hasNext()) {
            System.out.println("------------------------------------------");
            rodent = iterator.next();
            rodent.eat();
            rodent.hide();
        }
    }

    public static void main(String[] args) {
        Shelter hole = new Shelter();
        ArrayList<Rodent> rodents = new ArrayList<Rodent>();

        rodents.add(new Hamster(hole));
        rodents.add(new Mouse(hole));
        rodents.add(new HouseMouse(hole));

        Iterator<Rodent> it = rodents.iterator();

        testRodent(it);

        System.out.println("---------------------");
        System.out.println("| KILL'EM ALL!!!!11 |");
        System.out.println("---------------------");

        it = rodents.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
    }
}
