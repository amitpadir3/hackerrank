package FunctionalInterface;

@FunctionalInterface
interface Square {
    int calculate(int x);
}

public class FunctionalInterFaceExample {
    public static void main(String ar[]) {
        int a = 5;
        Square s = (int x) -> x * x;
        System.out.println("Output:" + s.calculate(5));
    }
}
