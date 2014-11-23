/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.tonyrovba.tij.reusing.ex24;

/**
 *
 * @author tonyr
 */
class Insect {

    private int i = 9;
    protected int j;

    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 =
            printInit("static Insect.x1 initialized");

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

class Beetle extends Insect {

    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 =
            printInit("static Beetle.x2 initialized");
}

public class StagBeetle extends Beetle {
    
    private int l = printInit("StagBeetle.l initialized");

    public StagBeetle() {
        System.out.println("l = " + l);
        System.out.println("j = " + j);
    }
    private static int x3 =
            printInit("static StagBeetle.x3 initialized");
    
    public static void main(String[] args) {
        System.out.println("StagBeetle constructor");
        StagBeetle b = new StagBeetle();
    }
}
