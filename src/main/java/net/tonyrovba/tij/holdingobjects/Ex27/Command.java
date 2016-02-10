package net.tonyrovba.tij.holdingobjects.Ex27;

/**
 * Created by tonnur on 2/10/16.
 */
public class Command {
    private String phrase;

    public Command(String phrase) {
        this.phrase = phrase;
    }

    public void operation() {
        System.out.println(phrase);
    }
}
