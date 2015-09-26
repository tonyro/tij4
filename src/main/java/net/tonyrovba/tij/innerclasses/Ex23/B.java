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
public class B {
    private static final int CAPACITY = 5;
    public U[] uArr = new U[CAPACITY];
    private static boolean isFull = false;
    private static int emptySlot = 0;
    private static int emptySlotCount = CAPACITY;
    
    public int getCapacity() {
        return CAPACITY;
    }
    
    public void add(U u) {
        if(isFull == true)
            System.out.println("Array is full.");
        else {
            uArr[emptySlot++] = u;
            emptySlotCount--;
            checkCapacity();
        }
    }
    
    public void delete(int atIndex) {
        if(uArr[atIndex] == null)
            System.out.println("There is no reference at this index.");
        else {
            uArr[atIndex] = null;
            emptySlot = atIndex;
            emptySlotCount++;
            isFull = false;
        }
    }

    public void runUMethods() {
        for(int i = 0; i < CAPACITY; i++) {
            if(uArr[i] != null){
            System.out.println("Element " + i + "--->");
            uArr[i].m1();
            uArr[i].m2();
            uArr[i].m3();
            System.out.println("------X");
            }
        }
    }
    
    private void checkCapacity() {
        if(emptySlotCount == 0) {
            isFull = true;
        }
    }
    
    public void printArr() {
        for(int i = 0; i < CAPACITY; i++)
            System.out.println("uArr[" + i + "] = " + uArr[i]);
    }
}
