package DesignPatterns.Singleton;

class Singleton {
    private static Singleton s = null;

    private Singleton() {
        System.out.println("Singleton");
    }

    public synchronized static Singleton getSingleton() {
        if (s == null) {
            s = new Singleton();
            return s;
        } else {
            return s;
        }
    }
}

public class SingletonExample {
    public static void main(String ar[]) {
        Singleton singleton = Singleton.getSingleton();
    }
}

