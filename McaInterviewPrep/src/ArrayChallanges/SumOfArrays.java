package ArrayChallanges;

public class SumOfArrays {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,2};
        int sum = 0;
        for (int n : arr){
            sum += n;
        }
        System.out.println("Sum of your Elements is: " + sum);
    }
}
