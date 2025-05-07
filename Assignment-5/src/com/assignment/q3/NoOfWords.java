package com.assignment.q3;

public class NoOfWords {

	public static int countWord(String str) {
		str = str.trim();
		String[] word = str.split("\\s+");

		for (int i = 0; i < word.length ; i++) {
			System.out.println(i + "->" + word[i]);
		}

		return word.length;
	}

	public static void main(String[] args) {
		int words=countWord("chetan is    an asknfdjlnasf asndflaf fdnjsadnf akmndfj");
		System.out.println("Number of words in the given string is "+words);
	}

}
