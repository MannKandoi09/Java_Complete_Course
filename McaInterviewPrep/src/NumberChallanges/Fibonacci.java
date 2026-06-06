package NumberChallanges;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number you want to print upto Fibonacci Series: ");
        int num = scan.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b+ " ");
        for (int i = 2; i <= num; i++){
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
