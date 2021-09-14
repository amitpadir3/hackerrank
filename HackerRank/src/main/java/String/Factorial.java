package String;

public class Factorial {

	public static void main(String ar[]) {
		System.out.println(fact(5));
	}

	private static int fact(int n) {
		if (n <= 1) {
			return 1;
		}

		return fact(n-1)*n;
	}

}
