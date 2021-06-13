package com.hackerRank.java;

public class Kangaroo {

	public static void main(String ar[]) {
		check(4,2,0,3);
	}

	private static void check(int x1, int v1, int x2, int v2) {

		System.out.println("Match Found:" + getCount(x1, v1, x2, v2));
	}

	private static String getCount(int x1, int v1, int x2, int v2) {
		if (x1 + v1 <= x2 + v2) {
			while (x1 + v1 <= x2 + v2) {
				x1 = x1 + v1;
				x2 = x2 + v2;
				if (x1 == x2) {
					return "YES";
				}
			}
		} else {
			while (x2 + v2 >= x1 + v1) {
				x1 = x1 + v1;
				x2 = x2 + v2;
				if (x1 == x2) {
					return "YES";
				}
			}
		}
		return "NO";
	}
}
