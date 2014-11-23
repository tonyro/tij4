package net.tonyrovba.tij.interfaces.ex3;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 13.08.13
 * Time: 19:49
 * To change this template use File | Settings | File Templates.
 */
public class DerivedClass extends ParentClass {

    private int i = 3;

    public void print() {
        System.out.println("i = " + this.i);
    }
}
