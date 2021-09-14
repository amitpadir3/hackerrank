package Generics;

public class ArrayGenerics {

	public static <E> E[] display(E[] arr) {
		for (E ele : arr) {
			System.out.println(ele);
		}
		return arr;
	}

	public static void main(String[] args) {

		Integer[] a = { 1, 2, 3, 4 };
		String[] b = { "1", "2O" };
		display(a);
		display(b);
	}
}