import java.util.Scanner;

public class BitOr_22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Showing Bitwise OR Operator\n");

        System.out.println("Please Enter First Number: ");
        int first = scan.nextInt();

        System.out.println("Now, Enter Second Number: ");
        int second = scan.nextInt();

        int result = first | second;
        System.out.println("Result: " + result);
    }
}
