package NumberChallanges;

import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to HCF/GCD Calculator\n");
        System.out.println("Enter Your Number: ");
        int first = scan.nextInt();

        System.out.println("Now, Enter Second Number: ");
        int second = scan.nextInt();

        while (second != 0){
            int temp = second;
            second = first % second;
            first = temp;

        }
        System.out.println("Hcf: " +    first);
    }
}
