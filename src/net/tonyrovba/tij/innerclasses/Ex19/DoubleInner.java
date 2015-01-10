package net.tonyrovba.tij.innerclasses.Ex19;

/**
 * Created by Anton on 10.01.2015.
 */
public class DoubleInner {
    public class FirstLayer {
        public void m1() {
            System.out.println("FirstLayer");
        }

        public class SecondLayer {
            public void m2() {
                System.out.println("SecondLayer");
            }
        }
    }
}
