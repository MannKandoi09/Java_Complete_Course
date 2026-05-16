import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to our Calculator...");
        System.out.print("Enter First Number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = scan.nextInt();

        int sum = num1 + num2;
        System.out.println("Addition of Two Numbers are: " + sum);

//        System.out.println("Sum of Two Numbers is :" + (num1+num2));
    }
}
