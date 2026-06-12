package StringChallanges;

public class CountWords {
    public static void main(String[] args) {
        System.out.println("Welcome to Counting words in a String..\n");
        String str = "Java is easy";

        String words[] = str.split(" ");
        System.out.println(words.length);
    }
}
