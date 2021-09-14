package Association;

class Address {
    String city;
    String state;
    String country;

    Address(String c, String st, String coun) {
        this.city = c;
        this.state = st;
        this.country = coun;
    }
}

class Employee {
    String id;
    String empName;
    //Creating HAS-A relationship with Address class
    Address empAdr;

    Employee(String id, String empName, Address empAdr) {
        this.id = id;
        this.empName = empName;
        this.empAdr = empAdr;
    }
}

public class Aggrigation {

    public static void main(String ar[]) {

        Address ad = new Address("Agra", "UP", "India");
        Employee emp = new Employee("a", "b", ad);
    }
}