package StringChallanges;

public class CountOccurences {
    public static void main(String[] args) {
        System.out.println("Welcome to check Number of Ocuurences in a String..\n");
        String str = "banana";
        char ch = 'a';
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
