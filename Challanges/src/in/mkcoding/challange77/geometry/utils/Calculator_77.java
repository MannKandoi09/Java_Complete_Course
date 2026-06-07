package in.mkcoding.challange77.geometry.utils;

import in.mkcoding.challange77.geometry.Circle;
import in.mkcoding.challange77.geometry.Rectangle;

public class Calculator_77 {
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(10,5);

        double cirArea = Math.PI * Math.pow(cir.radius,  2);

        double recArea = rect.length * rect.breadth;
        System.out.println("Area of Circle is: " + cirArea);
        System.out.println("Area of Rectangle is: " + recArea);

    }

}
