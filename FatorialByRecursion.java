package com.string.question;

public class FactorialByRecurson {
	public static void main(String[] args) {
		int number = 6;
		factorial(number);
	}

	public static int factorial(int number) {
		if (number == 1 || number == 0) {
			return 1;
		}
		int n = factorial(number - 1);
		int fact = number * n;
		return fact;

	}
}
