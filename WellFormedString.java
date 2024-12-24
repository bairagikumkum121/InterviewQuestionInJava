package com.string.question;

import java.util.Iterator;
import java.util.Stack;

public class WellFormedString {
	public static void main(String[] args) {
		String str = "{([)}";
		char[] chArray=str.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < chArray.length; i++) {
			if (stack.empty()) {
				stack.push(chArray[i]);
			} else if (chArray[i] == '{' || chArray[i] == '[' || chArray[i] == '(') {
				stack.push(chArray[i]);
			} else if (chArray[i] == '}' && stack.peek() == '{') {
				stack.pop();
			} else if (chArray[i]== ']' && stack.peek() == '[') {
				stack.pop();
			} else if (chArray[i] == ')' && stack.peek() == '(') {
				stack.pop();
			}
		}
		if (stack.empty()) {
			System.out.println("String is well formed");
		} else {
			System.out.println("String is not well formed");
		}
	}
}
