import java.util.Scanner;

public class Break_65 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("Enter your Command: ");
            String command = scan.next();
            if (command.equals("exit")){
                break;
            }
        }
        System.out.println("You have Successfully exit");
    }
}
