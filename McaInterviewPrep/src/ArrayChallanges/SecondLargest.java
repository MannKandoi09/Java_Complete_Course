package ArrayChallanges;

public class SecondLargest {
    public static void main(String[] args) {
        System.out.println("Welcome to finding Second Largest element in Array..\n");
        int[] arr = {10, 20, 5, 40};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr){
            if (num > first){
                second = first;
                first = num;
            } else if (num > second) {
                second =  num;
            }
        }
        System.out.println("Second Largest Number: " + second);
    }
}
