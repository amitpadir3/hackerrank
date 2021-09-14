package Serialization;


import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = -2462640028952668712L;
    private int id;
    private String name;
    private Address addr;

    public Student(int id, String name, Address addr) {
        this.id = id;
        this.name = name;
        this.addr = addr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addr=" + addr +
                '}';
    }
}

class Address implements Serializable {
    private static final long serialVersionUID = 6846972587889194923L;
    private String flat;

    public Address(String flat) {
        this.flat = flat;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    @Override
    public String toString() {
        return "Address{" +
                "flat='" + flat + '\'' +
                '}';
    }
}

public class ComplexObjSerialization {

    public static void main(String ar[]) {
        try {
            //Serializable
            Student obj = new Student(10, "Amit", new Address("mumbai"));
            FileOutputStream fos = new FileOutputStream("a.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("a.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            Student s = (Student) o;
            System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
