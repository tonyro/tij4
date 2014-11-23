package net.tonyrovba.tij.interfaces.ex11;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 04.09.13
 * Time: 13:00
 * To change this template use File | Settings | File Templates.
 */
public class CharsSwapper extends StringProcessor{

    public String name() {
        return getClass().getSimpleName();
    }

    public String process(Object s) {
        char[] sArr = ((String)s).toCharArray();
        char[] toSwap = new char[sArr.length - 1];
        char appendix;

        if(sArr.length % 2 != 0) {
            appendix = sArr[sArr.length - 1];
            for(int i = 0; i < sArr.length - 1; i++)
                toSwap[i] = sArr[i];

            return new String(swap(toSwap)) + appendix;
        }


        return new String(swap(sArr));
    }

    private static char[] swap(char[] c) {
        int i = 0;
        char temp;

        while(i < c.length) {
            temp = c[i+1];
            c[i+1] = c[i];
            c[i] = temp;
            i += 2;
        }

        return c;
    }
}
