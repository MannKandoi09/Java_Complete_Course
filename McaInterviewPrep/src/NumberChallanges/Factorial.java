package NumberChallanges;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number to find Factorial: ");
        int num = scan.nextInt();
        long fact = 1;

        for (int i = 1; i <= num; i++){
            fact *= i;
        }
        System.out.println("Factorial of your number is: " +fact);
    }
}
