package net.tonyrovba.tij.innerclasses.Ex15;

/**
 * Created by Anton on 09.12.2014.
 */
public class Car {
    private int term = 0;

    public Car(int days) {
        this.term = days;
    }

    public void setTerm(int days) {
        this.term = days;
    }

    public int getTerm() {
        return term;
    }
}
