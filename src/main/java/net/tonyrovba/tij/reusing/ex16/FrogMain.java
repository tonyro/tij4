package net.tonyrovba.tij.reusing.ex16;


public class FrogMain {

    public static void move(Amphibian a) {
        a.run();
        a.swim();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();

        move(frog);
    }
}

