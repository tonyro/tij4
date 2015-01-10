package net.tonyrovba.tij.innerclasses.Ex19;

/**
 * Created by Anton on 10.01.2015.
 */
public class DoubleNestedInner {
    public static class FirstLayerNested {
        public static void mm1() {
            System.out.println("FirstLayerNested");
        }

        public static class SecondLayerNested {
            public static void mm2() {
                System.out.println("SecondLayerNested");
            }
        }
    }
}
