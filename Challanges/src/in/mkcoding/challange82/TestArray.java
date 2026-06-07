package in.mkcoding.challange82;

public class TestArray {
    public static void main(String[] args) {
        ArrayOperations arr = new ArrayOperations(new int[] {1,3,5,9});
        ArrayOperations.Statistics statistics = arr.new Statistics();
        System.out.println(statistics.mean());
    }
}
