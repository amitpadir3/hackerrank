package DesignPatterns.AbstractFactory.Factory;

public class FactoryProvider {
    public static AbstarctFactory getFactory(String choice) {
        if ("Animal".equalsIgnoreCase(choice)) {
            return new AnimalFactory();
        } else if ("Color".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        }
        return null;
    }
}
