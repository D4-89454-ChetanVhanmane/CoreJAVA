package com.Assignment.Q1;


//1. Write a generic static method to find minimum from an array of Number.
//2. Use Arrays.sort() to sort array of Students using Comparator. The 1st level sorting should be on city
//(desc), 2nd level sorting should be on marks (desc), 3rd level sorting should be on name (asc).
public class Assignment {

	public static <T extends Number> int minimum(T[] arr) {
		int max=0;
		
		for (int i = 1; i < arr.length; i++) {
			if(max>arr[i].doubleValue()) {
				max=i;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Integer[] arr= {1,2,34,5,6,56,8,9};
		int index=minimum(arr);
		System.out.println(arr[index]);
	}

}
