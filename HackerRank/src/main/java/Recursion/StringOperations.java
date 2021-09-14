package Recursion;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringOperations {

	public static void main(String ar[]) {
		// printDublicateCharacters("abcdefabca");
		// printPrintEachCharacterOccurence("abcdefabcaabcdefabcaaaaa");
		// getDistintCharFromArray();
		// checkForanagramsString("Army", "Mary");
		// reverseString("abcdadff");
		System.out.println(palindrome("abcdcba"));
	}

	private static boolean palindrome(String s) {
		for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}

	private static void reverseString(String string) {
		StringBuffer sbBuffer = new StringBuffer();
		for (int i = string.length() - 1; i >= 0; i--) {
			sbBuffer.append(string.charAt(i));
		}
		System.out.println(sbBuffer);

		// OR

		System.out.println(new StringBuffer(string).reverse());
	}

	private static void getDistintCharFromArray() {
		char arr[] = { 'a', 'b', 'c', 'd', 'c', 'b', 'd', 'a' };
		StringBuilder s = new StringBuilder(new String(arr));
		s.chars().distinct().forEach(i -> System.out.println((char) i));
	}

	private static void checkForanagramsString(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		boolean a = true;
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				if (s2.indexOf(s1.charAt(i)) == -1) {
					System.out.println("FALSE");
					a = false;
					break;
				}
			}

		} else {
			a = false;
		}
		if (a) {
			System.out.println(" Anagrams");
		} else {
			System.out.println("NOT Anagrams");
		}
	}

	private static void printPrintEachCharacterOccurence(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for (Character c : s.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);

			} else {
				map.put(c, 1);
			}
		}

		for (Entry<Character, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + ":" + m.getValue());
		}
	}

	private static void printDublicateCharacters(String s) {
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.indexOf(s.charAt(i), i + 1) != -1) {
				System.out.print(s.charAt(i));
			}
		}

	}

}
