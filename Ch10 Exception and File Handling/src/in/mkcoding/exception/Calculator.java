package in.mkcoding.exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Division Calculator");
        System.out.println("Please Enter your two Numbers: ");
        int first = scan.nextInt();
        int second = scan.nextInt();

        try{
            int result = first / second;
            System.out.printf("Result is %d", result);
        }catch (ArithmeticException exception){

            System.out.printf("%s, Enter Valid Values",
                    exception.getMessage());
        }catch (Throwable th){
            System.out.println("General Exception..");
        }

    }
}
