package net.tonyrovba.tij.interfaces.Ex13;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 06.09.13
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */
public interface CanSwim extends Vehicle {
    void swim();

    @Override
    void go();
}
