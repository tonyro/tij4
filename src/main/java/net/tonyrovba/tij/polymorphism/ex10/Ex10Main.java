package net.tonyrovba.tij.polymorphism.ex10;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 12.07.13
 * Time: 7:26
 * To change this template use File | Settings | File Templates.
 */
public class Ex10Main {

    public static void main(String[] args) {
        BaseClass bc = new DerivedClass();

        bc.method1();
    }
}
