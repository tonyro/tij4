package net.tonyrovba.tij.polymorphism.shapes;

public class Square extends Shape {
	
	@Override
	public void draw() { System.out.println("Square.draw()"); }
	@Override
	public void erase() { System.out.println("Square.erase()"); }
	
	public void print() { System.out.println("Square.print()"); }

}
