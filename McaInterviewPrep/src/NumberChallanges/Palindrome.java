package NumberChallanges;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Number to Check Whether it's Palindrome or Not: ");
        int num = scan.nextInt();
        int rev = 0;
        int temp = num;

        while (num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        if (rev == temp){
            System.out.println("Your Number is Palindrome...");
        }else {
            System.out.println("It's not a Palindrome Number...");
        }
    }
}
