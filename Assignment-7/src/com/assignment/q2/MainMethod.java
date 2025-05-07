package com.assignment.q2;

import com.assignment.Exception.DiameterException;

public class MainMethod {

	public static void main(String[] args) {
		try {
			Circle c=new Circle(0,0,0);
		} catch (DiameterException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
