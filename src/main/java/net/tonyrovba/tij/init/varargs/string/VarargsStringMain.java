package net.tonyrovba.tij.init.varargs.string;

public class VarargsStringMain {

	static void m(String...strings) {
		for (String str: strings) {
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		String[] strArr = {"098", "zyx", ")(*"};
		m("123", "abc", "!@#");
		m(strArr);

	}

}
