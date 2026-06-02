import static java.lang.Long.sum;

public class SumAndAverageTwoDArray_49 {
    public static void main(String[] args) {
        int[][] numArr = ArrayUtility.input2DArray();

        long sum = Sum(numArr);
        System.out.println("Sum of Your 2D Array is: " + sum);

        double avg = avg(numArr);
        System.out.println("Average of Your 2D Array is: " + avg);

    }
    public static long Sum(int[][] numArr){
        long sum = 0;
        int i = 0;
        while (i < numArr.length){
            int j = 0;
            while (j < numArr[i].length){
                sum += numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static double avg(int[][] numArr){
        long sum = Sum(numArr);
        if (numArr.length == 0){
            return 0;
        }
        int rows = numArr.length;
        int cols = numArr[0].length;
        int size = rows * cols;
//        return (double) sum(numArr)/ size;
        return 0;
    }



}
