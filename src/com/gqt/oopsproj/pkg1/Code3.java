package com.gqt.oopsproj.pkg1;

public class Code3 {
	String name;
	String country;
	int age;
	int jersy_no;
	int runs;
	
	// Setters
	public void setName(String name) {
		this.name = name;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setJersy_no(int jersy_no) {
		this.jersy_no = jersy_no;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	//Getters
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public int getAge() {
		return age;
	}
	public int getJersy_no() {
		return jersy_no;
	}
	public int getRuns() {
		return runs;
	}
	

	public static void main(String[] args) {
		Code3 c3 = new Code3();
		c3.setName("Rohit");
		c3.setCountry("India");
		c3.setAge(35);
		c3.setJersy_no(45);
		c3.setRuns(18000);
		System.out.println(c3.getName());
		System.out.println(c3.getCountry());
		System.out.println(c3.getAge());
		System.out.println(c3.getJersy_no());
		System.out.println(c3.getRuns());

	}
	
	

}
