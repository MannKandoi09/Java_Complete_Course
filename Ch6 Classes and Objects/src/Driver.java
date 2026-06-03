public class Driver {

    static int minAgeOfDriving = 18;

    int age;

    String name;

    String dateOfLicense;

    public boolean isAllowedToDrive(){
        return this.age >= minAgeOfDriving;
    }

    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.addFuel(6);
//        myCar.drive();
//        myCar.drive();
//        myCar.drive();
//        myCar.addFuel(3);
//        myCar.drive();
//
//        System.out.println(myCar.getCurrentFuelLevel());

        Car swift = new Car("Red");
        Car thar = new Car();
        //swift.addFuel(6);
        swift.start().drive();
        System.out.println(swift.color);

//        Driver myDriver = new Driver();
//        myDriver.dateOfLicense = "1/Jan/2020";
//        System.out.println(minAgeOfDriving);
    }
}
