package net.tonyrovba.tij.innerclasses.Ex6;

import net.tonyrovba.tij.innerclasses.Ex6.one.Descriable;

/**
 * Created by Anton on 07.09.2014.
 */
public class Scientist {
    public Scientist() {
        System.out.println("Scientist.constructor()");
    }

    protected class Bio implements Descriable {
        Bio() {
            System.out.println("Scientist.Bio.constructor()");
        }

        public String describe() {
            return "I am a great Scientist. I was born in Belarus.";
        }
    }
}
