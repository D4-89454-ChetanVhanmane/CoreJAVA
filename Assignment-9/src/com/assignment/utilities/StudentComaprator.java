package com.assignment.utilities;


import java.util.Comparator;

import com.assignment.Model.Student;


public class StudentComaprator implements Comparator<Student>{

	@Override
	public int compare(Student x, Student y) {
		return x.getCity().compareTo(y.getCity());
	}


}
