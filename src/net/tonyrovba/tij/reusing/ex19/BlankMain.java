package net.tonyrovba.tij.reusing.ex19;

public class BlankMain {

	public static void main(String[] args) {
		
		BlankFinal bf1 = new BlankFinal();
		System.out.println(bf1.i + " " + bf1.blank);
		BlankFinal bf2 = new BlankFinal(1, "First");
		System.out.println(bf2.i + " " + bf2.blank);
		
//		bf1.i = 2;
//		bf1.blank = new Blank("Recreated");

	}

}
