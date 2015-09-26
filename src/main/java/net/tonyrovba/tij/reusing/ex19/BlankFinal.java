/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.tonyrovba.tij.reusing.ex19;

/**
 *
 * @author tonyr
 */


class Blank {
	private String name;

	public Blank(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "class Blank number " + this.name;
	}
}

public class BlankFinal {

	public final int i;
	public final Blank blank;
	
	public BlankFinal() {
		this.i = 0;
		this.blank = new Blank("N/A");
	}
	
	public BlankFinal(int i, String name) {
		this.i = i;
		this.blank = new Blank(name);
	}

}
