package net.tonyrovba.tij.operators.coinflipping;

public class CoinFlippingMain {

	public static void main(String[] args) {
		
		Coin coin = new Coin();
		
		for (int i = 0; i < 150; i++) {
			System.out.println(coin.flip());
		}

	}

}
