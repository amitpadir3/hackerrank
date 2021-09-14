package Recursion;

public class Demo {

	public static void main(String ar[]) {
		first: for (int i = 5; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == j) {
					System.out.println("Match Found");
					System.out.println(i+":"+j);
					break first;
				}
			}
		}
		System.out.println("Outsidce");

	}
}