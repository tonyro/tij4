package net.tonyrovba.tij.innerclasses.Ex3;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 26.09.13
 * Time: 23:33
 * To change this template use File | Settings | File Templates.
 */
public class Outer {
    private String s;

    public Outer(String s) {
        this.s = s;
    }

    class Inner {
        public String getOuterString() {
            return s;
        }
    }

    public Inner getInner() {
        return new Inner();
    }
}
