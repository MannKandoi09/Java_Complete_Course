import java.util.Scanner;

public class RecursionPalindrome_69 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Palindrom Checker using Recursion");
        System.out.print("Enter the String to be Checked: ");
        String str = scan.next();
        System.out.println("Your String is: " +
                ((isPalindrome(str)? "Palindrome" : "Not Palindrome")));
    }
    public static boolean isPalindrome(String str){
        if (str.length() <= 1){
            return true;
        }
        int lastPos = str.length() - 1;
        if (str.charAt(0) != str.charAt(lastPos)){
            return false;
        }
        String newStr = str.substring(1, lastPos);
        return isPalindrome(newStr);
    }
}
