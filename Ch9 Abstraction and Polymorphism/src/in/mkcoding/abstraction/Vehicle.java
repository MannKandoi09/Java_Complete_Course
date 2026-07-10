package in.mkcoding.abstraction;

abstract class Vehicle implements Transport {

    private int noOfTires;


    @Override
    public void getSetGo() {
        System.out.println("going to place");
    }
}
