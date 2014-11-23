package net.tonyrovba.tij.interfaces.Ex16;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 24.09.13
 * Time: 16:55
 * To change this template use File | Settings | File Templates.
 */
public class MainEx16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new CharsSequence(3));

        while(scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}
