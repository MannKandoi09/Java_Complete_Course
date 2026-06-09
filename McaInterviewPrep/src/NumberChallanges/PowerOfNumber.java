package NumberChallanges;
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Power Calculation\n");
        int base = 2;
        int result = 1;
        int power = 3;

        for (int i = 1; i <= power; i++){
            result *= base;
        }
        System.out.println(result);
    }
}
