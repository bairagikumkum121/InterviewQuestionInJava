package com.string.question;

public class RecursionFirstQuestion {
	public static void oneToFive(int number,int number1) {
		if (number==number1) {
			System.out.println(number);
			return;
		}
		System.out.println(number);
		oneToFive(number + 1,number1);
	}

	public static void main(String[] args) {
		int number = 1;
		int number1=5;
		oneToFive(number,number1);
	}
}
