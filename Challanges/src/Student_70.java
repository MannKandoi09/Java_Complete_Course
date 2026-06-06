public class Student_70 {

    String name;

    int age;

    public Student_70(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student_70{" +
                "name='" + "Mann" + '\'' +
                ", age=" + 21 +
                '}';
    }

    public static void main(String[] args) {

        Student_70 stu = new Student_70("Mann", 21);
        System.out.println(stu);


    }
}
