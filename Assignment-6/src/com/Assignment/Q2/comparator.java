package com.Assignment.Q2;

import java.util.Arrays;

import com.Assignment.modal.Student;
import com.Assignment.utility.StudentComaprator;
import com.Assignment.utility.StudentComapratorName;
import com.Assignment.utility.StudentComapratorRoll;

public class comparator {

	public static void main(String[] args) {
		Student[] student = new Student[4];
		student[0] = new Student("Chetan", 80, "solapur");
		student[1] = new Student("Komal", 67, "pune");
		student[2] = new Student("Sonali", 7, "delhi");
		student[3] = new Student("Nikita", 6, "mumbai");
		
		Arrays.sort(student,new StudentComaprator());
		for(Student st:student) {
//			System.out.println(st.getCity()+" "+st.getMark()+" "+st.getName()+" ");
			System.out.println(st);
			
		}
		System.out.println("------------------------------------------------------------------");

		Arrays.sort(student,new StudentComapratorName());
		for(Student st:student) {
			System.out.println(st.getCity()+" "+st.getMark()+" "+st.getName()+" ");
			
		}
		System.out.println("------------------------------------------------------------------");
		Arrays.sort(student,new StudentComapratorRoll());
		for(Student st:student) {
			System.out.println(st.getCity()+" "+st.getMark()+" "+st.getName()+" ");
			
		}
	}

}
