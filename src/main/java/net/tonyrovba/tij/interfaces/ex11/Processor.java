package net.tonyrovba.tij.interfaces.ex11;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 04.09.13
 * Time: 14:46
 * To change this template use File | Settings | File Templates.
 */
public interface Processor {
    String name();
    Object process(Object input);
}