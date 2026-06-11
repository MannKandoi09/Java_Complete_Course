package ArrayChallanges;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println("Welcomme to Find Missing Number in an Array...\n");

        int[] arr = {1,2,3,5};
        int n = 5;
        int total = n * (n+1) / 2;
        int sum = 0;

        for (int num : arr){
            sum += num;
        }
        System.out.println(total - sum);

    }
}
