import java.util.Scanner;

public class ArithOpt_8 {
    public static void main(String[] args) {
        System.out.println(" Welcome to Mann's Calculator...");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = scan.nextInt();

        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;

        System.out.println("Addition of Two Numbers are: " + sum);
        System.out.println("Subtraction of Two Numbers are: " + sub);
        System.out.println("Multiplication of Two Numbers are: " + mul);
        System.out.println("Division of Two Numbers are: " + div);
        System.out.println("Modulous of Two Numbers are: " + mod);


    }
}
