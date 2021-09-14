package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapWithEqualsAndHashcode {
    public static void main(String ar[]) {
        Map<Emp, String> map = new HashMap<>();
        Emp e1 = new Emp("1", "Amit");
        Emp e2 = new Emp("1", "Amit");
        map.put(e1, "IND");
        map.put(e2, "IND");

        for (Map.Entry<Emp, String> e : map.entrySet()) {
           System.out.println("OBJE1>>" + e.getKey().id);
        }
        // Senario 2 search based on object

        Map<Emp, String> map1 = new HashMap<>();
        Emp e11 = new Emp("1", "Amit");
        Emp e21 = new Emp("2", "Amit1");
        map1.put(e11, "IND");
        map1.put(e21, "SA");
        for (Map.Entry<Emp, String> e : map1.entrySet()) {
            System.out.println("OBJE2>>" + e.getKey().id);
        }
        System.out.println("Search " + search(map1, new Emp("1", "Amit")));

    }

    private static String search(Map<Emp, String> map1, Emp amit) {

        return map1.get(amit);
    }
}
