package net.tonyrovba.tij.innerclasses.Ex3;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 26.09.13
 * Time: 23:35
 * To change this template use File | Settings | File Templates.
 */
public class MainEx3 {
    public static void main(String[] args) {
        Outer outer = new Outer("Gotcha!");
        Outer.Inner inner = outer.getInner();

        System.out.println(inner.getOuterString());
    }
}
