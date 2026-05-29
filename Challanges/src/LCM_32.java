import java.util.Scanner;

public class LCM_32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to LCM Calculator");

        System.out.print("Please enter Your Number: ");
        int first = scan.nextInt();

        System.out.print("Please enter Second Number: ");
        int second = scan.nextInt();

        int lcm = Lcm(first,second);
        System.out.println("LCM of Two Numbers is: " + lcm);
    }

    public static int Lcm(int first, int second){
        int i = 1;
        while (true){
            int factor = first * i;
            if (factor % second == 0){
                return factor;
            }
            i++;
        }

    }
}
