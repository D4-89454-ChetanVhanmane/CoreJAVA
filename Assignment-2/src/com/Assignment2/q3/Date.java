package com.Assignment2.q3;

//3. Create a class called Date that includes three instance variables—a month (type int), a day (type int) and a year (type int). 
//Provide a constructor that initializes the three instance variables and assumes that the values provided are correct. 
//Provide a set and a get method for each instance variable. 
//Provide a method displayDate that displays the month, day and year separated by forward slashes (/).
//Write a test application named DateTest that demonstrates class Date’s capabilities.
public class Date {
	private int month;
	private int day;
	private int year;

	public Date(int month, int day, int year) {
		super();
		if (month > 0 && month < 13) {
			this.month = month;
		} else {
			this.month = 1;
		}
		if (day > 0 && day < 13) {
			this.day = day;
//			  this.month = month;
		} else {
			this.day = 1;
		}
		if (year > 0) {
			this.year = year;
//			this.day = day;
//			  this.month = month;
		} else {
			this.year = 1990;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month > 0 && month < 13) {
			this.month = month;
		} else {
			this.month = 1;
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day > 0 && day < 13) {
			this.day = day;
//			  this.month = month;
		} else {
			this.day = 1;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year > 0) {
			this.year = year;
//			this.day = day;
//			  this.month = month;
		} else {
			this.year = 1990;
		}
	}

	@Override
	public String toString() {
		return "Date =" + month + "/" + day + "/" + year;
	}

}
