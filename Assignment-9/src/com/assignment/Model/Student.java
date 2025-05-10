package com.assignment.Model;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private int rollNo;
	private String name;
	private String city;
	private int marks;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student(int rollNo, String name, String city, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.city = city;
		this.marks = marks;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {

		return this.rollNo - o.rollNo;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(city, marks, name, rollNo);
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollNo == other.rollNo;
	}

}
