package cpm.print.even.string;

import java.util.Iterator;

public class PrintOnlyEvenString {
	public static void main(String[] args) {
		String str = "hello i am kumkum vaishnav";
		evenString(str);
	}

	private static void evenString(String str) {
		for (String s : str.split(" ")) {
			if (s.length() % 2 == 0) {
				System.out.println(s);
			}
		}

	}
}
