package DesignPatterns.AbstractFactory.Factory;

public class ColorFactory implements AbstarctFactory<Colour> {

    @Override
    public Colour create(String animalType) {
        if ("Black".equalsIgnoreCase(animalType)) {
            return new Black();
        } else if ("White".equalsIgnoreCase(animalType)) {
            return new White();
        }
        return null;
    }
}
