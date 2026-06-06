import java.util.Scanner;

public class Challange_71 {
    public static void main(String[] args) {
        System.out.println("Welcome to String Concatination and TO swifting them to Upper case.");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your First Name: ");
        String fname = scan.next();

        System.out.print("Enter your Last Name: ");
        String lname = scan.next();

        String fullname = fname.concat(" ").concat(lname);
        System.out.println(fullname.toUpperCase());

//        System.out.printf("Your Full Name is: %S %S", fname , lname);
    }
}
