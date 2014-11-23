package net.tonyrovba.tij.innerclasses.Ex7;

/**
 * Created by Anton on 10.09.2014.
 */
public class MainEx7 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        System.out.println(bank.getClientName());

        bank.changeClientName("Tony Ro");

        System.out.println(bank.getClientName());
    }
}
