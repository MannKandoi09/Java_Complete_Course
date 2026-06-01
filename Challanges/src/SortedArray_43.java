public class SortedArray_43 {
    public static void main(String[] args) {

        int[] numArr = ArrayUtility.inputArray();
        boolean increase = isIncreasing(numArr);
        boolean decrease = isDecreasing(numArr);

        if(increase || decrease){
            System.out.println("Array is Sorted");
        }else{
            System.out.println("Array is Not Sorted");
        }
    }

    public static boolean isDecreasing(int[] numArr){
        int i = 1;
        while (i < numArr.length){
            if(numArr[i] > numArr[i-1]){
                return false;

            }
            i++;
        }
        return true;
    }

    public static boolean isIncreasing(int[] numArr){
        int i = 1;
        while (i < numArr.length){
            if(numArr[i] < numArr[i-1]){
                return false;

            }
            i++;
        }
      return true;
    }
}
