package in.kgcoding.inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
//        vehicle.commute();

        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());
//
//        TwoWheeler twoVeh = new TwoWheeler();
//        twoVeh.commute();
//        twoVeh.balance();
//        MotorCycle mc = new MotorCycle();
//        mc.commute();
//        mc.balance();
//        mc.start();
    }
}
