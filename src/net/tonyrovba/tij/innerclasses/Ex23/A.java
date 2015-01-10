/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.tonyrovba.tij.innerclasses.Ex23;

/**
 *
 * @author tonyr
 */
public class A {
    public U getU() {
        return new U() {
            public void m1() { System.out.println("A.AInner.m1()"); }
            public void m2() { System.out.println("A.AInner.m2()"); }
            public void m3() { System.out.println("A.AInner.m3()"); }
            public String toString() { return "This is reference to U."; }
        };
    }
}
