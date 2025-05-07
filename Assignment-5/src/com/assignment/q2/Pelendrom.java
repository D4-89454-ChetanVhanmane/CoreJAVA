package com.assignment.q2;

public class Pelendrom {
	public static boolean pelendrom(String str) {
		int i=0,j=str.length()-1;
		if(j==1) {
			return true;
		}
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;j--;
		}
		return true;
	}
	public static void main(String[] args) {
       
		boolean bool=pelendrom("cheataehc");
		System.out.println(bool ? "Given string is palindrome" : "Given string is not a palindrome");

	}
}
