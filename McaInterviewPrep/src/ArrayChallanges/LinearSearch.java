package ArrayChallanges;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Welcome to Linear Searching..\n");
        int[] arr = {10,20,30,40};
        int key = 40;
        boolean found = false;

        for(int num : arr){
            if (num == key){
                found = true;
            }
        }
        System.out.println("Element found : " + found);
    }
}
