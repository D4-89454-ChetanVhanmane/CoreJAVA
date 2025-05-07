package com.assignment.q1;

import java.util.Scanner;

public class CustomException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();
		try {
			if (str.length() >= 80) {
				throw new LengthException("The string is to long");
			} else {
				System.out.println("Length of the string is :" + str.length());
			}
		} catch (LengthException e) {
			System.out.println(e.getMessage());
		}
	}

}
