package FunctionalInterface;

interface Square2 {
    default void cal() {
        System.out.println("default2");
    }
}

interface Square1 {
    default void cal() {
        System.out.println("default1");
    }

//    int cal(int x);

}

class Square3 {
    void cal() {
        System.out.println("default3");
    }

//    int cal(int x);

}

class FunctionalInterFaceExample1 extends Square3 implements Square2, Square1 {
    public static void main(String ar[]) {
        int a = 5;
        Square s = (int x) -> x * x;
        System.out.println("Output:" + s.calculate(5));
        FunctionalInterFaceExample1 e = new FunctionalInterFaceExample1();
        e.cal();

    }

    @Override
    public void cal() {
        Square1.super.cal();
        Square2.super.cal();
        super.cal();
        System.out.println("main");
    }
}
