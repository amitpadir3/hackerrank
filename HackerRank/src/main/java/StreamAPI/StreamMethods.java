package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class StreamMethods {

    public static void main(String ar[]) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int sum = list.stream().filter(i -> i % 2 != 0).mapToInt(i -> i*i).sum();
        System.out.println(sum);
    }
}
