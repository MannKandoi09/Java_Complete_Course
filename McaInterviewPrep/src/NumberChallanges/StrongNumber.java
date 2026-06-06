package NumberChallanges;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number to find it is Strong ot not: ");
        int num = scan.nextInt();
        int temp = num;
        int sum = 0;
        while (num > 0){
            int digit = num % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++){
                fact *= i;
            }
            sum += fact;
            num /= 10;
        }
        if (temp == sum){
            System.out.println("It is a Strong Number..." + sum); //145
        }else{
            System.out.println("Not a Strong Number.." + sum);
        }
    }
}
