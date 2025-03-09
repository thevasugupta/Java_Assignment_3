package iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileRead {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) { // Reads line by line
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
