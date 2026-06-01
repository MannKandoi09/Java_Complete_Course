import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Please Enter the Number of Elements: ");
        int size = scan.nextInt();

        int[] nums = new int[size];
        int i = 0;
        while (i < size){
            System.out.print("Enter element no " + (i+1) + " : ");
            nums[i] = scan.nextInt();
            i++;
        }
        return nums;
    }

    public static void displayArray(int[] numArray){
        int i = 0;
        while (i < numArray.length){
            System.out.print(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }
}
