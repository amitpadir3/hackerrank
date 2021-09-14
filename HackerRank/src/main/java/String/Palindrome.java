package String;

public class Palindrome {
    public static void main(String ar[]) {
        String s = "abcdscba";
        //way 1
        boolean isPalindrome = true;
        int n = s.length();
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("String is: " + (isPalindrome ? "YES" : "NO"));
        // Way2
        StringBuffer sb= new StringBuffer(s);
        System.out.println("String is: " + (s.equals(sb.reverse().toString()) ? "YES" : "NO"));

    }
}
