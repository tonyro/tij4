package net.tonyrovba.tij.innerclasses.Ex26;

/**
 * Created by tonnur on 16.03.15.
 */
public class InheritInner extends Outer.InnerClass {
    public InheritInner(Outer o, int i) {
        o.super(i);
        System.out.println("InheritInner_" + i);
    }
}
