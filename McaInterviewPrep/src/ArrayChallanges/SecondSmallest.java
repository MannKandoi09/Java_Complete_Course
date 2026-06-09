package ArrayChallanges;

public class SecondSmallest {
    public static void main(String[] args) {
        System.out.println("Welcome to finding Second Smallest element in Array..\n");
        int[] arr =  {10,45,54,9,18};
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : arr){
            if (num < first){
                second = first;
                first = num;
            } else if (num < second) {
                second = num;
            }
        }
        System.out.println("Smallest Number: " + second);
    }
}
