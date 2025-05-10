package com.assignment.q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.assignment.Model.Student;
import com.assignment.utilities.StudentUtilities;

//Q1. Create a menu driven code that have below menus
//1. add the student in the collection - accept the details from user and add in the collection
//2. Display all the students using iterator.
//3. search the student on rollno and if found display his details.
//4. sort the students on rollno
//5. sort the students on name
//6. sort the students on marks
//(Hint - use List Interface and Object of ArrayList)
public class Menulist {
	public static Scanner sc = new Scanner(System.in);

	public static int menu() {
		System.out.println("0. Exit");
		System.out.println(
				"1. add the student in the collection - accept the details from user and add in the collection");
		System.out.println("2. Display all the students using iterator.");
		System.out.println("3. search the student on rollno and if found display his details.");
		System.out.println("4. sort the students on rollno");
		System.out.println("5. sort the students on name");
		System.out.println("6. sort the students on marks");

		int choise = sc.nextInt();
		return choise;
	}

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		int choise = 0;
		StudentUtilities studentUtilities = new StudentUtilities();
		while ((choise = menu()) != 0) {
			try {
				switch (choise) {
				case 1:
					studentUtilities.addStudents(list);
					System.out.println("Added successfully !!!");
					System.out.println("------------------------------------------------------");
					break;
				case 2:
					System.out.println("------------------------------------------------------");
					studentUtilities.displayStudent(list, null);
					System.out.println("------------------------------------------------------");
					break;
				case 3:
					System.out.println("------------------------------------------------------");
					int index = studentUtilities.searchStudent(list);
					if (index != -1)
						studentUtilities.displayStudent(list, index);
					else
						System.out.println("User not found");
					System.out.println("------------------------------------------------------");
					break;
				case 4:
					System.out.println("------------------------------------------------------");
					studentUtilities.sortRecord("rollno", list);
					studentUtilities.displayStudent(list, null);
					System.out.println("------------------------------------------------------");
					break;
				case 5:
					System.out.println("------------------------------------------------------");
					studentUtilities.sortRecord("name", list);
					studentUtilities.displayStudent(list, null);
					System.out.println("------------------------------------------------------");
					break;
				case 6:
					System.out.println("------------------------------------------------------");
					studentUtilities.sortRecord("", list);
					studentUtilities.displayStudent(list, null);
					System.out.println("------------------------------------------------------");
					break;
				default:
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
