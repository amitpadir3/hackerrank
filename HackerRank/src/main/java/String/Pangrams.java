package String;

public class Pangrams {

	// Complete the hackerrankInString function below.
	static String hackerrankInString(String s) {
		boolean[] mark = new boolean[26];
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				mark[s.charAt(i) - 'a'] = true;
			}
		}
		for (int i = 0; i <= 25; i++)
			if (mark[i] == false)
				return "not pangram";
		return "pangram";

	}

	public static void main(String[] args) {

		String result = hackerrankInString("rhackerank");
		System.out.println(result);
	}

}
