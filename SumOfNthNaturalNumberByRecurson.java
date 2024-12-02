package com.string.question;

public class SumOfNNaturalNumberByRecursion {

	public static void sumOf1ToNthByRecursion(int number, int nthTerm, int sum) {

		sum = sum + number;
		if (number == nthTerm) {
			System.out.println(sum);
			return;
		}
		sumOf1ToNthByRecursion(number + 1, nthTerm, sum);
	}

	public static void main(String[] args) {
		int number = 1;
		int nthTerm = 5;
		int sum = 0;
		sumOf1ToNthByRecursion(number, nthTerm, sum);

	}

}
