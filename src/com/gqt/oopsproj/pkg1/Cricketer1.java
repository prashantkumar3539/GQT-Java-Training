package com.gqt.oopsproj.pkg1;

public class Cricketer1 {
	String name;
	String country;
	int age;
	int jersy_no;
	int runs;
	
	// Zero-Parameterized Constructor
	public Cricketer1() {
		super();
		name="Rohit";
		country="India";
		age=35;
		jersy_no=45;
		runs=17000;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getJersy_no() {
		return jersy_no;
	}

	public void setJersy_no(int jersy_no) {
		this.jersy_no = jersy_no;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public static void main(String[] args) {
		Cricketer1 c1 = new Cricketer1();
		System.out.println(c1.getName());
		System.out.println(c1.getCountry());
		System.out.println(c1.getAge());
		System.out.println(c1.getJersy_no());
		System.out.println(c1.getRuns());
		

	}

}
