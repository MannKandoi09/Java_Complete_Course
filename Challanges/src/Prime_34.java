import java.util.Scanner;

public class Prime_34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Prime Number Checker...");

        System.out.print("Enter Your Number to Check its Prime or Not: ");
        int num = scan.nextInt();

        boolean prime = isPrime(num);
        if (prime){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a Prime Number");
        }

    }
    public static boolean isPrime(int num){
        int i = 2;
        while (i < num){
            if(num % i == 0){
                return false;
            }
            i++;
        }
        return true;

    }
}
