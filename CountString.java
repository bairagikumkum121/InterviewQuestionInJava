package com.string.question;

public class CountString {
	public static void main(String[] args) {
		String str = "this is my program";
		String[] strCount = str.split(" ");
		int count = strCount.length;
		System.out.println(count);
	}
}
