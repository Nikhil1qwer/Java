package FileHandling;

import java.io.*;

/**
 * Let's Delete the sub-directory with the name "Demo" to test for the current program that we previously created for testing
 *  
 *  Check Whether The Directory "Demo" is Deleted successfully or not
 */

public class DeletingFileAndDirectories {

    public static void main(String[] args) {
        // Specify the file or directory to be deleted
        File file = new File("./FileHandling/Demo");
        try {
            if(deleteFileOrDirectory(file)) {
                System.out.println("File/Directory deleted successfully");
            } else {
                System.out.println("File directory not found: " + file.getAbsolutePath());
            }
        } catch(Exception e) {
            System.out.println("Failed to delete the file/directory\n" + e);
        }
    }

    public static boolean deleteFileOrDirectory(File file) throws IOException {
        if (file.isDirectory()) {
            // delete Inner Directories Recursively
            File[] contents = file.listFiles();
            if (contents != null) {
                for (File f : contents) {
                    deleteFileOrDirectory(f);
                }
            }
        }
        return file.delete(); // file.deleteIfExists()
    }
}