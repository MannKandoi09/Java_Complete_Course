
public class ArraySum_Avg_40 {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum and Average Calculator of Array...");

        int[] numArray = ArrayUtility.inputArray();
        long Sum = sum(numArray);
        int Avg = avg(numArray);
        System.out.println("Sum of the Numbers is : " + Sum);
        System.out.println("Average of your Number is: " + Avg);



    }
    public static  long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while (i < numArray.length){
            sum += numArray[i];
            i++;
        }
        return  sum;
    }
    public static int avg(int[] numArray){
        long sum = sum(numArray);
        return (int)(sum / numArray.length);
    }
}
