package net.tonyrovba.tij.operators.stringcomparison;

public class StringComparisonMain {

	static void compareStrings (String str1, String str2) {
		System.out.println("First string: " + str1);
		System.out.println("Second string: " + str2);
		
		System.out.println("str1 == str2: " + (str1 == str2));
		System.out.println("str1 != str2: " + (str1 != str2));
		System.out.println("str1.equals(str2): " + (str1.equals(str2)));
		
		System.out.println("-------------------------------------------");
	}
	
	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "xyz";
		String str3 = "ABC";
		String str4 = "XYZ";
		
		compareStrings(str1, str2);
		compareStrings(str1, str3);
		compareStrings(str1, str4);
		
		compareStrings(str2, str3);
		compareStrings(str2, str4);
		
		compareStrings(str1, str1);

	}

}
