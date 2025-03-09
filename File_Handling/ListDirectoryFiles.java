package File_Handling;

import java.io.File;

public class ListDirectoryFiles {
    public static void main(String[] args) {
        File directory = new File("C:\\Users\\theva\\IdeaProjects\\Java Assigment 3");  
        if (directory.isDirectory()) {
            String[] files = directory.list();
            if (files != null) {
                for (String file : files) {
                    System.out.println(file);
                }
            } else {
                System.out.println("There are no files in the directory.");
            }
        } else {
            System.out.println("The provided path is not a directory.");
        }
    }
}
