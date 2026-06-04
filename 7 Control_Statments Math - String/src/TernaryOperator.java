import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = scan.nextInt();
        System.out.print("Now, Enter Second Number: ");
        int num2 = scan.nextInt();

//        int greaterNumber;
//        if (num1 > num2){
//            greaterNumber = num1;
//        }else{
//           greaterNumber = num2;
//        }

        int greaterNumber = num1 > num2? num1 : num2;

        System.out.println(greaterNumber + " is the Greatest Number");


    }
}
