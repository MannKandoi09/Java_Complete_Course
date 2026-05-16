import java.util.Scanner;

public class AreaRectangle_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Rectangle Area Calculator");

        System.out.print("Enter First area of Rectangle: ");
        int a = scan.nextInt();

        System.out.print("Enter Second area of Rectangle: ");
        int b = scan.nextInt();

        System.out.print("Enter Third area of Rectangle: ");
        int c = scan.nextInt();

        System.out.print("Enter Fourth area of Rectangle: ");
        int d = scan.nextInt();

        int area = a+b+c+d;
        System.out.println("Area of Rectangle is: " +area);
    }
}
