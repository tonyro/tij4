package net.tonyrovba.tij.innerclasses.Ex17;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 25.09.13
 * Time: 11:50
 * To change this template use File | Settings | File Templates.
 */
public class Dice implements Tossable {
    private Dice(){}
    public void toss() {
        System.out.println("Dice.toss()");
    }
    public static TossableFactory factory = new TossableFactory() {
        @Override
        public Tossable getTossable() {
            return new Dice();
        }
    };
}
