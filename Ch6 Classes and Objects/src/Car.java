public class Car {


    //Properties Or Instance Variables
    int noOfWheels;

    String color;

    float maxSpeed;

    float currentFuelInLiters;

    int noOfSeats;

    //Instance Methods
    public void drive(){
        if (currentFuelInLiters <= 0){
            System.out.println("Car is Out of Fuel");
        } else if (currentFuelInLiters <= 5) {
            System.out.println("Car is in Reserve Mode, Please Refuel");
            currentFuelInLiters--;
        }else{
            System.out.println("Car is Driving..");
            currentFuelInLiters--;
        }
    }

    public void addFuel(float fuel){
        currentFuelInLiters += fuel;

    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }



}
