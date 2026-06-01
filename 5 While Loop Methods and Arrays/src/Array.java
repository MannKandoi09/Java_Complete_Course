public class Array {
    public static void main(String[] args) {
//        int[] myArr = new int[5];
//        myArr[0] = 98;
//        myArr[1] = 54;
//        myArr[3] = 45;
//        myArr[2] = 9;
//        myArr[4] = 88;

        int[] myArr = {98,54,45,9,88};
//        int index = 1;
//
//        System.out.println(myArr);
//        System.out.println(myArr[0]);
//        System.out.println(myArr[index]);
//        System.out.println(myArr[2]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);

        int index = 0;
        while (index < myArr.length){
//            System.out.println(index);
            System.out.println(myArr[index]);

            index++;
        }
    }
}
