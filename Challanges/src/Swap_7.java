import java.util.Scanner;

public class Swap_7 {
    public static void main(String[] args) {

        System.out.println("Swapping Station");
        Scanner scan = new Scanner(System.in);
        System.out.print("Ebter First Number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = scan.nextInt();

        int swap;
        swap = num1;
        num1 = num2;
        num2 = swap;

        System.out.println("Swapping Done...");
        System.out.println("Value of Num1 is: " + num1);
        System.out.println("Value of Num2 is: " + num2);


    }
}
