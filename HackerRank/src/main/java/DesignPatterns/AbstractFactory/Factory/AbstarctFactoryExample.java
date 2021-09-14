package DesignPatterns.AbstractFactory.Factory;

public class AbstarctFactoryExample {

    public static void main(String ar[]) {
        FactoryProvider factoryProvider = new FactoryProvider();
        AbstarctFactory animal = factoryProvider.getFactory("Animal");
        Animal dog = (Animal) animal.create("DOG");
        System.out.println(dog.getType());
    }
}
