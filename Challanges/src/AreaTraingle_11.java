import java.util.Scanner;

public class AreaTraingle_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Traingle are Calculator..");

        System.out.print("Enter Breadth of Traingle: ");
        double breadth = scanner.nextDouble();

        System.out.print("Enter Height of Traingle: ");
        double height = scanner.nextDouble();

        double area = 0.5 * breadth * height;

        System.out.println("Area of Traingle is: " + area);
    }
}
