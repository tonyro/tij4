package net.tonyrovba.tij.innerclasses.Ex17;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 25.09.13
 * Time: 11:44
 * To change this template use File | Settings | File Templates.
 */
public class MainEx17 {
    public static void tossIt(TossableFactory tossableFactory) {
        Tossable it = tossableFactory.getTossable();

        it.toss();
    }

    public static void main(String[] args) {

        tossIt(Coin.factory);
        tossIt(Dice.factory);
    }
}
