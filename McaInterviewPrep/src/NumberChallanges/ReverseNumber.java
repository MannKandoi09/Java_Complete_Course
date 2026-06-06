package NumberChallanges;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Number to Reverse: ");
        int num = scan.nextInt();
        int rev = 0;
        while (num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number of your is: " + rev);
    }
}
