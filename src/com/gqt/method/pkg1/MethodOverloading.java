package com.gqt.method.pkg1;

class Calculator{
	int add(int a,int b) {
		return a+b;
	}
	float add(float a,float b) {
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	float add(int a,float b) {
		return a+b;
	}
	float add(float a,int b) {
		return a+b;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		System.out.println(c.add(10, 20));
		System.out.println(c.add(10.5f, 20.5f));
		System.out.println(c.add(10, 20,30));

	}

}
