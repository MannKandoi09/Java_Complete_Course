public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4};

        for (int i = 0; i < arr.length; i++){
            boolean isFound = false;
            for (int j = 0; j < i; j++){
                if (arr[i] == arr[j]){
                    isFound = true;
                }
            }

            if (!isFound){
                System.out.println(arr[i] + " ");
            }

        }

    }
}
