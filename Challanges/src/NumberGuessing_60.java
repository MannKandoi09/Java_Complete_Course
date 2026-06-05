import java.util.Scanner;

public class NumberGuessing_60 {
    public static void main(String[] args) {
        System.out.println("Welcome to Number Guessing Game...");
        Scanner scan = new Scanner(System.in);

        int num = 9, guess;
        do {
            System.out.print("Guess Your Number Between (1-10): ");
             guess = scan.nextInt();
        }while (num != guess);
            System.out.println("You have Successfully guessed the Number...");
    }


}
