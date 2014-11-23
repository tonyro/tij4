package net.tonyrovba.tij.operators.coinflipping;

import java.util.Random;

public class Coin {
	
	private String currentSide;
	
	public String flip() {
		
		Random rand = new Random();
		
		int intSide = rand.nextInt();
		
		mapSide(intSide);
		
		return this.currentSide;
	}
	
	private void mapSide(int intSide) {
		
		if (intSide % 2 == 0)
			this.currentSide = "Tail";
		else
			this.currentSide = "Head";
	}

}
