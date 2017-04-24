package net.tonyrovba.tij.holdingobjects.Ex12;

import net.tonyrovba.tij.utils.ListHelper;
import java.util.*;

/**
 * Created by tonyr on 2/12/14.
 *
 * (3) Create and populate a List<Integer>. Create a second List<Integer> of the same size as the first,
 * and use ListIterators to read elements from the first List and insert them into the second in reverse order.
 * (You may want to explore a number of different ways to solve this problem.)
 */
public class Ex12Main {

    public static void main(String[] args) {
        int numberOfElements = 5;

        List<Integer> list = ListHelper.fillInListWithInts(numberOfElements);
        List<Integer> reversedList = ListHelper.fillInListWithInts(numberOfElements);

        ListIterator<Integer> listIterator = list.listIterator(list.size());
        ListIterator<Integer> reversedListIterator = reversedList.listIterator();

        while (reversedListIterator.hasNext()) {
            reversedListIterator.next();
            reversedListIterator.set(listIterator.previous());
        }

        System.out.println(list);
        System.out.println(reversedList);
    }
}
