public class Car {


    //Properties Or Instance Variables
    int noOfWheels;

    String color;

    float maxSpeed;

    float currentFuelInLiters;

    int noOfSeats;

    Car(String color){
        this.color = color;
        noOfWheels = 4;
        maxSpeed =  150;
        currentFuelInLiters = 2;
        noOfSeats = 5;
    }
    Car(){
        //Constructor Chaining
       this("Black");
       currentFuelInLiters = 5;
    }


    //Instance Methods
    public Car start(){
        if (currentFuelInLiters <= 0){
            System.out.println("Car is Out of Fuel, can not start");
        } else if (currentFuelInLiters <= 5) {
            System.out.println("Car is in Reserve Mode, Please Refuel");
        }else{
            System.out.println("Car is Started.. bruhhhhh");

        }
        return this;
    }
    public void drive(){
            currentFuelInLiters--;
            System.out.println("Car is Driving..");
    }

    public void addFuel(float currentFuelInLiters){
        this.currentFuelInLiters += currentFuelInLiters;

    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }



}
