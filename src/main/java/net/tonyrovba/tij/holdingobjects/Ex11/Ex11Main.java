package net.tonyrovba.tij.holdingobjects.Ex11;

import net.tonyrovba.tij.utils.WordsGenerator;

import java.util.*;

/**
 * (2) Write a method that uses an Iterator to step through a Collection and
 print the toString( ) of each object in the container. Fill all the different types of
 Collections with objects and apply your method to each container.

 @author Anton Rovba (tony.rovba@gmail.com)
 */
public class Ex11Main {

    private static void printCollection(Collection c) {
        Iterator it = c.iterator();

        while (it.hasNext())
            System.out.println(it.next());
    }

    public static void main(String[] args) {
        // Lists
        ArrayList<String> arrayList = WordsGenerator.generateRandomWords(5, 5);
        LinkedList<String> linkedList = new LinkedList<>(WordsGenerator.generateRandomWords(6, 6));

        // Sets
        HashSet<String> hashSet = new HashSet<>(WordsGenerator.generateRandomWords(4, 4));
        TreeSet<String> treeSet = new TreeSet<>(WordsGenerator.generateRandomWords(3, 3));

        // Maps
        HashMap<Integer,String> hashMap = new HashMap<>();
        TreeMap<Integer,String> treeMap = new TreeMap<>();

        fillMap(hashMap, 7);
        fillMap(treeMap, 8);

        System.out.println("ArrayList");
        printCollection(arrayList);
        System.out.println("-------------------------------------------------------");

        System.out.println("LinkedList");
        printCollection(linkedList);
        System.out.println("-------------------------------------------------------");

        System.out.println("HashSet");
        printCollection(hashSet);
        System.out.println("-------------------------------------------------------");

        System.out.println("TreeSet");
        printCollection(treeSet);
        System.out.println("-------------------------------------------------------");

        // HashMap and TreeMap are not Collections
//        printCollection(hashMap);
//        printCollection(arrayList);

    }

    private static void fillMap(Map<Integer,String> map, int numberOfElements) {
        for (int i = 0; i < numberOfElements; i++) {
            map.put(i, WordsGenerator.generateWord(7));
        }
    }
}
