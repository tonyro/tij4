package net.tonyrovba.tij.innerclasses.Ex17;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 25.09.13
 * Time: 11:48
 * To change this template use File | Settings | File Templates.
 */
public class Coin implements Tossable {
    private Coin() {}
    public void toss() {
        System.out.println("Coin.toss()");
    }
    public static TossableFactory factory = new TossableFactory() {

        public Tossable getTossable() {
            return new Coin();
        }
    };
}
