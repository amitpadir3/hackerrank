package Clone;

class Employee implements Cloneable {
    private String id;
    private String name;
    private Address address;

    public Employee(String id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //DEEP
        Employee e = (Employee) super.clone();
        e.setAddress((Address) address.clone());
        return e;
        // SHALLOW
        //  return super.clone();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}

class Address implements Cloneable {
    private String house;
    private String pin;

    public Address(String house, String pin) {
        this.house = house;
        this.pin = pin;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Address{" +
                "house='" + house + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }
}

public class ShallowAndDeepCopy {

    public static void main(String ar[]) throws CloneNotSupportedException {

        Employee e1 = new Employee("1", "e1", new Address("1", "1"));
        Employee e2 = (Employee) e1.clone();
        e2.getAddress().setPin("2323");
        System.out.println(e1);
        System.out.println(e2);


    }
}
