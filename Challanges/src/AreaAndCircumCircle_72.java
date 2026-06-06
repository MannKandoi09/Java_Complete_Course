import java.util.Scanner;

public class AreaAndCircumCircle_72 {

    double radiusInMm;

    AreaAndCircumCircle_72(double radiusInMm){
        this.radiusInMm = radiusInMm;
    }

    double getCircumFrance(){
        return 2 * radiusInMm * Math.PI;
    }

    double getArea(){
        return Math.PI  * Math.pow(radiusInMm , 2);
    }

    @Override
    public String toString() {
        return "Circle props: Radius in mm: " + radiusInMm
                + " ,Circumfrance in mm: " + getCircumFrance()
                + " .Area in mm2: " + getArea();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Circle World\n");
        System.out.print("Please Enter Radius: ");
        double radius= scan.nextDouble();

        AreaAndCircumCircle_72 circle = new AreaAndCircumCircle_72(radius);
        System.out.println(circle);
    }
}
