package NumberChallanges;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Even/ODD Checker\n");
        System.out.print("Enter your Number to Check it's Even or Odd: ");
        int num = scan.nextInt();

        if (num %  2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
