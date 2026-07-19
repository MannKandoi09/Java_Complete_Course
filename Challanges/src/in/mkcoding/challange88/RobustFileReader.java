package in.mkcoding.challange88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileReader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the Name of File: ");
        String fileName = scan.next();

        try (FileReader reader = new FileReader(fileName)) {
            int read;

            while ((read = reader.read()) != -1) {
                System.out.print((char) read);
            }

        }catch (FileNotFoundException e){
            System.out.println("File Not Found Exception");
        }
        catch (IOException exception){
            System.out.printf("Exception Occurred: %s", exception.getMessage());
        }
    }
}
