import java.util.Scanner;

public class Positive_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome  to Number Checker...");

        System.out.print("Please Enter Number to Check Whether its (Positive/Negative) or Zero: ");
        int num = scan.nextInt();

        if(num > 0){
            System.out.println("Entered Number is Positive: " + num);
        } else if (num < 0) {
            System.out.println("Entered Number is Negative: " + num);
        }else{
            System.out.println("Entered Number is Zero: " + num);
        }
    }
}
