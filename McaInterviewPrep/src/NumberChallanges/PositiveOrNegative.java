package NumberChallanges;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Check your Number is (+pv / -pv or 0)\n");
        System.out.print("Enter your Number to Check : ");
        int num = scan.nextInt();

        if (num > 0){
            System.out.println("Entered Number is Positive...");
        } else if (num < 0) {
            System.out.println("Entered Number is Negative...");
        }else {
            System.out.println("Number is Zero..");
        }
    }
}
