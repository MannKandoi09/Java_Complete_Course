package NumberChallanges;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number to Check weather it's Prime or Not: ");
        int num = scan.nextInt();
        boolean prime = true;

        for (int i = 2; i < num; i++){
            if (num % i == 0){
                prime = false;
                break;
            }
        }
        if (prime){
            System.out.println("Prime");
        }else {
            System.out.println("Not");
        }
    }
}
