public class Course_52 {

    static int maxCapacity = 100;

    String courseName;

    int enrollments;

    String[] enrolledStudents;

    Course_52(String courseName){
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity){
        Course_52.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName){
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }

    void unEnrollStudent(String studentName){
        System.out.println("Student Removed..");
        enrollments--;
    }

    public static void main(String[] args) {
        Course_52 course = new Course_52("Java");
        course.enrollStudent("Mann");

    }
}
