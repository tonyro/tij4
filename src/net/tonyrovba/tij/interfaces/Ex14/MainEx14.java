package net.tonyrovba.tij.interfaces.Ex14;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 24.09.13
 * Time: 14:15
 * To change this template use File | Settings | File Templates.
 */
public class MainEx14 {

    public static void a(Interface1 i1) {
        System.out.println(i1.getClass().getName());

        i1.m11();
        i1.m12();
    }

    public static void b(Interface2 i2) {
        System.out.println(i2.getClass().getName());

        i2.m21();
        i2.m22();
    }

    public static void c(Interface3 i3) {
        System.out.println(i3.getClass().getName());

        i3.m31();
        i3.m32();
    }

    public static void d(Interface4 i4) {
        System.out.println(i4.getClass().getName());

        i4.m4();
    }

    public static void main(String[] args) {
        DerivedClass dc = new DerivedClass();

        a(dc);
        b(dc);
        c(dc);
        d(dc);

        dc.printInfo();
    }
}
