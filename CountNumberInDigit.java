package com.string.question;

import java.util.Scanner;

public class CountNumberInDigit {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number: ");
			int number = sc.nextInt();
			int number1=number;
			System.out.println("ENTER digit: ");
			int d = sc.nextInt();
			int count = 0;
			while (number > 0) {
				int half = number % 10;
				if (half == d) {
					count++;
				}
				number /= 10;

			}
			System.out.println(d+" is "+count+" times in this "+number1);
		
	}

	
}
