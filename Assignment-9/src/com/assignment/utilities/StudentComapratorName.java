package com.assignment.utilities;


import java.util.Comparator;

import com.assignment.Model.Student;


public class StudentComapratorName implements Comparator<Student> {

	@Override
	public int compare(Student x, Student y) {
		// TODO Auto-generated method stub
		return x.getName().compareTo(y.getName());
	}

}
