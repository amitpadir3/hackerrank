package Thread;

class Task1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("Task1 " + i);
    }
}
class Task2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("Task2 " + i);
    }
}
public class SampleThread {

    public static void main(String ar[]) throws InterruptedException {
        Thread t1 = new Thread(new Task1());
        Thread t2 = new Thread(new Task2());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("All Task Completed");
    }
}
