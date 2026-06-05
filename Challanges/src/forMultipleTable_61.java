import java.util.Scanner;

public class forMultipleTable_61 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Multiplication of a Table..");
        System.out.print("Enter a Number you want the Multiplication Table of: ");
        int num = scan.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
