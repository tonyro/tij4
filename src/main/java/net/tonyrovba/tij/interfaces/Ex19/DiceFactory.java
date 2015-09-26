package net.tonyrovba.tij.interfaces.Ex19;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 25.09.13
 * Time: 11:51
 * To change this template use File | Settings | File Templates.
 */
public class DiceFactory implements TossableFactory {
    public Tossable getTossable() {
        return new Dice();
    }
}
