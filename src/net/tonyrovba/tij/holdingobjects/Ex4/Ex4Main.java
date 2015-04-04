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
        int n = 10;
        String[] arr = new String[n];
        
        // Fill regular array of Strings
        for (int i = 0; i < n; i++)
            arr[i] = MovieNamesGenerator.next();

        System.out.println("ArrayList -->");
        System.out.println(arr);
        System.out.println("----------------------------------");

        System.out.println("ArrayList -->");
        System.out.println(fill(new ArrayList<String>(), n));
        System.out.println("----------------------------------");

        System.out.println("LinkedList -->");
        System.out.println(fill(new LinkedList<String>(), n));
        System.out.println("----------------------------------");

        System.out.println("HashSet -->");
        System.out.println(fill(new HashSet<String>(), n));
        System.out.println("----------------------------------");

        System.out.println("LinkedHashSet -->");
        System.out.println(fill(new LinkedHashSet<String>(), n));
        System.out.println("----------------------------------");

        System.out.println("TreeSet -->");
        System.out.println(fill(new TreeSet<String>(), n));
        System.out.println("----------------------------------");
    }
}
