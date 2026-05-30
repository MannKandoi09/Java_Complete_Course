import java.util.Scanner;

public class Fibonnaci_36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Fibonnaci Series...");
        System.out.print("Enter your Number you want to Print Fibonacci Series Upto: ");
        int num = scan.nextInt();
        System.out.println("Fibonacci Series: ");
        fibonnaci(num);
    }

    public static void fibonnaci(int num){
        if(num < 0) return;;
        System.out.print("0 ");

        if(num == 0) return;
        System.out.print("1 ");

        int first = 0 , second = 1;
        while (first + second <= num){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;

        }



    }
}
