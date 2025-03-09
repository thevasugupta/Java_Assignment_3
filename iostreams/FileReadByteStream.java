package iostreams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadByteStream {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt")) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData); // Convert byte to character and print
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
