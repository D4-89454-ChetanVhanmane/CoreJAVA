package com.assignment.utilities;

import java.util.Comparator;

import com.assignment.Model.Student;

public class StudentComapratorMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getMarks()-o2.getMarks();
	}

}
