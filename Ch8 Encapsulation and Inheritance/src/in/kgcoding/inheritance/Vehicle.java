package in.kgcoding.inheritance;

public class Vehicle {

    private int noOfTyres;

    public void setNoOfTyres(int noOfTyres){
        this.noOfTyres = noOfTyres;
    }

    public void commute(){
        System.out.println("I am going from Place A to Place B using  tires: \n" + noOfTyres);
    }
}
