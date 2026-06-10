package ArrayChallanges;

public class ArrayDescending {
    public static void main(String[] args) {
        System.out.println("Welcome to Sorting Arrays in Descending order\n");
        int[] arr = {4,2,1,5};

        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        for (int n : arr){
            System.out.print(n + " ");
        }
    }
}
