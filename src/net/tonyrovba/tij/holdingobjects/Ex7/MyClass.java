package net.tonyrovba.tij.holdingobjects.Ex7;

/**
 * Created by tonyr on 2/11/14.
 */
public class MyClass {
    private static int count = 0;
    private int number;

    public MyClass() {
        number = count++;
    }

    public String toString() {
        return "MyClass_" + number;
    }
}
