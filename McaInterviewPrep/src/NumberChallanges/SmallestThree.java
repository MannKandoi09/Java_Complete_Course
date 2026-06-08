package NumberChallanges;

public class SmallestThree {
    public static void main(String[] args) {
        int a = 10,b = 20 , c = 30;

        if (a < b && b < c){
            System.out.println("A is Smallest: " + a);
        } else if (b< a && b < c) {
            System.out.println("B is Smallest: " + b);
        }else {
            System.out.println("C is Smallest: " + c);
        }
    }
}
