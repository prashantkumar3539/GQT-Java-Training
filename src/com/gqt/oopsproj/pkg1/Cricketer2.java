package com.gqt.oopsproj.pkg1;

public class Cricketer2 {
	String name;
	String country;
	int age;
	int jersy_no;
	int runs;

	// Parameterized Constructor
	public Cricketer2(String name,String country,int age,int jersy_no,int runs) {
		super();
		this.name=name;
		this.country=country;
		this.age=age;
		this.jersy_no=jersy_no;
		this.runs=runs;
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
		Cricketer2 c2 = new Cricketer2("Rohit","India",35,45,19000);
		System.out.println(c2.getName());
		System.out.println(c2.getCountry());
		System.out.println(c2.getAge());
		System.out.println(c2.getJersy_no());
		System.out.println(c2.getRuns());


	}

}
