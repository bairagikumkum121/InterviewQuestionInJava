package com.string.question;

import java.util.Iterator;
import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=num-1;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}for(int j=num-1;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//Output-
/*

      *
     **
    ***
   ****
  *****
 ******
*******
 ******
  *****
   ****
    ***
     **
      *
*/
