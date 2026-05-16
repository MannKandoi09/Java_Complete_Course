import java.util.Scanner;

public class BitEvenOrOdd_27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to ODD / EVEN Calculator");

        System.out.println("Please Enter your Number: ");
        int num = scan.nextInt();

        if((num & 1) == 1){
            System.out.println("Number is Odd");
        }else {
            System.out.println("Number is Evem");
        }
    }
}
