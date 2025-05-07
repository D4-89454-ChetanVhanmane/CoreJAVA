package com.Assignment.utility;

import java.util.Comparator;

import com.Assignment.modal.Student;

public class StudentComaprator implements Comparator<Student>{

	@Override
	public int compare(Student x, Student y) {
		return y.getCity().compareTo(x.getCity());
	}


}
