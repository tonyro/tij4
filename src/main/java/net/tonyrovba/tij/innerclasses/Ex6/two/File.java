package net.tonyrovba.tij.innerclasses.Ex6.two;

import net.tonyrovba.tij.innerclasses.Ex6.Scientist;
import net.tonyrovba.tij.innerclasses.Ex6.one.Descriable;

/**
 * Created by Anton on 07.09.2014.
 */
public class File extends Scientist {
    String b;
    public File() {
        System.out.println("File.constructor()");
    }

    public Descriable getScientistBio() {
        Scientist s = new Scientist();
//        return s.new Bio();
        return null;
    }
}
