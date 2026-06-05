public class RandomMath {
    public static void main(String[] args) {
//        System.out.println(Math.abs(-99));
//        System.out.println(Math.ceil(99.01));
//        System.out.println(Math.floor(99.99));
//        System.out.println(Math.round(99.78));
        System.out.println(Math.random());
        System.out.println(Math.PI);

        for (int i = 0; i < 10; i++) {
            System.out.println(Math.round(Math.random() * 100));
        }
    }
}
