package StringChallanges;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println("Welcome to Counting digits in a String..\n");
        String str = "abc123";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) ;
            count++;
        }
        System.out.println(count);
    }
}
