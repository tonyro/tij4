package net.tonyrovba.tij.innerclasses.Ex2;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 26.09.13
 * Time: 23:24
 * To change this template use File | Settings | File Templates.
 */
public class StringHolder {
    private String s;

    public StringHolder(String s) {
        this.s = s;
    }

    public String toString() {
        return "Holding '" + s + "'";
    }
}
