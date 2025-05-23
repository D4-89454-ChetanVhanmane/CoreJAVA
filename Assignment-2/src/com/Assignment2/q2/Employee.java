package com.Assignment2.q2;

//2.Create a class called Employee that includes three instance variables�a first name (type String), a last name (type String) 
//and a monthly salary (double). Provide a constructor that initializes the three instance variables. Provide a set and a get method
//for each instance variable. If the monthly salary is not positive, do not set its value. Write a test application named EmployeeTest 
//that demonstrates class Employee�s capabilities. Create two Employee objects and display each object�s yearly salary. Then give each 
//Employee a 10% raise and display each Employee�s yearly salary again.
public class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	
	public double raise;
	

	public Employee(String firstName, String lastName, double salary,double raise) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.raise=raise;
//		this.salary = salary;
		if (salary > 0) {
//			System.out.println("Employee :"+salary*raise);
			double sal=salary + salary*(raise/100);
			this.salary = sal;
		} 
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
	}

}
