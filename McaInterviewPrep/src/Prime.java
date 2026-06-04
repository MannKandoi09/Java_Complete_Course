import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number to Check :");
        int num = scan.nextInt();

        boolean isPrime = true;

        if (num <= 1){
            isPrime = false;
        }else {
            int i = 2;
            while (i < num){
                if (num % i == 0){
                    isPrime = false;
                    break;
                }
                i++;
            }
        }
        if (isPrime){
            System.out.println("Pirme Number");
        }else {
            System.out.println("Not");
        }

    }
}
