package in.kgcoding.equals;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Person person1 = new Person("Mann",21,"001");
        Person person2 = new Person("Mann",21,"001");

        if (person1.equals(person2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }

    }
}
