import java.util.Scanner;

public class SwitchCalculator_58 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please, Enter First Number: ");
        int num1 = scan.nextInt();

        System.out.print("Now, Enter Second Number: ");
        int num2 = scan.nextInt();

        System.out.print("Now, Enter the Operation you want to Perform: ");
        String operator = scan.next();

        switch (operator){
            case "+":
                System.out.println("Answer is: " +num1 + num2);
                break;

            case "-":
                System.out.println( num1 - num2);
                break;

            case "*":
                System.out.println("Answer is: " +num1 * num2);
                break;

            case "/":
                System.out.println("Answer is: " +num1 / num2);
                break;

            default:
                System.out.println("Invalid Operator Please Enter (+,-,*,/)");
        }
    }
}
