package net.tonyrovba.tij.holdingobjects.Ex12;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by tonyr on 2/12/14.
 */
public class Ex12Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Integer[] ints = {  rand.nextInt(50),
                            rand.nextInt(50),
                            rand.nextInt(50),
                            rand.nextInt(50),
                            rand.nextInt(50),
                            rand.nextInt(50),
                            rand.nextInt(50),
                            rand.nextInt(50),
                            rand.nextInt(50) };

        List<Integer> list = Arrays.asList(ints);

        System.out.println(list);
    }
}
