import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Factorial Generator");
        System.out.print("Please Enter your Number: ");
        int num = scan.nextInt();
//        long fact = factorialIterative(num);
//      System.out.println("Factorial of Your Number is: " + fact);
        long factRecursion = factorial(num);
        System.out.println("Factorial of Your Number is: " + factRecursion);
    }

    public static long factorial(int num){
        System.out.println("Function Called for: "  +num);
        if (num == 1){
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static long factorialIterative(int num){
        long result = 1;
        for (int i = 1; i <= num; i++){
            result *= i;
        }
            return result;
    }


}
