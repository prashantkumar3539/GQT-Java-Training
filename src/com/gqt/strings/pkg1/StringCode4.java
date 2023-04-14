package com.gqt.strings.pkg1;

public class StringCode4 {

	public static void main(String[] args) {
		String s1 = "Prashant";
		String s2 = "praShanT";
		
		if (s1.equalsIgnoreCase(s2)== true) {
			System.out.println("Strings are equal");
		}
		else{
			System.out.println("Strings are  not equal");
		}
	}

}
