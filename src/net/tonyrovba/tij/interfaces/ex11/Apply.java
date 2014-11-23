package net.tonyrovba.tij.interfaces.ex11;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 04.09.13
 * Time: 14:47
 * To change this template use File | Settings | File Templates.
 */
public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}
