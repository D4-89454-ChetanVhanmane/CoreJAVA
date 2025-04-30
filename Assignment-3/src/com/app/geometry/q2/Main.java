package com.app.geometry.q2;

import java.util.Scanner;

/*
 2) (Credit Limit Calculator)
Develop a Java application that determines whether any of several
department-store customers has exceeded the credit limit on a
charge account.
For each customer,the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this
month
e) allowed credit limit.
The program should input all these facts as integers, calculate
the new balance (= beginning balance+ charges – credits),
display the new balance and determine whether the new balance
exceeds the customer’s credit limit. For those customers whose
credit limit is exceeded, the program should display
the message "Credit limit exceeded".
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Ask how many customers you want to process
		System.out.print("Enter number of customers to process: ");
		int numberOfCustomers = scanner.nextInt();

		for (int i = 1; i <= numberOfCustomers; i++) {
			System.out.println("\nCustomer " + i + " details:");

			// Input data for each customer
			System.out.print("Enter account number: ");
			int accountNumber = scanner.nextInt();

			System.out.print("Enter balance at the beginning of the month: ");
			int beginningBalance = scanner.nextInt();

			System.out.print("Enter total of all items charged this month: ");
			int totalCharges = scanner.nextInt();

			System.out.print("Enter total of all credits applied this month: ");
			int totalCredits = scanner.nextInt();

			System.out.print("Enter allowed credit limit: ");
			int creditLimit = scanner.nextInt();

			// Calculate new balance
			int newBalance = beginningBalance + totalCharges - totalCredits;

			// Display new balance
			System.out.println("New balance for account " + accountNumber + " is: " + newBalance);

			// Check if credit limit is exceeded
			if (newBalance > creditLimit) {
				System.out.println("Credit limit exceeded.");
			} else {
				System.out.println("Credit limit not exceeded.");
			}
		}

		scanner.close();
	}

}
