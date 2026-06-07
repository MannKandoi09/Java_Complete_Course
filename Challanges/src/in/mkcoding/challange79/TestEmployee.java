package in.mkcoding.challange79;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Mann",21,60000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Kandoi");
        System.out.println(emp.getEmployeeDetails());
    }
}
