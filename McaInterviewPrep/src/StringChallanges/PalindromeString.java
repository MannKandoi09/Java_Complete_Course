package StringChallanges;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("Welcome to Check wheather String is Palindrome or Not..\n");

        String str = "nitin";
        String rev = "";
        for (int i = str.length() -1; i >= 0; i--){
            rev += str.charAt(i);
        }
        if (str.equals(rev)){
            System.out.println("Palindrome String..: " + rev);
        }else{
            System.out.println("Not an Palindrome String...: "  +rev);
        }
    }
}
