package net.tonyrovba.tij.innerclasses.Ex26;

/**
 * Created by tonnur on 16.03.15.
 */
public class Outer {

    public class InnerClass {
        private int i;

        public InnerClass(int i) {
            this.i = i;
            System.out.println("Outer.InnerClass_" + i);
        }
    }
}
