package NumberChallanges;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Number to check it's Armstrong or not: ");
        int num = scan.nextInt();
        int sum = 0;
        int temp = num;

        while (num > 0){
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        if (temp == sum){
            System.out.println("Number is ArmStrong..");
        }else{
            System.out.println("Not an Armstrong");
        }
    }
}
