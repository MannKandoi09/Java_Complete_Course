public class ArrayMInMax_42 {
    public static void main(String[] args) {
        int[] numArr = ArrayUtility.inputArray();
        int Min = numArr[0];
        int Max = numArr[0];

        int i = 0;
        while (i < numArr.length){
            if(numArr[i] < Min){
                Min = numArr[i];
            } else if (numArr[i] > Max) {
                Max = numArr[i];
            }
            i++;
        }
        System.out.println("Mininum Array is : " + Min);
        System.out.println("Maximum Array is : " + Max);
    }
}
