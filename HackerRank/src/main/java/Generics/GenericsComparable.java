package Generics;

public class GenericsComparable {

	public static <T extends Comparable<T>> T findMax(T a, T b) {
		int n = a.compareTo(b);

		if (n < 0)
			return b;
		else
			return a;
	}

	public static void main(String[] args) {

		System.out.println(findMax(10, 20));
		System.out.println(findMax(20.30, 20.20));
		System.out.println(findMax("hello", "there"));
	}
}