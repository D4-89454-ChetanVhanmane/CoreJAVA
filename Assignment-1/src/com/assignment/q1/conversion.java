package com.assignment.q1;

import java.util.Scanner;

//1. Accept a integer number and when the program is executed print the binary, octal and hexadecimal equivalent of the given number.
//Sample Output:
//	java Test
//	Enter Number : 20
//	Given Number :20
//	Binary equivalent :10100
//	Octal equivalent :24
//	Hexadecimal equivalent :14
//	Hint : toBinaryString() , toOctalString(), toHexString()
public class conversion {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Number :");
		
		int first=sc.nextInt();
		
//		System.out.println("Enter the second Number :");
//		 
//		int second=sc.nextInt();
		System.out.println("Given Number Is -> "+ first);
		System.out.println("Binary equivalent -> "+Integer.toBinaryString(first));
		System.out.println("Octal equivalent -> "+Integer.toOctalString(first));
		System.out.println("Hexadecimal equivalent -> "+Integer.toHexString(first));

	}
}
