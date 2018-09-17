package com.example.example.hackerrank;

import java.util.Scanner;

public class JavaLoops1 {
	public static void main(String[] args) {
		/*
		 * Scanner in=new Scanner(System.in); int n=in.nextInt();
		 * System.out.println(n);
		 */
		int n = 3;

		if (n <= 20 && n >= 1) {
			for (int i = 1; i <= 10; i++) {
				//System.out.println(i * n);
				System.out.println(n+" x "+i+" = "+ i * n);
			}
		}
	}

}
