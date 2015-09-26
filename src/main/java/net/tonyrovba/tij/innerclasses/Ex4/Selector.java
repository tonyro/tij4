package net.tonyrovba.tij.innerclasses.Ex4;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 26.09.13
 * Time: 23:23
 * To change this template use File | Settings | File Templates.
 */
public interface Selector {
    boolean end();
    Object current();
    void next();
    Sequence getSequence();
}
