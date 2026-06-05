import java.util.Scanner;

public class PasswordChecker_59 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to set Your Password: ");
        String password;

        do {
            System.out.print("Please Enter your Password: ");
             password = scan.next();
        }while (!isValidPassword(password));
        System.out.println("Thanks for Entering a Valid Password..");

    }
    public static boolean isValidPassword(String password){
        return password.length() > 6;
    }
}
