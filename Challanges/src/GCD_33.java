import java.util.Scanner;

public class GCD_33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to GCD Calculator");

        System.out.print("Please enter Your Number: ");
        int first = scan.nextInt();

        System.out.print("Please enter Second Number: ");
        int second = scan.nextInt();

        int gcd = GCD(first, second);
        System.out.println("GCD of Your Numbers is: " + gcd);

    }
    public static int GCD(int num1, int num2){
        int gcd = 1;
        int i = 2;
        int least = least(num1, num2);
        while (i <= least){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
    public static int least(int num1 , int num2){
        if (num1 < num2){
            return num1;
        }else{
            return num2;
        }

    }
}
