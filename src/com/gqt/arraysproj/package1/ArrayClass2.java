package com.gqt.arraysproj.package1;

import java.util.Scanner;

public class ArrayClass2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of classes: ");
		int cls =sc.nextInt();
		System.out.println("Enter the count of students: ");
		int stu =sc.nextInt();
		int arr[][] = new int[cls][stu];//2-D array
		//Storing the data
		for(int i=0;i<cls;i++) {
			System.out.println("Inside the class "+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("Enter the marks of  the student no."+(j+1));
				arr[i][j]= sc.nextInt();
			}
			
		}
		System.out.println("----------- Marks fetched ---------------");
		//Fetching the data
		for(int i=0;i<cls;i++) {
			System.out.println("Inside the class "+i+1);
			for(int j=0;j<stu;j++) {
				System.out.println("The marks of the student number "+(j+1)+ " is: "+arr[i][j]);
			}
					
		}

	}

}
