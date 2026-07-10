package in.mkcoding.polymorphism;

public class Car extends Vehicle{
    public int noOfDoors(){
        return 5;
    }
    public void start(){
        System.out.println("Car is Starting..");
    }
}
