package net.tonyrovba.tij.operators.velocity;

public class Velocity {

	final static int DISTANCE_KM = 200;
	final static int TIME_MIN = 400;
	
	public static void main(String[] args) {
		
		System.out.println("Velocity is: " + (double)DISTANCE_KM / (double)TIME_MIN + " km/min");
		System.out.println("Velocity is: " + (double)DISTANCE_KM / (double)TIME_MIN * 60 + " km/h");

	}

}
