package in.mkcoding.polymorphism;

public class OverLoading {

    //Constructor Overloading
    OverLoading(){
        System.out.println("Default Constructor Called..");
    }

    OverLoading(String pop){
        System.out.println(pop);
    }


    //Method Overloading
    public int add(int a, int b){
        return a + b;
    }

    public String add(String a, String b){
        return a.concat(b);
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        OverLoading overload = new OverLoading();
        System.out.println(overload.add(4,4,1));
        System.out.println(overload.add(5,5));
        System.out.println(overload.add("Mann","Kandoi"));
    }
}
