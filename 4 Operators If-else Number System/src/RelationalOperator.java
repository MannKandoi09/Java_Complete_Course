import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Driving License Portal...");
        System.out.print("Please Enter Your Current Age: ");
        int age = scan.nextInt();

        if(age >= 18){
            System.out.println("Congratulations, you are eligible for License...");
        }else{
            System.out.println("OOPS!, You are under age...");
        }
    }
}
