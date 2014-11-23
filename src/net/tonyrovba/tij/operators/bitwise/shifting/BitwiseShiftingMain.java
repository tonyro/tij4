package net.tonyrovba.tij.operators.bitwise.shifting;

public class BitwiseShiftingMain {

	static void shiftRightSigned (Integer i) {
		System.out.println("--- Shifting to the right with sign (>>>) started ---");

		System.out.println("i in binary: " + Integer.toBinaryString(i));
		System.out.println("i in decimal: " + i);

		for (int j = 0; j < 6; j++) {
			System.out.println("---------------------------------------");
			i >>>= 1;
			System.out.println("Shifted i in binary: " + Integer.toBinaryString(i));
			System.out.println("Shifted i in decimal: " + i);
		}

		System.out.println("--- Shifting to the right with sign (>>>) ended ---");
	}

	static void shiftLeftThenRight (Integer i) {

		System.out.println("--- Shifting to the left (<<) started ---");

		System.out.println("i in binary: " + Integer.toBinaryString(i));
		System.out.println("i in decimal: " + i);

		for (int j = 0; j < 6; j++) {
			System.out.println("---------------------------------------");
			i <<= 1;
			System.out.println("Shifted i in binary: " + Integer.toBinaryString(i));
			System.out.println("Shifted i in decimal: " + i);
		}

		System.out.println("--- Shifting to the left (<<) ended ---");

		System.out.println("--- Shifting to the right (>>) started ---");

		System.out.println("i in binary: " + Integer.toBinaryString(i));
		System.out.println("i in decimal: " + i);

		for (int j = 0; j < 6; j++) {
			System.out.println("---------------------------------------");
			i >>= 1;
			System.out.println("Shifted i in binary: " + Integer.toBinaryString(i));
			System.out.println("Shifted i in decimal: " + i);
		}

		System.out.println("--- Shifting to the right (>>) ended ---");

	}
	
	static void printCharInBinary (Character c) {
		System.out.println("Character is: " + c);
		System.out.println("Character in binary: " + Integer.toBinaryString(Character.getNumericValue(c)));
	}

	public static void main(String[] args) {
		Integer i = new Integer(0x2A);
		Integer ii = new Integer(0x3F);
		Character c = new Character('a');
		Character cc = new Character('m');
		Character ccc = new Character('x');

		shiftRightSigned(i);
		shiftLeftThenRight(ii);
		
		printCharInBinary(c);
		printCharInBinary(cc);
		printCharInBinary(ccc);
		
	}

}
