package net.tonyrovba.tij.holdingobjects.Ex7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by tonyr on 2/11/14.
 */
public class Ex7Main {
    public static void main(String[] args) {
        MyClass[] myArr;
        Random rand = new Random(5);

        // Make an array of MyClasses
        int n = rand.nextInt(10);
        System.out.println("Number is: " + n);
        myArr = new MyClass[n];
        for(int i = 0; i < n; i++) {
            myArr[i] = new MyClass();
        }

        // Make a List of MyClasses from the array
        List<MyClass> myClasses = Arrays.asList(myArr);
        System.out.println(myClasses);

        // Generate bounds of sub-list
        int a = n - 3;
        int b = n - 1;
        System.out.println("Left bound a is: " + a + "; right bound b is: " + b);

        // Get sub-list from the List of MyClasses
        List<MyClass> subList = myClasses.subList(a, b);
        System.out.println("Sub-list is: " + subList);

        // Remove the sub-list subList from the List myClasses
        List<MyClass> copy = new ArrayList<MyClass>(myClasses); // need to make it as ArrayList as remove method will not work
        copy.removeAll(subList);
        //myClasses.remove(subList.get(0));

        System.out.println("MyClasses List after removal of the sub-list:");
        System.out.println(copy);
    }
}
