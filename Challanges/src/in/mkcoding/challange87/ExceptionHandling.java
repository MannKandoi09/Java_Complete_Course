package in.mkcoding.challange87;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Welcome to Exception Handling Challange");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Two Numbers to Divide: ");
        int first = scan.nextInt();
        int second = scan.nextInt();

        try {
            int result = first / second;
            System.out.println("Divide of Two Numbers is: " + result);
        }catch (ArithmeticException ae){
            System.out.println("Divide with Zero, Please Enter Valid Number");
        }
    }
}
