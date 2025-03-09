package File_Handling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("copyOfInput.txt");

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
