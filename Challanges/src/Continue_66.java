public class Continue_66 {
    public static void main(String[] args) {
        System.out.println("Welcome to adding positive Number");
        int[] arr = ArrayUtility.inputArray();

        int sum = 0;
        for(int num : arr){
            if (num < 0){
                continue;
            }else {
                sum += num;
            }
        }
        System.out.println("Sum of Positive Numbers is: " + sum);
    }
}
