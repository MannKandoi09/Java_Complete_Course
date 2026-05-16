import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int num = 1; //Initialization
        while (num <= 10){ //Condition
            System.out.println(num); //actual work
            num = num + 1; //updating the condition
        }

        int n = 500;
        while (n >= 200){
            System.out.println(n);
            n = n - 1;
        }

        Scanner scan = new Scanner(System.in);
        int i = 0;
        while (i < 5){
            int nn = scan.nextInt();
            System.out.println("Number is: " +nn);
            i = i + 1;
        }
    }
}
