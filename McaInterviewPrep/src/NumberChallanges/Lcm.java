package NumberChallanges;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to LCM Calculation\n");
        System.out.print("Enter First Number: ");
        int first = scan.nextInt();

        System.out.print("Now, Enter Second Number: ");
        int second = scan.nextInt();

        int max = Math.max(first,second);

        while (true){
            if(max % first == 0 && max % second == 0){
                System.out.println("LCM: " + max);
                break;
            }
            max++;
        }
    }
}
