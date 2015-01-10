package net.tonyrovba.tij.holdingobjects.Ex4;

/**
 * Created by tonyr on 2/11/14.
 */
public class MovieNamesGenerator {
    private static String[] movieNames = {"Chichikov", "Sobakevich", "Manilov", "Korobochka", "Selifan"};
    private static int counter = 0;

    public static String next() {
        if(counter == movieNames.length) counter = 0;

        return movieNames[counter++];
    }
}
