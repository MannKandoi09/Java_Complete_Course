package NumberChallanges;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Spy Number Checker\n");
        System.out.print("Enter your Number to Check it's Spy Number or Not: ");
        int num = scan.nextInt();
        int sum = 0;
        int product = 1;

        while (num > 0){
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        if (product == sum){
            System.out.println("It is an Spy Number..");
        }else{
            System.out.println("Not an Spy Number");
        }
    }
}
