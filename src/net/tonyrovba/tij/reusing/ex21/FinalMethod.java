/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.tonyrovba.tij.reusing.ex21;

/**
 *
 * @author tonyr
 */
public class FinalMethod {
    
    public final void m() {
        System.out.println("FinalMethod.m()");
    }
    
}

class FinalMethodDecend extends FinalMethod {
    //@Override
    public final void m1() {
        System.out.println("FinalMethodDecend.m()");
    }
}
