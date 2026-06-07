package in.kgcoding.inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();

        TwoWheeler twoVeh = new TwoWheeler();
        twoVeh.commute();
        twoVeh.balance();
        MotorCycle mc = new MotorCycle();
        mc.commute();
        mc.balance();
        mc.start();
    }
}
