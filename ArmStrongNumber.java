package com.string.question;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int number = 123;
		int l = 0;
		int number2 = number;
		while (number > 0) {
			number /= 10;
			l++;
		}
		int sum = 0;
		number = number2;
		while (number2 > 0) {
			int n = number2 % 10;
			int mul = 1;
			for (int i = 0; i < l; i++) {
				mul *= n;
			}
			sum += mul;
			number2 /= 10;

		}
		if (sum == number) {
			System.out.println("Armstrong number.");
		} else {
			System.out.println("Not armstrong number. ");
		}
	}
}
