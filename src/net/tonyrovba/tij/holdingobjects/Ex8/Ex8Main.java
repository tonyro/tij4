package net.tonyrovba.tij.holdingobjects.Ex8;

import net.tonyrovba.tij.holdingobjects.Ex1.Gerbil;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by tonyr on 2/12/14.
 */
public class Ex8Main {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();

        for(int i = 0; i <= 5; i++) {
            gerbils.add(new Gerbil());
        }

        System.out.println(gerbils.size());

        for(Gerbil g: gerbils) {
            g.hop();
        }

        System.out.println("Hopping once again!");

        for(int i = 0; i < gerbils.size(); i++) {
            gerbils.get(i).hop();
        }

        System.out.println("Hopping with Iterator");

        Iterator<Gerbil> it = gerbils.iterator();
        while(it.hasNext()) {
            it.next().hop();
        }
    }
}
