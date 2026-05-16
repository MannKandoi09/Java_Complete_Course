public class Function {
    public static void main(String[] args) {
//        System.out.println("IN Main Method");
//        greetUser();
//        System.out.println("Method Calling Completed");
//        greetUser();
        rightHalfPyramid();
//        reverseRightHalfPyramid();
    }


    public static  void rightHalfPyramid(){
//        System.out.println("*");
//        System.out.println("* *");
//        System.out.println("* * *");
//        System.out.println("* * * *");
//        System.out.println("* * * * *\n");

        int rows = 0;
        while (rows < 20){
            System.out.print("*");

            int col = 0;
            while (col < rows){
                System.out.print(" *");
                col++;

            }
            System.out.println();
            rows++;
        }

    }

    public static void reverseRightHalfPyramid(){
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");
    }

    public static void greetUser(){
        System.out.println("Good Morning From MANN");
    }
}
