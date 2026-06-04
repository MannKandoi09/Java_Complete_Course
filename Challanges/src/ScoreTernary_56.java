import java.util.Scanner;

public class ScoreTernary_56 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Marks to Check Grade: ");
        int marks = scan.nextInt();

        String grade = marks > 80 ? "High" : marks >= 50? "Moderate" : "Low";
        System.out.println("Grade is: " + grade);
    }
}
