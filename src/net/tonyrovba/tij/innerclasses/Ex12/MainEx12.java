package net.tonyrovba.tij.innerclasses.Ex12;

/**
 * Created by Anton on 08.12.2014.
 */
public class MainEx12 {

    public static void main(String[] args) {
        Bank bank = new Bank();

        System.out.println(bank.getClientName());
        FrontOffice frontOffice = bank.getFrontOffice();
        frontOffice.changeClientName("Tony Ro");
        System.out.println(bank.getClientName());
    }
}
