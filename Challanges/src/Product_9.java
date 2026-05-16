import java.util.Scanner;

public class Product_9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        float num1 = scan.nextFloat();

        System.out.println("Enter Second Number: ");
        float num2 = scan.nextFloat();

        float product = num1 * num2;
        System.out.println("Product of two Floats are: " + product);
    }
}
