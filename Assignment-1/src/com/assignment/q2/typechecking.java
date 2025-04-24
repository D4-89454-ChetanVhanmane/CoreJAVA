package com.assignment.q2;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class typechecking {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Set locale to US to accept dot (.) as decimal separator
//		scanner.useLocale(Locale.US);

		System.out.println("Enter the first double value:");
		if (!scanner.hasNextDouble()) {
			System.out.println("Error: First input is not a valid double.");
			scanner.close();
			return;
		}
		double num1 = scanner.nextDouble();

		System.out.println("Enter the second double value:");
		if (!scanner.hasNextDouble()) {
			System.out.println("Error: Second input is not a valid double.");
			scanner.close();
			return;
		}
		double num2 = scanner.nextDouble();

		scanner.close();

		double average = (num1 + num2) / 2;
		System.out.println("Average: " + average);
	}
}
