package net.tonyrovba.tij.innerclasses.Ex20;

/**
 * Created by Anton on 10.01.2015.
 */
public interface Doctor {
    void greats();

    class BaseDoctor implements Doctor {
        public void greats() {
            System.out.println("Greatings, patient!");
        }
    }
}
