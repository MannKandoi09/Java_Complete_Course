import java.util.Scanner;

public class Reverse_35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Reversing the Number...");

        System.out.print("Enter Your Number to Reverse: ");
        int num = scan.nextInt();

        int Reverse = reverse(num);
        System.out.println("Your Reverse Number is: " +Reverse);

    }
    public static int reverse(int num){
        int digit = 0;
        int newNumber = 0;

        while(num > 0){
            digit = num % 10;
            newNumber = newNumber * 10 + digit;
            num /= 10;


        }
        return newNumber;
    }
}
