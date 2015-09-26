package net.tonyrovba.tij.interfaces.Ex12;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 06.09.13
 * Time: 16:33
 * To change this template use File | Settings | File Templates.
 */
public class Adventure {

    public static void t(CanFight x) { x.fight(); }

    public static void u(CanSwim x) { x.swim(); }

    public static void v(CanFly x) { x.fly(); }

    public static void w(ActionCharacter x) { x.fight(); }

    public static void c(CanClimb c) { c.climb(); }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h); // Treat it as a CanFight
        u(h); // Treat it as a CanSwim
        v(h); // Treat it as a CanFly
        w(h); // Treat it as an ActionCharacter
        c(h); // Treat it as a CanClimb
    }
}
