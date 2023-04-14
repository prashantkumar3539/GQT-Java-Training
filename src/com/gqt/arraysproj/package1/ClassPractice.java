package com.gqt.arraysproj.package1;

import java.util.Scanner;

public class ClassPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count University: ");
		int un =sc.nextInt();
		System.out.println("Enter the count of colleges: ");
		int coll =sc.nextInt();
		System.out.println("Enter the count of classes: ");
		int cls =sc.nextInt();
		System.out.println("Enter the count of Students: ");
		int stu =sc.nextInt();
		int arr[][][][] = new int[un][coll][cls][stu];//4-D array
		//Storing the data
		for(int i=0;i<un;i++) {
			System.out.println("Inside the University "+(i+1));
			for(int j=0;j<cls;j++) {
				System.out.println("The college no."+(j+1));
				for(int k=0;k<cls;k++) {
					System.out.println("The college no."+(k+1));
					for( int l=0;l<stu;l++) {
						System.out.println("Enter the marks of  the student no."+(l+1));
						arr[i][j][k][l]= sc.nextInt();
					}
				}
			}
		}
		
		System.out.println("----------- Marks fetched ---------------");
		//Fetching the data
		for(int i = 0;i < un; i++) {
			System.out.println("Inside the University "+(i+1));
			for(int j = 0;j < coll; j++) {
				System.out.println("The college number "+(j+1)+ " is: "+arr[i][j][0]);
				for(int k = 0;k < cls; k++) {
					System.out.println("The college number "+(j+1)+ " is: "+arr[i][j][k][0]);
					for(int l = 0;l < stu; l++) {
						System.out.println("Inside the University " + (i+1) + " in the college  " + (j+1) +"The class number "+(k+1)+ " the marks of the student number"+(l+1)+" is: " + arr[i][j][k][l]);
					}
			}
					
		}

	}
}
}
