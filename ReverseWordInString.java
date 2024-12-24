package com.string.question;

import java.util.Arrays;
import java.util.Iterator;

public class ReverseWordInString {
	public static void main(String[] args) {
		String str = "yeh mukmuk";
		String[] str1 = str.split(" ");
		for (int i = 0; i < str1.length; i++) {
			String s = str1[i];
			char[] ch = s.toCharArray();
			for (int j = ch.length - 1; j >=0; j--) {
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}

	}
}


/*
input= yeh kumkum
output=hey mukmuk
*/
