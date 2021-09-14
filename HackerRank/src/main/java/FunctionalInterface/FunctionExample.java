package FunctionalInterface;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String ar[]) {

        Function<Integer, Integer> sqaure = (i) -> i * i;
        System.out.println(sqaure.andThen(sqaure).apply(2));
    }
}
