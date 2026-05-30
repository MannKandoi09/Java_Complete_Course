import java.util.Scanner;

public class Palindrome_38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Checker...");
        System.out.print("Enter Your Number to Check Weather it's Palindrome or Not: ");
        int num = scan.nextInt();

        boolean palindrome = isPalindrome(num);
        if (palindrome){
            System.out.println("Your Number is Palindrome...");
        }else{
            System.out.println("Not an Palindrome...");
        }

    }
    public static boolean isPalindrome(int num){
        int reverse = reverse(num);
        return num == reverse;
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
