import java.util.Scanner;

public class SumOddNumbers_29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number you want till sum: ");
        int num = scan.nextInt();

        System.out.println("Sum of Total OddNumber is: "+ sumOddNumbers(num));


    }

    public static int sumOddNumbers(int num){
        int sum = 0;
        int i = 1;
        while(i <= num){
                sum += i;
                i += 2;
        }
        return sum;
    }
}
