import java.util.Scanner;

public class SearchTwoDimensionalArray_48 {
    public static void main(String[] args) {
        System.out.println("Welcome to 2D Search\n");
        Scanner scan = new Scanner(System.in);
        int[][] numArr = ArrayUtility.input2DArray();
        System.out.print("Now Enter the Number you want: ");
        int num = scan.nextInt();
        boolean isFound = search(numArr,num);
        if (isFound){
            System.out.println("Your Number is Found in 2D Array");
        }else{
            System.out.println("Your Number is Not found in 2D Array");
        }

    }
    public static boolean search(int[][] numArr, int num){
        int i = 0;
        while (i < numArr.length){
            int j = 0;
            while (j < numArr[i].length){
                if (numArr[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;

    }
}
