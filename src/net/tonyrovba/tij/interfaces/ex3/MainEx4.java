package net.tonyrovba.tij.interfaces.ex3;

import net.tonyrovba.tij.interfaces.ex4.AbstractClass;
import net.tonyrovba.tij.interfaces.ex4.DerivedClass;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 17.08.13
 * Time: 12:24
 * To change this template use File | Settings | File Templates.
 */


//-------- !!! --  UNFINISHED  -- !!! --------------


public class MainEx4 {

    static void method(AbstractClass abstractClass) {

        ((DerivedClass)abstractClass).m();

    }

    public static void main(String[] args) {

        AbstractClass abstractClass = new AbstractClass(){};

        System.out.println(abstractClass);

//        method(abstractClass);
    }
}
