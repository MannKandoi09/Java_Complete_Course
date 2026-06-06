package in.gettersetter;

public class Car {

    private String color; // public access chaiye

    private String model; // public acess chaiye

    private double fuelLevel;

    private long costOfPurchase; //default access chaiye

    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        if (color.equals("yellow")){
            System.out.println("Pagal hai kiya");
        }else {
            this.color = color;
        }
        this.color = color;
    }

    public String getModel(){
        return model;
    }

}
