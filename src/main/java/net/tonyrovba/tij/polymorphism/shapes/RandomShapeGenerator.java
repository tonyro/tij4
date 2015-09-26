package net.tonyrovba.tij.polymorphism.shapes;

import java.util.*;


public class RandomShapeGenerator {
	private Random rand = new Random(47);
	private int x;

		public Shape next() {
			switch(x = rand.nextInt(4)) {
			// TODO figure out why 3 is never reached in this randomizer.
				default:
				case 0: { System.out.println("Random number is " + x); return new Circle(); }
				case 1: { System.out.println("Random number is " + x); return new Square(); }
				case 2: { System.out.println("Random number is " + x); return new Cube(); }
				case 3: { System.out.println("Random number is " + x); return new Triangle(); }
			}
		}
}
