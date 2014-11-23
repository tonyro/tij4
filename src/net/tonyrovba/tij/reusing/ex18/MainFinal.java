package net.tonyrovba.tij.reusing.ex18;


public class MainFinal {

    public static void main(String[] args) {
        TestFinal tf1 = new TestFinal(3);
        TestFinal tf2 = new TestFinal(8);

        System.out.println("------ tf1 ------");
        System.out.println("final field: " + tf1.i);
        System.out.println("static final field: " + tf1.INT_J);
        System.out.println("-----------------");

        System.out.println("------ tf2 ------");
        System.out.println("final field: " + tf2.i);
        System.out.println("static final field: " + tf2.INT_J);
        System.out.println("-----------------");

    }

}
