import java.util.*;
import java.util.stream.Collectors;


class ReverseNumber {
    public static void main(String ar[]) {


        int num = 1234;
        int reversed = 0;

        // run loop until num becomes 0
        while (num != 0) {

            // get last digit from num
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            num = num / 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
