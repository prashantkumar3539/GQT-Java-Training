package com.gqt.strings.pkg1;

import java.util.Scanner;

public class StringCode14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str =sc.next(); 
		String str2="";
		for (int i=str.length()-1;i>=0;i--) {
			str2=str2+str.charAt(i);
		}
		if(str.equals(str2)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");

		}
		
	}

}
