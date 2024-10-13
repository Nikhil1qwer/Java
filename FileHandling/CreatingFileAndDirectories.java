package FileHandling;


/**
 * Let's Create a sub-directory with the name "Demo" to test for the current program
 *  And also atlast add a demo.txt to the Demo directory
 *  
 *  Check Whether The Directory "Demo" is created successfully or not
 */

import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.charset.Charset;
import java.nio.file.StandardOpenOption; // enum

public class CreatingFileAndDirectories {
    public static void main(String[] args) {
        Path dir = Paths.get("./FileHandling/Demo");
        Path demoFile = Paths.get("demo.txt");
        Path filePath = createFile(dir, demoFile);
        writeToFile(filePath);
        System.out.println(filePath);
    }

    public static void writeToFile(Path path) {
        try (Scanner sc = new Scanner(System.in); BufferedWriter pen = Files.newBufferedWriter(path, Charset.forName("UTF-8"), StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            System.out.print("Enter Number of Registeries: ");
            int len = sc.nextInt(); sc.nextLine();
            for(int i = 0; i < len; i++) {
                pen.write(sc.nextLine());
                pen.newLine();
            }
        } catch(IOException e) {
            System.out.println("Error Handling file(Write)");
        }
    }

    public static void createDirectory(Path path) {
        try {
            Files.createDirectory(path);
        } catch(IOException e) {
            System.out.println("Error Creating Directory");
            e.printStackTrace();
        }
    }

    public static Path createFile(Path dir, Path file) {
        Path absPath = dir.resolve(file); // resolve is used to add directory path to file path
        try {
            if(Files.notExists(dir)) {
                createDirectory(dir);
            }
            if(Files.notExists(absPath)) {
                Files.createFile(absPath);
            }
        } catch(IOException e) {
            System.out.println("Error handling File");
        }

        return absPath;
    }
}
