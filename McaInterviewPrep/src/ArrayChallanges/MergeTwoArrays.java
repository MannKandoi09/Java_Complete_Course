package ArrayChallanges;

public class MergeTwoArrays {
    public static void main(String[] args) {
        System.out.println("Welcome to Merging two Arrays..\n");
        int[] a = {1,2};
        int[] b = {3,4};

        int[] c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++){
            c[i] = a[i];
        }

        for (int i = 0; i < b.length; i++){
            c[a.length+i] = b[i];
        }

        for (int n : c){
            System.out.print(n + " ");
        }

    }
}
