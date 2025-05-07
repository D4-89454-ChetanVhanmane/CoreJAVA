package com.Assignment.utility;

import java.util.Comparator;

import com.Assignment.modal.Student;

public class StudentComapratorName implements Comparator<Student> {

	@Override
	public int compare(Student x, Student y) {
		// TODO Auto-generated method stub
		return x.getName().compareTo(y.getName());
	}

}
