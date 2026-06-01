import java.util.Scanner;

public class ArrayOccurence_41 {
    public static void main(String[] args) {
        int[] numArr = ArrayUtility.inputArray();

        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter Your Number to Check Number of Times Repeated: ");
        int num = scan.nextInt();

        int occ = 0;
        int i = 0;
        while (i < numArr.length){
            if(num == numArr[i]){
                occ++;
            }
            i++;
        }
        System.out.println("Your Number Repeated " + occ + " Times in Array");
    }
}
