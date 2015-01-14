package net.tonyrovba.tij.innerclasses.Ex21;

/**
 * Created by Anton on 11.01.2015.
 */
public interface Employee {
    String showPass();

    public static class PassValidator implements Employee {
        public static void validatePass() {
            System.out.println(showPass());
        }
    }
}
