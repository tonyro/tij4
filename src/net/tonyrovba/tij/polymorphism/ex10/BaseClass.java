package net.tonyrovba.tij.polymorphism.ex10;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 12.07.13
 * Time: 7:21
 * To change this template use File | Settings | File Templates.
 */
public class BaseClass {
    protected void method1() {
        System.out.println("BaseClass.method1() calls " + method2());
    }

    public String method2() {
        return "BaseClass.method2()";
    }
}
