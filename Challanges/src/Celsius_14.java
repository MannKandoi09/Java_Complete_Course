import java.util.Scanner;

public class Celsius_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Fahrenheit Celsius Converter...");

        System.out.print("Enter Fahrenheit Temperature: ");
        int freh = scan.nextInt();

        int celsuius = (freh - 32) * 5 / 9;
        System.out.println("Temperatue in Celsuius is: " + celsuius);
    }
}
