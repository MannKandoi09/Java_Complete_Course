package ArrayChallanges;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Removing the Duplicate Element from an array\n");
        int[] arr = {1,2,2,3,4,4};

        for (int i = 0; i < arr.length; i++){
            boolean duplicate = false;

            for (int j = 0; j < i; j++){
                if (arr[i] == arr[j]){
                    duplicate = true;
                }
            }
            if (!duplicate){
                System.out.print(arr[i] + " ");
            }
        }

    }
}
