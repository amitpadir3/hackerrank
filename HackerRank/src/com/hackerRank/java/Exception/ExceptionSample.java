package Exception;

import java.util.Scanner;

//Write your code here

class ExceptionSample {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = 1;
		while (t-- > 0) {

			int n = 3;
			int p = -5;
			;
			Calculator myCalculator = new Calculator();
			try {
				int ans = myCalculator.power(n, p);
				System.out.println(ans);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		in.close();
	}
}

class Calculator {

	public int power(int n, int p) throws MyException {
		if (n >= 0 && p >= 0) {
			return (int) Math.pow(n, p);
		} else {
			throw new MyException("n and p should be non-negative");
		}

	}

}

class MyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MyException(String msg) {
		super(msg);
	}
}
