package in.mkcoding.challange83;

public class TestShapes {
    public static void main(String[] args) {
        //Shape shape = new Shape();
        Circle cir = new Circle(5);
        Square square = new Square(10.3);

        System.out.printf("Area of circle is %5.2f" , cir.calculateArea());
        System.out.println();
        System.out.printf("Area of square is %5.2f" , square.calculateArea());

    }
}
