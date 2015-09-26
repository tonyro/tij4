package net.tonyrovba.tij.interfaces.ex11;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 04.09.13
 * Time: 14:57
 * To change this template use File | Settings | File Templates.
 */
public abstract class StringProcessor implements Processor{
    public String name() {
        return getClass().getSimpleName();
    }
    public abstract String process(Object input);
}
