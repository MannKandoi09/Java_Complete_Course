package ArrayChallanges;

public class CopyArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Copying Array..\n");
        int[] a = {1,2,3};
        int[] copy = new int[a.length];

        for (int i = 0; i < a.length; i++){
            copy[i] = a[i];
        }
        for (int n : copy){
            System.out.print(n + " ");
        }
    }
}
