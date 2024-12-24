package com.string.question;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateDigitInArray {

	public static void main(String[] args) {
		int[] array= {1,22,32,2,2,2,3,4,5,4,3};
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<array.length;i++) {
			set.add(array[i]);
		}
		System.out.println(set);
	}

}
