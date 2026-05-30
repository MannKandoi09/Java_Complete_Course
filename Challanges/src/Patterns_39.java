import java.util.Scanner;

public class Patterns_39 {
    public static void main(String[] args) {
        System.out.println("Welcome to Patterns Printing...");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter  Number of Rows you want to Print Patterns: ");
        int rows = scan.nextInt();
        rightHalfPyramid(rows);
        System.out.println();
        ReverseRightPyramid(rows);
        leftHalftPyramid(rows);

    }
    public static void leftHalftPyramid(int maxRows){
        System.out.println("Here is your Left Half Pyramid...");
        int rows = maxRows;
        while (rows > 0){
            //this loop prints spaces
            int j = 0;
            while (j < rows){
                System.out.print("  ");
                j++;
            }

            //This Loops Print Stars
            int i = 0;
            while (i <= maxRows - rows){
                System.out.print(" *");
                i++;
            }

            System.out.println();
            rows--;
        }
    }

    public static void ReverseRightPyramid(int maxRows){
        System.out.println("Here is your Reverse Right Half Pyramid...");
        int rows = maxRows;
        while (rows > 0){
            int i = 0;
            while (i < rows){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

    public static void rightHalfPyramid(int maxRows){
        System.out.println("\n Here is Your Right Half Pyramid");
        int rows = 0;
        while (rows < maxRows){
            System.out.print("*");
            int i = 0;
            while (i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }

    }
}
