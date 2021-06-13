package com.hackerRank.java;

public class AppleAndOrangeCalculationsONTree {

	public static void main(String ar[]) {
		int s = 7;
		int t = 12 - 1;
		int a = 5;
		int b = 15;
		int apple[] = { -2, 2, 1 };
		int orange[] = { 5, -6 };
		getAplicableFruitsCount(s, t, a, b, apple, orange);
	}

	private static void getAplicableFruitsCount(int s, int t, int a, int b, int[] apple, int[] orange) {

		System.out.println("Apple Count:" + getCount(s, t, a, apple));
		System.out.println("Orange Count:" + getCount(s, t, b, orange));
	}

	private static int getCount(int s, int t, int a, int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			int sum = a + array[i];
			if (sum >= s && sum <= t) {
				count = count + 1;
			}
		}
		return count;
	}
}
