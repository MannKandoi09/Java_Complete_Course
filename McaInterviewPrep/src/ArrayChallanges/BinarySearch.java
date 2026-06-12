package ArrayChallanges;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Welcome to Binary Searching..\n");
        int[] arr = {10,20,30,40,50};
        int key = 30;

        int index = Arrays.binarySearch(arr,key);
        System.out.println(index);
    }
}
