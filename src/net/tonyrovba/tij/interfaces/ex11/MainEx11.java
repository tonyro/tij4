package net.tonyrovba.tij.interfaces.ex11;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 04.09.13
 * Time: 13:41
 * To change this template use File | Settings | File Templates.
 */
public class MainEx11 {

    public static void main(String[] args) {
        String s = "passportz";
        String r;
        CharsSwapper cs = new CharsSwapper();

        System.out.println(cs.name());
        r = cs.process(s);

        System.out.println(r);
    }
}
