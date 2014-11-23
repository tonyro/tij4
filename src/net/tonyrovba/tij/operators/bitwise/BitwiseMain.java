package net.tonyrovba.tij.operators.bitwise;

public class BitwiseMain {

	public static void main(String[] args) {
		Integer i1 = new Integer(0x01010101);
		Integer i2 = new Integer(0x10101010);
		
		System.out.println("i1 is: " + Integer.toBinaryString(i1));
		System.out.println("i2 is: " + Integer.toBinaryString(i2));
		
		System.out.println("i1 & i2: " + Integer.toBinaryString(i1 & i2));
		System.out.println("i1 | i2: " + Integer.toBinaryString(i1 | i2));
		System.out.println("i1 ^ i2: " + Integer.toBinaryString(i1 ^ i2));
		System.out.println("~i1: " + Integer.toBinaryString(~i1));

	}

}
