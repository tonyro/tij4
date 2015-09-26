package net.tonyrovba.tij.innerclasses.Ex5;

/**
 * Created by Anton on 07.09.2014.
 */
public class MainEx5 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
    }
}
