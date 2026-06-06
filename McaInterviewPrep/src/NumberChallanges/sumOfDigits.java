package NumberChallanges;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your to sum of your Digits: ");
        int num = scan.nextInt();
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of your Digits are: " + sum);
    }
}
