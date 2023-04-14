package com.gqt.strings.pkg1;

public class StringCode1 {

	public static void main(String[] args) {
		
		// Using literals
		String  s1 = "Ramayana";
		
		//Using Objects
		String s2 = new String("Mahabharata");
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
/*
 * Strings in java are used for representing the series of character
 * Strings in java are the build-in class which is present inside the package named as "java.lang"
 *Strings in java do not ends with the null character
 *Strings in java can be categorized into 2 type:
 *	1.Mutable String
 *	2.Immutable String 
 *
 *1.Mutable Strings:
 *		Strings that can  be altered once created
 *		It is represented using StringBuffer and StringBuilder classes
 *
 *2.Immutable Strings:
 *		Strings that can not be altered once created
 *		It is represented using String classe.
 *
 *Different ways to create immutable strings:
 *	1.Using Literals:
 *		The memory for the literal based representaion will be created in the constant pool
 *		of the String Pool in the Heap Segment.
 *		In constant pool the duplication of the data is not permitted  rather the existing
 *		data will be utilized.
 *	2.Using Objects:
 *		The memory for the Object based representaion will be created in the non-constant pool
 *		of the String Pool in the Heap Segment.
 *		In non-constant pool the duplication of the data is permitted.
 *
 *Different ways to compare the Strings:
 *	1.Using equals() to compare the contents of the String
 *	2.Using == to compare the addresses
 *	3.Using equalsIgnoreCase() to compare the contents of the String
 *	4.Using compareTo() to compare the contents of the String

 */
