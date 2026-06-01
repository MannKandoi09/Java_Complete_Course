import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Searching Department...");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter your Number to Search in Array: ");
        int num = scan.nextInt();

        int[] arr = {3,9,45,54,18,99,78,84,85,56};
        int index = 0;
        while (index < arr.length){
            if(num == arr[index]){
                System.out.println("Number found at index: " + index);
            }else{
                System.out.println("Number not found");
            }
            index++;
        }
    }
}
