package com.string.question;

public class RecursionSecondProgram {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		int mul = 1;

		multiplication(x, y, mul);
	}

	private static void multiplication(int x, int y, int mul) {
		mul *= x;
		if (y == 1) {
			System.out.println(mul);
			return;
		}
		multiplication(x, y - 1, mul);

	}
}
