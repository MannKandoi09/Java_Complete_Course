import java.util.Scanner;

public class RecursionFib_68 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number you want to print Fibonacci series: ");
        int count = scan.nextInt();
        for (int i = 1; i <= count; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
    public static int fibonacci(int position){
        if (position == 1){
            return 0;
        }
        if (position == 2){
            return 1;
        }
            return fibonacci(position - 1) +
                    fibonacci(position - 2);
    }
}
