import java.util.Scanner;

public class LeftShift_25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to ShowCase of LeftShift Operator\n");

        System.out.println("Please enter your Number: ");
        int num = scan.nextInt();

        int result = num << 1;

        System.out.println("Result is: " + result);
    }
}
