package com.string.question;

public class FibonacciSeriesByRecursion {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int term = 8;
		System.out.print(num1 + " " + num2);
		fibonacciSeries(num1, num2, term - 2);
	}

	public static void fibonacciSeries(int num1, int num2, int term) {
		int sum = num1 + num2;
		System.out.print(" " + sum);
		if (term == 0) {
			return;
		}
		fibonacciSeries(num2, sum, term - 1);

	}

}
