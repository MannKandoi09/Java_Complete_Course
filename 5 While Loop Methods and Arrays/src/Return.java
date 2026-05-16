import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
       greet();

       int first = readNumber();
       int second = readNumber();

        int sum = first + second;
        System.out.println("Sum: " + sum);
    }

    public static void greet(){
        System.out.println("Welcome to Calculator\n");
    }

    public static int readNumber(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Please Enter the Number: ");
        int number = scan.nextInt();
        return number;
    }
}
