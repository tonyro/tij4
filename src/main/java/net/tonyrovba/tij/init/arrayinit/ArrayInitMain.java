package net.tonyrovba.tij.init.arrayinit;

import java.util.Random;

public class ArrayInitMain {

	public static void main(String[] args) {
		Random rand = new Random(2); 
		
		String[] strArr = new String[rand.nextInt(15)];
		
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = new String("String" + i);
		}
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.println("[" + i + "]: " + strArr[i]);
		}

	}

}
