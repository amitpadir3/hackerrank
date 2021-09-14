package DesignPatterns.AbstractFactory.Factory;

public interface AbstarctFactory<T> {
    T create(String animalType);
}
