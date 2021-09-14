package Association;

class Engine {
    String name;

    void work() {
        System.out.println("Engine is working");
    }
}

class Car {
    // For a car to move,
    // it need to have a engine.
    private final Engine engine; // Composition
    //private Engine engine;     // Aggregation

    Car(Engine engine) {
        this.engine = engine;
    }

    void move() {
        engine.work();
        System.out.println("Car is Moving");
    }
}

public class Composition {

    public static void main(String ar[]) {
        // making an engine by creating
        // an instance of Engine class.
        Engine engine = new Engine();

        // Making a car with engine.
        // so we are passing a engine
        // instance as an argument while
        // creating instace of Car.
        Car car = new Car(engine);
        car.move();
    }
}