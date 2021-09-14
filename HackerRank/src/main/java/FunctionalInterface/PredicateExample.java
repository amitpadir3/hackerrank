package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class User {
    String name, role;

    User(String a, String b) {
        name = a;
        role = b;
    }

    String getRole() {
        return role;
    }

    String getName() {
        return name;
    }

    public String toString() {
        return "User Name : " + name + ", Role :" + role;
    }

}

public class PredicateExample {

    public static void main(String ar[]) {

        Predicate<Integer> greaterThan = (i) -> i > 10;
        Predicate<Integer> lessThan = (i) -> i < 5;
        // predicate chainning
        System.out.println(greaterThan.or(lessThan).test(00));
        List<User> users = new ArrayList<User>();
        users.add(new User("John", "admin"));
        users.add(new User("Peter", "member"));
        Predicate<User> equalsAdmin = (User u) -> u.getRole().equals("admin");

        List<User> result = new ArrayList<>();
        for (User u : users) {
            if (equalsAdmin.test(u)) {
                result.add(u);
            }
        }
        System.out.println(result);
    }
}
