package NumberChallanges;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Neon Number Checker");

        System.out.print("Enter your Number to Check it's Neon Number: ");
        int num = scan.nextInt();
        int sum = 0;
        int square = num * num;

        while (square > 0){
            sum  += square % 10;
            square /= 10;
        }
        if (sum == num){
            System.out.println("Neon Number");
        }else{
            System.out.println("not an Neon Number");
        }
    }
}
