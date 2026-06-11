package ArrayChallanges;

public class FrequencyOfElements {
    public static void main(String[] args) {
        System.out.println("Welcome to Check Frequency of Elements in array\n");

        int[] arr = {1,2,2,3,1};

        for (int i = 0; i < arr.length; i++){
            int count = 1;
            boolean isVisited = false;

            for (int j = 0; j < i; j++){
                if (arr[i] == arr[j]){
                    isVisited = true;
                }
            }

            if (isVisited) continue;
            for (int k = i + 1; k < arr.length; k++){
                if (arr[i] == arr[k]){
                    count++;
                }
            }
            System.out.println(arr[i] + " = " + count);
        }
    }
}
