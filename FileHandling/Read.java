package FileHandling;

import java.io.*;
import java.util.*;

/**
 * A BufferedReader Object is used to read from a file
 * A BufferedWriter Object is used to write to a file
 * 
 * BufferedReader:
 *          After intialising the Reader File with a FilePath
 *      The readLine() method is used to read the file line by line
 *      ex: String line = input.readLine();
 */

public class Read {
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
        try (BufferedReader input = new BufferedReader(new FileReader(new File("C:/Users/chint/OneDrive/Documents/GIT_PRO/Java/FileHandling/Data.txt")))) {
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
