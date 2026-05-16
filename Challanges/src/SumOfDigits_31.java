import java.util.Scanner;

public class SumOfDigits_31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number you want to Sum: ");
        int num = scan.nextInt();

        System.out.println("Sum of your Number is: " + sumOfDigits(num));
    }
    public static int sumOfDigits(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;

        }
        return sum;
    }
}
