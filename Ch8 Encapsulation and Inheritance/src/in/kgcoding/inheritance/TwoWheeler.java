package in.kgcoding.inheritance;

public class TwoWheeler extends Vehicle {
    TwoWheeler(){
        setNoOfTyres(2);
    }
    public void balance(){
        System.out.println("I am Balancing on two tires");
    }

}
