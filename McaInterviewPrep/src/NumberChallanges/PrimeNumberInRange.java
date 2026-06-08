package NumberChallanges;

public class PrimeNumberInRange {
    public static void main(String[] args) {
        int num = 20;

        for (num = 2; num <= 20; num++){
            boolean isPrime = true;

            for (int i = 2; i < num; i++){
                if (num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(num + " ");
            }
        }
    }
}
