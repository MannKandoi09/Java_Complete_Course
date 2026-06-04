import java.util.Scanner;

public class absoluteTernary_55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number to Chexk its Absolute: ");
        int num = scan.nextInt();

        int result = num >= 0? num : -num;
        System.out.println("Absolute value is: " + result);
    }
}
