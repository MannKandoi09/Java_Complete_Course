package ArrayChallanges;

public class ElementSearching {
    public static void main(String[] args) {
        System.out.println("Welcome to Searching an element..\n");
        int[] arr = {10,20,30,40};
        int key = 30;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == key){
                System.out.println("Found: \t" + arr[i]);
            }
        }
    }
}
