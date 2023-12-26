package com.test.logics;

public class ReverseWordsInString {
	public static void main(String[] args) {
		String input = "Hi Praveen welcome";
		String reversed = reverseWords(input);
		System.out.println(reversed);
	}

	public static String reverseWords(String input) {
		String[] words = input.split(" "); 
		StringBuilder result = new StringBuilder();

		for (int i = words.length - 1; i >= 0; i--) {
			result.append(words[i]).append(" ");
		}

		return result.toString().trim(); 
	}
}
