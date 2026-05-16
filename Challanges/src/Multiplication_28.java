import java.util.Scanner;

public class Multiplication_28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number you Want to Table of: ");
        int num = scan.nextInt();
        printMultiplicationTable(5);






    }
    public static void printMultiplicationTable(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        }

    }
}
