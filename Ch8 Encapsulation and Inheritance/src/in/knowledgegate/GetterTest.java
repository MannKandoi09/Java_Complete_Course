package in.knowledgegate;
import in.gettersetter.Car;

public class GetterTest {
    public static void main(String[] args) {
        Car car = new Car("Red","Maruti",3,8000);
        System.out.println(car.getColor());
        System.out.println(car.getModel());

        car.setColor("Blue");
        System.out.println(car.getColor());


    }
}
