import java.util.Scanner;

public class BitCompliment_24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to ShowCase of Not/Compliment Operator\n");

        System.out.println("Please enter your Number: ");
        int num = scan.nextInt();

        int result = ~num;

        System.out.println("Result is: " + result);

    }
}
