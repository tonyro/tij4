package net.tonyrovba.tij.innerclasses.Ex1;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 25.09.13
 * Time: 16:13
 * To change this template use File | Settings | File Templates.
 */
public class Outer {

    class Inner {
        public Inner() {
            System.out.println("Inner constructor");
        }
    }

    public Inner getInner() {
        System.out.println("Outer.getInner()");
        return new Inner();
    }
}
