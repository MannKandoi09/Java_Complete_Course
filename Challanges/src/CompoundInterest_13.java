import java.util.Scanner;

public class CompoundInterest_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Compound Interest Calculator...");

        System.out.print("Enter Principal Amount: ");
        int P = scan.nextInt();

        System.out.print("Enter No.of Time Duration: ");
        int T = scan.nextInt();

        System.out.print("Enter Rate of Interest: ");
        int R = scan.nextInt();

        Double ci = P  * Math.pow((1 + R / 100), T) ;
        System.out.println("Compound Interest is: " + ci);
    }
}
