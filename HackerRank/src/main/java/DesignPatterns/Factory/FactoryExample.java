package DesignPatterns.Factory;

public class FactoryExample {

    public static void main(String ar[]) {
        PolygonFactory polygonFactory = new PolygonFactory();
        Polygon polygon = polygonFactory.getPolygon(3);
        System.out.println(polygon.getType());
        Polygon polygon1 = polygonFactory.getPolygon(4);
        System.out.println(polygon1.getType());
    }
}
