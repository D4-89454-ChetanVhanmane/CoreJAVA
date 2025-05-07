package com.Assignment.modal;

public class Student {
	private String name;
	private double mark;
	private String city;

	public Student(String name, double mark, String city) {
		super();
		this.name = name;
		this.mark = mark;
		this.city = city;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", mark=" + mark + ", city=" + city + "]";
	}

	
}
