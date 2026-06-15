package StringChallanges;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        System.out.println("Welcome to Removing Special Characters from an String..\n");

        String str = "Java@123";
        str = str.replaceAll("[a-zA-Z0-9]","");
        System.out.println(str);
    }
}
