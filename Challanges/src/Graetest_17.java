import java.util.Scanner;

public class Graetest_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Greatest Number Checker...");

        System.out.println("Please Enter 3 Numbers to Check Greatest One: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println("Number First is Greatest: " +num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Number Second is Greatest: " +num2);
        }else {
            System.out.println("Number Third is Greatest: " +num3);
        }
    }
}
