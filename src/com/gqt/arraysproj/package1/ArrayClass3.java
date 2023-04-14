package com.gqt.arraysproj.package1;

import java.util.Scanner;

public class ArrayClass3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of school: ");
		int sch =sc.nextInt();
		System.out.println("Enter the count of classes: ");
		int cls =sc.nextInt();
		System.out.println("Enter the count of students: ");
		int stu =sc.nextInt();
		int arr[][][] = new int[sch][cls][stu];//3-D array
		//Storing the data
		for(int i=0;i<sch;i++) {
			System.out.println("Inside the school "+(i+1));
			for(int j=0;j<cls;j++) {
				System.out.println("The class no."+(j+1));
				for( int k=0;k<stu;k++) {
					System.out.println("Enter the marks of  the student no."+(k+1));
					arr[i][j][k]= sc.nextInt();
				}
			
			}
		}
		System.out.println("----------- Marks fetched ---------------");
		//Fetching the data
		for(int i = 0;i < sch; i++) {
			System.out.println("Inside the school "+(i+1));
			for(int j = 0;j < cls; j++) {
				System.out.println("The class number "+(j+1)+ " is: "+arr[i][j][0]);
				for(int k = 0;k < stu; k++) {
					System.out.println("Inside the school " + (i+1) + " in the class number " + (j+1) + " the marks of the student number"+(k+1)+" is: " + arr[i][j][k]);
				}
			}
					
		}

	}
}


/*
	package com.gqt.arraysproj.package1;
	
	import java.util.Scanner;
	
	public class ArrayClass3 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the count of school: ");
			int sch = sc.nextInt();
			System.out.println("Enter the count of classes: ");
			int cls = sc.nextInt();
			System.out.println("Enter the count of students: ");
			int stu = sc.nextInt();
			int arr[][][] = new int[sch][cls][stu];//3-D array
			//Storing the data
			for(int i = 0; i < sch; i++) {
				System.out.println("Inside the school " + (i+1));
				for(int j = 0; j < cls; j++) {
					System.out.println("The class no." + (j+1));
					for(int k = 0; k < stu; k++) {
						System.out.println("Enter the marks of the student no." + (k+1));
						arr[i][j][k] = sc.nextInt();
					}
				}
			}
			System.out.println("----------- Marks fetched ---------------");
			//Fetching the data
			for(int i = 0; i < sch; i++) {
				System.out.println("Inside the school " + (i+1));
				for(int j = 0; j < cls; j++) {
					System.out.println("The class number " + (j+1) + " is: " + arr[i][j][0]);
					for(int k = 0; k < stu; k++) {
						System.out.println("Inside the school " + (i+1) + " in the class number " + (j+1) + " the marks of the student number"+(k+1)+" is: " + arr[i][j][k]);
					}
				}
			}
			sc.close();
		}
	}
*/
