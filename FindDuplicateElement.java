package com.string.question;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindDuplicateElement {

	public static void main(String[] args) {
		int[] arrays = { 1, 2,2,3,4,4,22,22};
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arrays.length; i++) {
			for (int j = i + 1; j < arrays.length; j++) {
				if (arrays[i] == arrays[j]) {
					set.add(arrays[i]);
				}
			}
		}
		System.out.println(set);


	}

}
