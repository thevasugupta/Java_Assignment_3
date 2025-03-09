package File_Handling;

import java.io.File;
import java.io.IOException;

public class FileExistenceCheck {
    public static void main(String[] args) {
        File file = new File("File_Handling_example.txt");

        if (file.exists()) {
            System.out.println("File already exists.");
        } else {
            try {
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("File creation failed.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
}
