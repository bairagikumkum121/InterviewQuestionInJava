package com.string.question;

public class FirstLastCharcterAccuranceByRecursion {
	private static int first = -1;
	private static int last = -1;

	public static void firstLastAccurance(String str, char element, int i) {
		char index = str.charAt(i);
		if (str.length()-1 == i) {
			System.out.println(first + " " + last);
			return;
		}
		if (index == element) {
			if (first == -1) {
				first = i;
			} else {
				last = i;
			}
		}
		firstLastAccurance(str, element, i+1);
	}

	public static void main(String[] args) {
		String str = "baasgdhae";
		char element = 'a';
		int i = 0;
		firstLastAccurance(str, element, i);

	}
}
