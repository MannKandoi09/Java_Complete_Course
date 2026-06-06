package NumberChallanges;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Number to check it is Perfect or not: ");
        int num = scan.nextInt();
        int sum = 0;

       for (int i = 1; i < num; i++){
           if (num % i == 0){
               sum += i;
           }
       }

        if (sum == num){
            System.out.println("Perfect Number: " + sum); //6
        }else {
            System.out.println("Not");
        }

    }
}
