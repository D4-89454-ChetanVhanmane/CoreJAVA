package com.assignment.q3;

import java.util.Arrays;
import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		menuModal arr[] = { new menuModal(1, "Idalli  ", 20), new menuModal(2, "Dossa   ", 20),
				new menuModal(3, "Uattappa", 20), new menuModal(4, "Chapati ", 20), new menuModal(5, "Sambhar ", 20),
				new menuModal(6, "chattani", 20), new menuModal(7, "Dal     ", 20) };

		System.out.println("------------------------ Menu ------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].id + ")");
			System.out.print(arr[i].item + " -------------------- ");
			System.out.println("₹ " + arr[i].price);
		}
		System.out.println("8. Generate Bill");
		System.out.println("------------------------------------------------------");

		System.out.println();
		int chooise = -1;
		int sum = 0;
		while (chooise != 8) {
			System.out.println("Enter Your Chooise: -");
			chooise = sc.nextInt();
			if (chooise == 8) {
				System.out.println("Total is "+sum);
                System.out.println("Exiting...");
                break;
            }

            if (chooise < 1 || chooise > arr.length) {
                System.out.println("Choose a correct option between 1 and " + arr.length + "!");
                continue;  // ask again without breaking
            }
			sum += arr[chooise-1].price;

		} ;
		

	}
}
