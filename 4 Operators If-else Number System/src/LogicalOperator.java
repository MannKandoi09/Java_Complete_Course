import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Now, Please Enter Your Age for an Discount: ");
        int age = scan.nextInt();

        System.out.print("Are you a Female? (true/false): ");
        boolean isFemale = scan.nextBoolean();

        if (age < 5){
            System.out.println("Received 75% Discount.");
        } else if (isFemale) {
            System.out.println("Received 50% Discount.");
        } else if (!isFemale || age > 60) {
            System.out.println("Recived 25% Discount.");
        }else{
            System.out.println("No Discount.");
        }


    }
}
