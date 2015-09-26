package net.tonyrovba.tij.innerclasses.Ex14;

/**
 * Created by Anton on 08.12.2014.
 */
interface Monster {
    void menace();
}

class DangerousMonster implements Monster{
    void destroy() {
        System.out.println("DangerousMonster.destroy()");
    }

    private Monster getMonster() {
        return new Monster() {
            @Override
            public void menace() {
                System.out.println("DangerousMonster.Monster.menace()");
            }
        };
    }

    public void menace() {
        getMonster().menace();
    }
}
interface Lethal {
    void kill();
}
class DragonZilla extends DangerousMonster {
    public void menace() {}
    public void destroy() {}
}
class Vampire extends DangerousMonster implements Lethal{
    private Lethal getLethal() {
        return new Lethal() {
            @Override
            public void kill() {
                System.out.println("Vampire.Lethal.kill()");
            }
        };
    }

    private DangerousMonster getDangerousMonster() {
        return new DangerousMonster() {
            public void menace() {
                System.out.println("Vampire.DangerousMonster.menace()");
            }
            public void destroy() {
                System.out.println("Vampire.DangerousMonster.destroy()");
            }
        };
    }
    void drinkBlood() {
        System.out.println("Vampire.drinkBlood()");
    }

    public void menace() {
        getDangerousMonster().menace();
    }

    public void destroy() {
        getDangerousMonster().destroy();
    }

    public void kill() {
        getLethal().kill();
    }
}
class VeryBadVampire extends Vampire {
    public void menace() {
        System.out.println("VeryBadVampire.menace()");
    }
    public void destroy() {System.out.println("VeryBadVampire.destroy()");}
    public void kill() {System.out.println("VeryBadVampire.kill()");}
    public void drinkBlood() {System.out.println("VeryBadVampire.drinkBlood()");}
}
public class HorrorShow {
    static void u(Monster b) { b.menace(); }
    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }
    static void w(Lethal l) { l.kill(); }
    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}
