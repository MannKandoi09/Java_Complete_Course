package in.mkcoding.file;

import java.io.FileWriter;
import java.io.IOException;

public class MkCodingWriter {
    public static void main(String[] args)  {
        String fileName = "java-course.txt";

        try(FileWriter writer = new FileWriter(fileName)){
            writer.write("This is the Best java Course.");
            writer.flush();
            System.out.println("File Writen Successfully...");

        }catch (IOException exception){
            System.out.printf("Exception Occurred %s\n",
                    exception.getMessage());
        }

    }
}
