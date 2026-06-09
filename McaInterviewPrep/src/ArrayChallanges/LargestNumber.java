package ArrayChallanges;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Find Largest Element in Array..\n");
        int[] arr = {10,45,54,9,12,18};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest Number: " + max);
    }
}
