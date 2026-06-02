import java.util.Scanner;

public class ArrayPalindrome_46 {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker\n");
        int[] numArr = ArrayUtility.inputArray();

        boolean palindrome = isPalindrome(numArr);
        if (palindrome){
            System.out.println("Array is Palindrome");
        }else {
            System.out.println("Array is Not Palindrome");
        }
    }

    public static boolean isPalindrome(int[] numArr){
        int i = 0;
        while (i < numArr.length/ 2){
            if (numArr[i] != numArr[numArr.length- 1 - i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
