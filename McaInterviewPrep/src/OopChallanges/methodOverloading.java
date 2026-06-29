package OopChallanges;

class methodOverloading {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(double a, double b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        methodOverloading d = new methodOverloading();
        d.add(5, 10);
        d.add(5.5, 2.5);
    }
}