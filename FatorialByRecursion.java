package com.string.question;

public class FactorialByRecurson {
	public static void main(String[] args) {
		int number = 6;
		int total = 1;
		factorial(number, total);
	}

	public static void factorial(int number, int total) {
		total *= number;
		if (number == 2) {
			System.out.println(total);
			return;
		}
		factorial(number - 1, total);

	}
}
