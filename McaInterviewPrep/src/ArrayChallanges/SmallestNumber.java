package ArrayChallanges;

public class SmallestNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Finding Smallest  Element in Array..\n");
        int[] arr = {10,45,54,9,12,18};
        int min = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Smallest element is: " + min);
    }
}
