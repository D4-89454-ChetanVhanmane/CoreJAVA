package com.assignment.utilities;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.assignment.Model.Student;

public class StudentUtilities {
	public Scanner sc = new Scanner(System.in);

	public void addStudents(List<Student> list) {
//		Student s=new Student();
//       System.out.println("Enter RollNumber :");
//       s.setCity(sc.next());
//       System.out.println("Enter Name :");
//       s.setName(sc.next());
//       System.out.println("Enter RollNumber :");
//       s.setRollNo(sc.nextInt());
//       list.add(s);
		list.add(new Student(80, "Chetan", "solapur",70));
		list.add(new Student(67, "Komal", "pune",55));
		list.add(new Student(7, "Sonali", "delhi",90));
		list.add(new Student(6, "Nikita", "mumbai",77));
	}

	public void displayStudent(List<Student> list, Integer index) {
		if (index != null) {
			System.out.println(list.get(index));
		} else {
			Iterator<Student> iterator = list.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
	}

	public int searchStudent(List<Student> list) {
		System.out.println("Enter Roll Number:");
		int rollNumber = sc.nextInt();

		Student s = new Student();
		s.setRollNo(rollNumber);
		int index=list.indexOf(s);
		if(index!=-1) {
			return index;
		}
		return -1;
	}

	public void sortRecord(String s, List<Student> list) {
		if (s == "rollno") {
			Collections.sort(list);
		} else if (s == "name") {
			Collections.sort(list, new StudentComapratorName());
		} else if (s == "city") {
			Collections.sort(list, new StudentComaprator());
		}else {
			Collections.sort(list,new StudentComapratorMarks());
		}
	}
}
