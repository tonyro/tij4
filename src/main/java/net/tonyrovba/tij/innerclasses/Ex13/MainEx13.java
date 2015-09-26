package net.tonyrovba.tij.innerclasses.Ex13;

import net.tonyrovba.tij.innerclasses.Ex9.Destination;

/**
 * Created by Anton on 08.12.2014.
 */
public class MainEx13 {
    public static void main(String[] args) {
        Parcel5 p = new Parcel5();

        Destination d = p.destination("Tasmania");
        System.out.println(d.readLabel());

        System.out.println(p.destination("Zambia").readLabel());
    }
}
