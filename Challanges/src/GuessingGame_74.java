import java.util.Scanner;

public class GuessingGame_74 {
    int random;

    GuessingGame_74(){
        random = (int)Math.ceil(Math.random() * 100);
    }

    /**
     *
     * @param guessNumber the Number that player guessed
     * @return
     * - Negative if the Guessed Number is Smaller
     *- 0 if the guessed number is correct
     * - positive if the guessed number is higher
     */
    int guess(int guessNumber){
        return guessNumber -  random;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GuessingGame_74 game = new GuessingGame_74();
        System.out.println("Welcome to the GGuessing game, Guess the Number Between 1 to 100 : ");
        int guess;
        int result;
        do {
            System.out.print("Guess the Number: ");
            guess = scan.nextInt();
            result = game.guess(guess);
            if (result == 0){
                System.out.println("Congratulation your guess is Correct..");
            } else if (result < 0) {
                System.out.println("Guess Higher");
            }else {
                System.out.println("Guess Lower");
            }
        }while (result != 0);

    }
}
