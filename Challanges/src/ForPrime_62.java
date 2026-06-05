import java.util.Scanner;

public class ForPrime_62 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number to check it is Prime or not: ");
        int num = scan.nextInt();
        boolean prime = isPrime(num);
        if (prime){
            System.out.println("it is a Prime Number..");
        }else{
            System.out.println("Not a Prime Number");
        }
    }

    public static boolean isPrime(int num){
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
