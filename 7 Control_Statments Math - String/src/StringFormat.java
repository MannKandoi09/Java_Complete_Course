public class StringFormat {
    public static void main(String[] args) {
        String  name = "Mann";
        int marks= 45;
        System.out.println("Hello " + name + " ,Your Marks are: " + marks);

        System.out.printf("Hello %-10S, Your Marks are: %d", name , marks);
    }
}
