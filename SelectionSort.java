package com.string.question;

import java.util.Arrays;

public class InsertionSort {
public static void main(String[] args) {
	int[] a= {1,5,2,3,9,0};
	System.out.println("Unsorted list is :"+Arrays.toString(a));
	for(int i=0;i<a.length-1;i++) {
         int smallest=i;
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				smallest=j;
			}
		}
		int temp=a[smallest];
		a[smallest]=a[i];
		a[i]=temp;
	}
	System.out.println(Arrays.toString(a));
}
}
