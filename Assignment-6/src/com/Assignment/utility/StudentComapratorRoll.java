package com.Assignment.utility;

import java.util.Comparator;

import com.Assignment.modal.Student;

public class StudentComapratorRoll implements Comparator<Student>{

	@Override
	public int compare(Student x, Student y) {
		// TODO Auto-generated method stub
		return (int) (x.getMark()-y.getMark());
	}

}
