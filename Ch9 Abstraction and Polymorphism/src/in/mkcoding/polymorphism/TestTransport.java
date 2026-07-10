package in.mkcoding.polymorphism;

public class TestTransport {
    public static void main(String[] args) {
        Car c = new Car();
        Vehicle veh = new Vehicle();
        c.start();
        Plane p = new Plane();
        p.start();
        //casteTest(veh);
        //casteTest(c);
        //casteTest(p);

       // Vehicle vCar = new Car();
       // Car car = (Car) new Vehicle();

    }
    private static void casteTest(Vehicle veh){
        veh.start();
        Car myCar = (Car) veh;
        ((Car) veh).noOfDoors();
        myCar.start();
        myCar.noOfDoors();

    }
}
