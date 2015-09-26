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
public class MainEx23 {
    
    public static void takesU(U u) {
        u.m1();
        u.m2();
        u.m3();
    }
    
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        
        for(int i = 0; i < b.getCapacity(); i++) {
            b.add(a.getU());
        }
        b.printArr();
        b.add(a.getU());
        System.out.println("-----------------------------");
        b.delete(3);
        b.printArr();
        System.out.println("-----------------------------");
        b.delete(1);
        b.printArr();
        System.out.println("-----------------------------");
        b.add(a.getU());
        b.printArr();
        System.out.println("-----------------------------");
        b.add(a.getU());
        System.out.println("-----------------------------");
        b.runUMethods();
    }
    
}
