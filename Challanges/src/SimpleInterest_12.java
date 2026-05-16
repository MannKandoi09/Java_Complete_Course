import java.util.Scanner;

public class SimpleInterest_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Simple Interest Calculator");

        System.out.print("Enter Principal Amount: ");
        double p = scan.nextDouble();

        System.out.print("Enter No.of Time Duration: ");
        double t = scan.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double r = scan.nextDouble();

        double si = (p * t * r) / 100;
        System.out.println("Simple Intrest is: " + si);
    }
}
