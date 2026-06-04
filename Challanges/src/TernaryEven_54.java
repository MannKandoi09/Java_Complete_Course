import java.util.Scanner;

public class TernaryEven_54 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number to Check it is Even Or Odd Number: ");
        int num = scan.nextInt();

        String result = num % 2 == 0? "even" : "odd";
        System.out.println("Given Number is: " + result);
    }
}
