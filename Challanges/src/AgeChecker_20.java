import java.util.Scanner;

public class AgeChecker_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Age And Check In Which Age Catergory you Fall...");

        System.out.print("Enter Your Age: ");
        int age = scan.nextInt();

      if(age <= 13){
          System.out.println("You are Child");
      } else if (age < 20) {
          System.out.println("You are Teenager");
      } else if (age <= 60) {
          System.out.println("You are Adult");
      }else {
          System.out.println("You are Senior Citizen");
      }

    }
}
