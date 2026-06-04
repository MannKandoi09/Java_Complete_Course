import java.util.Scanner;

public class TernaryMin_53 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = scan.nextInt();

        System.out.print("Now, Enter Second Number: ");
        int num2 = scan.nextInt();

        int isGreater = num1 > num2? num1 : num2;
        System.out.println(isGreater + " is Greatest Number");

    }
}
