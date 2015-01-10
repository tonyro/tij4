package net.tonyrovba.tij.holdingobjects.Ex4;

/**
 * Created by tonyr on 2/11/14.
 */

import java.util.*;

public class Ex4Main {

    static Collection<String> fill(Collection<String> coll, int n) {
        for(int i = 0; i < n; i++) {
            coll.add(MovieNamesGenerator.next());
        }

        return coll;
    }

    public static void main(String[] args) {
        String[] arr;
        ArrayList<String> arrList;
        LinkedList<String> linkedList;
        HashSet<String> hashSet;
        LinkedHashSet<String> linkedHashSet;
        TreeSet<String> treeSet;

        System.out.println("ArrayList -->");
        System.out.println(fill(new ArrayList<String>(), 10));
        System.out.println("----------------------------------");

        System.out.println("LinkedList -->");
        System.out.println(fill(new LinkedList<String>(), 10));
        System.out.println("----------------------------------");

        System.out.println("HashSet -->");
        System.out.println(fill(new HashSet<String>(), 10));
        System.out.println("----------------------------------");

        System.out.println("LinkedHashSet -->");
        System.out.println(fill(new LinkedHashSet<String>(), 10));
        System.out.println("----------------------------------");

        System.out.println("TreeSet -->");
        System.out.println(fill(new TreeSet<String>(), 10));
        System.out.println("----------------------------------");
    }
}
