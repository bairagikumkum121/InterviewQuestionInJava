package com.string.question;

public class ReverseStringByRecursion {
	public static void reverseString(String str, int length) {
		System.out.println(str.charAt(length));
		if (length == 0) {
			return;
		}
		reverseString(str, length - 1);

	}

	public static void main(String[] args) {
		String str = "kumkum";
		int length = str.length();
		reverseString(str, length-1);
	}
}
