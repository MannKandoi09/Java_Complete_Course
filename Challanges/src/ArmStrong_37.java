import java.util.Scanner;

public class ArmStrong_37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Check Your Number is ArmStrong or Not...");
        System.out.print("Enter Your Number to Check it's ArmStrong: ");
        int num = scan.nextInt();

        boolean armStrong = isArmStrong(num);
        if(armStrong){
            System.out.println("Number is ArmStrong...");
        }else {
            System.out.println("Not an ArmStrong");
        }
    }
    public static boolean isArmStrong(int num){
        int digits = noOfDigits(num);
        int finalNumber = 0;
        int numCopy = num;
        while (num > 0){
            int digit = num % 10;
            num /= 10;
            finalNumber += pow(digit, digits);
        }
        System.out.println("Numbers: " + finalNumber);
        return finalNumber == numCopy;
    }
    public static int pow(int num1, int num2){
        int result = 1;
        int i = 0;
        while ((i < num2)){
            result *= num1;
            i++;
        }
        System.out.println("Power: " + result);
        return result;

    }

    public static int noOfDigits(int num){
        int digits = 0;
        while (num > 0){
            digits++;
            num /= 10;
        }
        return digits;
    }
}
