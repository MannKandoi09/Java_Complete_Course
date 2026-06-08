package NumberChallanges;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to Check Whether it's Leap Year or Not: ");
        int year = scan.nextInt();

        if ((year %  400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("Leap Year: " + year);
        }else {
            System.out.println("Not an Leap Year: " + year);
        }
    }
}
