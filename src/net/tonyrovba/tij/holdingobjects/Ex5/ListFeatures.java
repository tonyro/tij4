package net.tonyrovba.tij.holdingobjects.Ex5;

/**
 * Created by tonyr on 2/11/14.
 */

import java.util.*;

public class ListFeatures {

    static ArrayList<Integer> arrayList() {
        ArrayList<Integer> a = new ArrayList<Integer>();
        Random rand = new Random();
        int n = rand.nextInt(10);

        for(int i = 0; i < n; i++){
            a.add(rand.nextInt());
        }

        return a;
    }

    public static void main(String[] args) {
        Random rand = new Random();

        List<Integer> pets = arrayList();
        System.out.println("1: " + pets);

        Integer h = new Integer(rand.nextInt());
        pets.add(h); // Automatically resizes
        System.out.println("2: " + pets);
        System.out.println("3: " + pets.contains(h));
        pets.remove(h); // Remove by object

        Integer p = pets.get(2);
        System.out.println("4: " + p + " " + pets.indexOf(p));
        Integer cymric = rand.nextInt();
        System.out.println("5: " + pets.indexOf(cymric));
        System.out.println("6: " + pets.remove(cymric));

        // Must be the exact object:
        System.out.println("7: " + pets.remove(p));
        System.out.println("8: " + pets);

        pets.add(3, new Integer(rand.nextInt())); // Insert at an index
        System.out.println("9: " + pets);

        /*List<Pet> sub = pets.subList(1, 4);
        print("subList: " + sub);
        print("10: " + pets.containsAll(sub));
        Collections.sort(sub); // In-place sort
        print("sorted subList: " + sub);
        // Order is not important in containsAll():
        print("11: " + pets.containsAll(sub));
        Collections.shuffle(sub, rand); // Mix it up
        print("shuffled subList: " + sub);
        print("12: " + pets.containsAll(sub));
        List<Pet> copy = new ArrayList<Pet>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        print("sub: " + sub);
        copy.retainAll(sub);
        print("13: " + copy);
        copy = new ArrayList<Pet>(pets); // Get a fresh copy
        copy.remove(2); // Remove by index
        print("14: " + copy);
        copy.removeAll(sub); // Only removes exact objects
        print("15: " + copy);
        copy.set(1, new Mouse()); // Replace an element
        print("16: " + copy);
        copy.addAll(2, sub); // Insert a list in the middle
        print("17: " + copy);
        print("18: " + pets.isEmpty());
        pets.clear(); // Remove all elements
        print("19: " + pets);
        print("20: " + pets.isEmpty());
        pets.addAll(Pets.arrayList(4));
        print("21: " + pets);
        Object[] o = pets.toArray();
        print("22: " + o[3]);
        Pet[] pa = pets.toArray(new Pet[0]);
        print("23: " + pa[3].id());*/
    }
}
