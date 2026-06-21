package OopChallanges;

class Employee {
    int id = 101;
    String name = "Mann";

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
    }
}