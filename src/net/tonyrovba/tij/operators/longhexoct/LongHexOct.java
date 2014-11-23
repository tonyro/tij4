package net.tonyrovba.tij.operators.longhexoct;

public class LongHexOct {

	public static void main(String[] args) {
		
		Long lh = new Long(0x23456f);
		Long lo = new Long(01161);
		
		System.out.println(Long.toBinaryString(lh));
		System.out.println(Long.toBinaryString(lo));

	}

}
