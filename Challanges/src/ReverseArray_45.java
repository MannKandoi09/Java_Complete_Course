public class ReverseArray_45 {
    public static void main(String[] args) {
        int[] nuwArr = ArrayUtility.inputArray();
        reverse(nuwArr);
        System.out.println("Reverse Array is: ");
        ArrayUtility.displayArray(nuwArr);
    }
    public static void reverse(int[] arr){
        int i = 0;
        while (i < arr.length / 2){
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;
        }
    }
}
