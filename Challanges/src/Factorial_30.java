import java.util.Scanner;

public class Factorial_30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number you want Factorial of: ");
        int num = scan.nextInt();

        System.out.println("Factorial of Your Number is: " + factorialNumber(num));
    }

    public static int factorialNumber(int num){
        int fact = 1;
        int i = 1;
        while (i <= num){
            fact *= i;
            i++;
        }
        return fact;
    }
}
