package net.tonyrovba.tij.polymorphism.music;

import net.tonyrovba.tij.polymorphism.music.note.Note;

class Instrument {
	void play(Note n) { System.out.println("Instrument.play() " + n); }
	public String toString() { return "Instrument"; }
	void adjust() { System.out.println("Adjusting Instrument"); }
}

class Wind extends Instrument {
	void play(Note n) { System.out.println("Wind.play() " + n); }
	public String toString() { return "Wind"; }
	void adjust() { System.out.println("Adjusting Wind"); }
}

class Percussion extends Instrument {
	void play(Note n) { System.out.println("Percussion.play() " + n); }
	public String toString() { return "Percussion"; }
	void adjust() { System.out.println("Adjusting Percussion"); }
}

class Stringed extends Instrument {
	void play(Note n) { System.out.println("Stringed.play() " + n); }
	public String toString() { return "Stringed"; }
	void adjust() { System.out.println("Adjusting Stringed"); }
}

class Brass extends Wind {
	void play(Note n) { System.out.println("Brass.play() " + n); }
	void adjust() { System.out.println("Adjusting Brass"); }
}

class Woodwind extends Wind {
	void play(Note n) { System.out.println("Woodwind.play() " + n); }
	public String toString() { return "Woodwind"; }
}

class Guitar extends Stringed {
	void play(Note n) { System.out.println("Guitar.play() " + n); }
	public String toString() { return "Stringed"; }
}

public class Music {
	private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();
	
	// Doesn’t care about type, so new types
	// added to the system still work right:
	public static void tune(Instrument i) {
		// ...
		System.out.println(i);
		i.play(Note.MIDDLE_C);
		System.out.println("-------------------------------------------------------");
	}
	
	public static void tuneAll(Instrument[] e) {
		for(Instrument i : e)
			tune(i);
	}
	
	public static void main(String[] args) {
	// Upcasting during addition to the array:
		Instrument[] orchestra = new Instrument[9];
		
		for(int i = 0; i < orchestra.length; i++)
			orchestra[i] = gen.next();
		
		tuneAll(orchestra);
	}
}