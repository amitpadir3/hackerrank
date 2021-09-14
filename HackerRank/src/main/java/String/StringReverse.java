package String;

public class StringReverse {

	public static void main(String ar[]) {
		String s = reverse("abcd");
		System.out.println(s);
	}

	private static String reverse(String s) {
		if (s.length() == 1) {
			return s;
		}

		return reverse(s.substring(1)) + s.charAt(0);
	}

}
