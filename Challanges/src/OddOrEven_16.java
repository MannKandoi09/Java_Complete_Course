import java.util.Scanner;

public class OddOrEven_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Odd/Even Checker...");

        System.out.print("Please Enter a Number to Check Wheather its Odd or Even: ");
        int num = scan.nextInt();

        if (num % 2 == 0){
            System.out.println("Entered Number is Even: " + num);
        }else {
            System.out.println("Entered Number is Odd: " + num);
        }
    }
}
