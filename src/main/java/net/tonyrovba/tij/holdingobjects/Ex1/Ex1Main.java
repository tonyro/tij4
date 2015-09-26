package net.tonyrovba.tij.holdingobjects.Ex1;

/**
 * Created by tonyr on 2/6/14.
 */

import java.util.*;

public class Ex1Main {

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
    }
}
