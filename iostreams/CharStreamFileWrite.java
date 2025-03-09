package iostreams;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamFileWrite {
    public static void main(String[] args) {
        String content  = "Java I/O Streams Example";

        try (FileWriter fw = new FileWriter("example.txt")) {
            fw.write(content);
            System.out.println("File Written Successfully!");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
