package net.tonyrovba.tij.polymorphism.music;

import java.util.Random;

public class RandomInstrumentGenerator {
	private Random rand = new Random();
	private int x;

		public Instrument next() {
			switch(x = rand.nextInt(6)) {
			// TODO figure out why 3 is never reached in this randomizer.
				default:
				case 0: { System.out.println("Random number is " + x); return new Wind(); }
				case 1: { System.out.println("Random number is " + x); return new Percussion(); }
				case 2: { System.out.println("Random number is " + x); return new Stringed(); }
				case 3: { System.out.println("Random number is " + x); return new Brass(); }
				case 4: { System.out.println("Random number is " + x); return new Woodwind(); }
				case 5: { System.out.println("Random number is " + x); return new Guitar(); }
			}
		}
}