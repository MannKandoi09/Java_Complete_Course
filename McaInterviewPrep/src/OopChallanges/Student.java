package OopChallanges;

class Student {
    int rollNo = 1;
    String name = "Rahul";

    void show() {
        System.out.println(rollNo + " " + name);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.show();
    }
}
