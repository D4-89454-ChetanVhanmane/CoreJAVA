package com.assignment.q1;

public class ReverseString {
	public static String reverseString(String str) {
		str = str.trim();
		char[] ch = str.toCharArray();
	
		int first = 0, last = ch.length-1;
		while (first < last) {
			char temp = ch[first];
			ch[first] = ch[last];
			ch[last] = temp;
			first++;
			last--;
		}
		return new String(ch);
	}

	public static void main(String[] args) {
       String str= reverseString("chetan");
        System.out.println(str);
	}
}
