import java.util.Scanner;

public class Grade_19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Grade Checker...");

        System.out.print("Please Enter Marks to Calculate Grade: ");
        int marks = scan.nextInt();

        if(marks >= 90){
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else if (marks >= 30) {
            System.out.println("Grade D");
        }else {
            System.out.println("Oops!, Better Luck Next Time");
        }
    }
}
