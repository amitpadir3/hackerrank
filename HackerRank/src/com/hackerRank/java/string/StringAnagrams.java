package com.hackerRank.java.string;

import java.util.Scanner;

public class StringAnagrams {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		StringBuilder sb = new StringBuilder(A);
		System.out.println(A.equals(new StringBuilder(A).reverse().toString()) ? "Yes" : "No");
	}
}
