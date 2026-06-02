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

    public static int[][] input2DArray(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Please Enter the Number of Rows: ");
        int rows = scan.nextInt();
        System.out.print("Please Enter the Number of Columns: ");
        int columns = scan.nextInt();
        int[][] numArray = new int[rows][columns];

        int i = 0;
        while (i < rows){
            int j = 0;
            while (j < columns){
                System.out.print("Enter element row " + (i+1)
                        + ", column: " + (j+1) + " :");
                numArray[i][j] = scan.nextInt();
                j++;
            }

            i++;
        }
        return numArray;
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
