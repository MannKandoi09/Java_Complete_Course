import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.print("Please Enter Your Age: ");
//        int age = scan.nextInt();
//
//        while (age > 100 || age < 0){
//            System.out.print("Please enter Valid Age...");
//            age = scan.nextInt();
//        }
        int age;
        do {
             System.out.print("Please Enter Your Age: ");
              age = scan.nextInt();
        }while (age < 0 || age > 100);
        System.out.println("Your Age is: " + age);
    }
}
