package FunctionalInterface;

import java.util.function.Function;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String ar[]) {

        Supplier<Double> r = () -> Math.random();
        System.out.println(r.get());
    }
}
