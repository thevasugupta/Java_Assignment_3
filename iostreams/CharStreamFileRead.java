package iostreams;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamFileRead {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("input.txt")) {
            int content;
            while ((content = fr.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
