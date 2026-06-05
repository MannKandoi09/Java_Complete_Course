import java.util.Scanner;

public class OccUsingForEach {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Now enter Number you want to search: ");
        int search = scan.nextInt();

        int occ = 0;

        for (int num : arr){
            if (search == num){
                occ++;
            }
        }
        System.out.println("Occurence: " + occ);
    }
}
