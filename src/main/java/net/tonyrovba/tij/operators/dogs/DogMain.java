package net.tonyrovba.tij.operators.dogs;

class Dog {
	String name;
	String says;
	
	public Dog(String name, String says) {
		this.name = name;
		this.says = says;
	}
}

public class DogMain {

	public static void main(String[] args) {
		Dog spot = new Dog("Spot", "Ruff!");
		Dog scruf = new Dog("Scruffy", "Wurf!");
		
		System.out.println("Dog " + spot.name + " says " + spot.says);
		System.out.println("Dog " + scruf.name + " says " + scruf.says);
		
		System.out.println("------------------------------------------");
		
		Dog nnm = spot;
		
		System.out.println("nnm == spot: " + (nnm == spot));
		System.out.println("nnm.equals(spot): " + nnm.equals(spot));
		
		System.out.println("------------------------------------------");
		
		System.out.println("nnm == scruf: " + (nnm == scruf));
		System.out.println("nnm.equals(scruf): " + nnm.equals(scruf));

	}

}
