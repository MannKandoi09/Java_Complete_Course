package StringChallanges;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Welcome to Reversing a String..\n");
        String str = "mann";
        String rev = "";

        for (int i = str.length()-1; i >= 0; i--){
            rev += str.charAt(i);
        }
        System.out.println("Reversed String: " + rev);
    }
}
