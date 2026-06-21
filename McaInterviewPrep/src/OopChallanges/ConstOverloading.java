package OopChallanges;

class Demo {
    Demo() {
        System.out.println("Default Constructor");
    }

    Demo(int a) {
        System.out.println("Parameterized Constructor");
    }

    public static void main(String[] args) {
        new Demo();
        new Demo(10);
    }
}