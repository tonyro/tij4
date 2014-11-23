package net.tonyrovba.tij.reusing.ex16;

class Amphibian {

    public void run() {
        System.out.println("Amphibian.run()");
    }

    public void swim() {
        System.out.println("Amphibian.swim()");
    }
}

public class Frog extends Amphibian {

    public void run() {
        System.out.println("Frog.run()");
    }

    public void swim() {
        System.out.println("Frog.swim()");
    }
}

