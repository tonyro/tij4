package net.tonyrovba.tij.polymorphism.shapes;

public class Cube extends Shape {
	
	@Override
	public void draw() { System.out.println("Cube.draw()"); }
	@Override
	public void erase() { System.out.println("Cube.erase()"); }
	
	public void print() { System.out.println("Cube.print()"); }

}
