package net.tonyrovba.tij.polymorphism.shapes;

public class Circle extends Shape {
	
	@Override
	public void draw() { System.out.println("Circle.draw()"); }
	@Override
	public void erase() { System.out.println("Circle.erase()"); }
	
	public void print() { System.out.println("Circle.print()"); }

}
