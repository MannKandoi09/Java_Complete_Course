package in.mkcoding.exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       a();

    }
    private static void a(){
        b();
    }
    private static void b(){
        c();
    }
    private static void c(){
        d();
    }
    private static void d(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Division Calculator");
        System.out.println("Please Enter your two Numbers: ");
        int first = scan.nextInt();
        int second = scan.nextInt();

        try{
            int[] a = new int[5];
           // System.out.printf("Result is %d", a[6]);
            //a[6] = first / second;
            //System.out.printf("Result is %d", a[6]);
        }catch (ArithmeticException exception){
            System.out.printf("%s, Enter Valid Values",
                    exception.getMessage());
            System.out.println();
        }catch (Throwable th){
            System.out.println("General Exception..");
            throw th;
        }finally {
            System.out.println("I am in Finally Block");
        }
    }
}
