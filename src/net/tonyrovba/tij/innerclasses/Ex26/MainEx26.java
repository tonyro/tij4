package net.tonyrovba.tij.innerclasses.Ex26;

/**
 * Created by tonnur on 16.03.15.
 */
public class MainEx26 {
    public static void main(String[] args) {
        Outer out = new Outer();
        InheritInner ii = new InheritInner(out, 10);
    }
}
