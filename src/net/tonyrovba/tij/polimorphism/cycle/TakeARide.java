package net.tonyrovba.tij.polimorphism.cycle;

class Cycle {
	public void pedal() {
		System.out.println("Cycle.pedal()");
	}
	
	public int wheels() {
		return 0;
	}
}

class Unicycle extends Cycle {
	public void pedal() {
		System.out.println("Unicycle.pedal()");
	}
	
	public int wheels() {
		return 1;
	}
}

class Bicycle extends Cycle {
	public void pedal() {
		System.out.println("Bicycle.pedal()");
	}
	
	public int wheels() {
		return 2;
	}
}

class Tricycle extends Cycle {
	public void pedal() {
		System.out.println("Tricycle.pedal()");
	}
	
	public int wheels() {
		return 3;
	}
}

public class TakeARide {
	public static void ride(Cycle cycle) {
		cycle.pedal();
		System.out.println("Number of wheels is: " + cycle.wheels());
	}
	
	public static void main(String[] args) {
		Unicycle u = new Unicycle();
		Bicycle b = new Bicycle();
		Tricycle t = new Tricycle();
		Cycle c = new Cycle();
		
		ride(u);
		ride(b);
		ride(t);
		ride(c);
	}
}
