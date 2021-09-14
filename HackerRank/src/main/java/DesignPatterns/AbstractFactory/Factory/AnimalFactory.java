package DesignPatterns.AbstractFactory.Factory;

public class AnimalFactory implements AbstarctFactory<Animal> {

    @Override
    public Animal create(String animalType) {
        if ("DOG".equalsIgnoreCase(animalType)) {
            return new Dog();
        } else if ("Cat".equalsIgnoreCase(animalType)) {
            return new Cat();
        }
        return null;
    }
}
