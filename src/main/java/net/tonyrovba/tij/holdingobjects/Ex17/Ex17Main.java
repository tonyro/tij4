package net.tonyrovba.tij.holdingobjects.Ex17;

import net.tonyrovba.tij.holdingobjects.Ex1.Gerbil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by arovba on 11/9/15.
 */
public class Ex17Main {
    public static void main(String[] args) {
        Map<String, Gerbil> gerbils = new HashMap<>();
        String[] names = new String[]{"Joe", "Jack", "Janis", "Jarred", "Jessica"};

        for (String name: names)
            gerbils.put(name, new Gerbil());

//        for (String name: gerbils.keySet()){
//            System.out.print(name + ": ");
//            gerbils.get(name).hop();
//        }

        Iterator<String> it = gerbils.keySet().iterator();
        while (it.hasNext()){
            String name = it.next();
            System.out.print(name + ": ");
            gerbils.get(name).hop();
        }
    }
}
