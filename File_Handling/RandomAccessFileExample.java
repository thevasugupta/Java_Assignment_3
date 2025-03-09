package File_Handling;

import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("input.txt", "rw")) {
            raf.writeBytes("Hello, this is a sample text.");

            raf.seek(7);
            raf.writeBytes("Java");


            raf.seek(0);  // Go back to the beginning of the file
            String content = raf.readLine();
            System.out.println("Updated content: " + content);
        } catch (IOException e) {
            System.out.println("An error occurred while accessing the file.");
            e.printStackTrace();
        }
    }
}
