package com.gqt.arraysproj.package1;

import java.util.Scanner;

public class ArrayCode1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of Student: ");
		int n =sc.nextInt();
		int arr[] = new int[5];
		for(int i=0;i<=n-1;i++) {
			System.out.println("Enter the marks of  the student no."+(i+1));
			arr[i]= sc.nextInt();
		}
		System.out.println("----------- Marks fetched ---------------");
		System.out.println();
		for(int i=0;i <=n-1;i++) {
			System.out.println("The marks of the student no "+i+1+ " is : "+i);
		}

	}

}
