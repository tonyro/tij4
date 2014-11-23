package net.tonyrovba.tij.init.refarray;

import java.util.Random;

public class RefArrayMain {

	public static void main(String[] args) {
		Random rand = new Random(0);
		
		RefArray[] ra = new RefArray[rand.nextInt(20)];
		
		for (int i = 0; i < ra.length; i++) {
			ra[i] = new RefArray("String" + i);
		}
		
		for (int i = 0; i < ra.length; i++) {
			System.out.println(ra[i]);
		}

	}

}

class RefArray {
	RefArray(String s) {
		System.out.println(s);
	}
}
