package iostreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamFileWrite {
    public static void main(String[] args) {
        String content = "Java I/O Streams Example";

        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(content.getBytes()); // Convert string to bytes and write
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
