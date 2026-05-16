import java.util.Scanner;

public class LeapYear_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Leap Year Checker...");

        System.out.print("Enter Your Year Check: ");
        int year = scan.nextInt();

      if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ){
          System.out.println("Leap Year: " + year);
      }else {
          System.out.println("Not an Leap Year: " +year);
      }

    }
}
