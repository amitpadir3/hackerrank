package DesignPatterns.Factory;

public class PolygonFactory {

    Polygon getPolygon(int numberOfSides) {
        if (numberOfSides == 3) {
            return new Triangle();
        }
        if (numberOfSides == 4) {
            return new Square();
        }
        return null;
    }

}
