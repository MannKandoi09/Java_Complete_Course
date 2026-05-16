import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = input.nextLine();
        System.out.println("Welcome "+ name);

        System.out.println(name + " Also Tell me your Age: ");
        int age = input.nextInt();
        System.out.println(name + " Your Age is: " + age);
    }
}
