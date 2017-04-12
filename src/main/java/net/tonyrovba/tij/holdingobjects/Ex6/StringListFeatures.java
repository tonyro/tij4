package net.tonyrovba.tij.holdingobjects.Ex6;

import net.tonyrovba.tij.holdingobjects.Ex4.MovieNamesGenerator;

import java.util.*;

/**
 * Created by arovba on 4/12/17.
 */
public class StringListFeatures {

    static ArrayList<String> arrayList() {
        ArrayList<String> a = new ArrayList<>();

        for(int i = 0; i < 7; i++){
            a.add(MovieNamesGenerator.next());
        }

        return a;
    }

    public static void main(String[] args) {

        List<String> list = arrayList();

        System.out.println("1: " + list);

        String s = "Willie T. Soke";
        list.add(s); // Automatically resizes
        System.out.println("2: " + list);

        System.out.println("3: " + list.contains(s));

        list.remove(s); // Remove by object

        String str = list.get(2);
        System.out.println("4: " +  str + " " + list.indexOf(str));

        String str1 = "Chichikov";
        System.out.println("5: " + list.indexOf(str1));
        System.out.println("6: " + list.remove(str1));

        System.out.println("7: " + list.remove(str));
        System.out.println("8: " + list);

        list.add(3, "Marcus Skidmore"); // Insert at an index
        System.out.println("9: " + list);

        List<String> sub = list.subList(1, 4);
        System.out.println("subList: " + sub);

        System.out.println("10: " + list.containsAll(sub));

        Collections.sort(sub); // In-place sort
        System.out.println("sorted subList: " + sub);

        // Order is not important in containsAll():
        System.out.println("11: " + list.containsAll(sub));

        Random rand = new Random(47);
        Collections.shuffle(sub, rand); // Mix it up
        System.out.println("shuffled subList: " + sub);

        System.out.println("12: " + list.containsAll(sub));

        List<String> copy = new ArrayList<>(list);
        sub = Arrays.asList(list.get(1), list.get(4));
        System.out.println("sub: " + sub);

        copy.retainAll(sub);
        System.out.println("13: " + copy);

        copy = new ArrayList<>(list); // Get a fresh copy
        copy.remove(2); // Remove by index
        System.out.println("14: " + copy);

        copy.removeAll(sub); // Only removes exact objects
        System.out.println("15: " + copy);

        copy.set(1, "Bob Chipeska"); // Replace an element
        System.out.println("16: " + copy);

        copy.addAll(2, sub); // Insert a list in the middle
        System.out.println("17: " + copy);

        System.out.println("18: " + list.isEmpty());

        list.clear(); // Remove all elements
        System.out.println("19: " + list);
        System.out.println("20: " + list.isEmpty());

        list.addAll(arrayList());
        System.out.println("21: " + list);

        Object[] o = list.toArray();
        System.out.println("22: " + o[3]);

//        String[] pa = list.toArray(new String("Gin Slagel"));  DO NOT WORK
//        System.out.println("23: " + pa[3].id());
    }
}
