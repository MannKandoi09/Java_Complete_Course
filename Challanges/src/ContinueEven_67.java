public class ContinueEven_67 {
    public static void main(String[] args) {
        System.out.println("Welcome to Print Even Numbers Using Continue");
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 1){
                continue;
            }
            System.out.println(i);
        }
    }
}
