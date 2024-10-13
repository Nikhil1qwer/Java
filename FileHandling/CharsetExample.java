package FileHandling;

import java.io.*;
import java.nio.file.*;
import java.nio.charset.Charset;
import java.util.*;

/**
 * A BufferedReader Object is used to read from a file
 * 
 * Here, the Reader Object is initialised with a Path Object
 *      And The Path Object is initialised with a Path to the file
 *          - Path path = Path.get("File Path");
 *      And the Reader Object is initialised with a Charset Object
 *          - (BufferedReader input = Files.BufferedReader(path, Charset.forName("UTF-8")));
 *      ex: String line = input.readLine();
 */

public class CharsetExample {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        readData(data);
        displayData(data);
    }

    public static void displayData(ArrayList<String> data) {
        System.out.println(data.toString());
    }

    public static void readData(ArrayList<String> data) {
        String line;
        Path path = Paths.get("./FileHandling/Data.txt");
        try (BufferedReader input = Files.newBufferedReader(path, Charset.forName("UTF-8"))) {
            line = input.readLine();
            while(line != null) {
                data.add(line);
                line = input.readLine();
            }
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        } catch(EOFException e) {
            System.out.println("End of file reached");
        } catch(IOException e) {
            System.out.println("Error reading file");
        }
    }
}
