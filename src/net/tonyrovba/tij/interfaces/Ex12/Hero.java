package net.tonyrovba.tij.interfaces.Ex12;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 06.09.13
 * Time: 16:32
 * To change this template use File | Settings | File Templates.
 */
public class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb {
    public void swim() { System.out.println("Hero.swim()"); }
    public void fly() { System.out.println("Hero.fly()"); }
    public void climb() { System.out.println("Hero.climb()"); }
}
