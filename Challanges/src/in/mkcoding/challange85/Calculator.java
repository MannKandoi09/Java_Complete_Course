package in.mkcoding.challange85;

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public double add(double a, double b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(10.5,5.5));
        System.out.println(cal.add(10,5,5));
        System.out.println(cal.add(10,5));
    }
}
