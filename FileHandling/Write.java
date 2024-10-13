package FileHandling;

import java.io.*;
import java.nio.file.*;
import java.nio.charset.Charset;
import java.util.*;

/**
 * A BufferedWriter Object is used to write to a file
 * 
 * BufferedWriter.write() method writes a String to the file
 * 
 * StandardOpenOption: (enum)
 * - CREATE = create a new File if it doesn't exist
 * - WRITE  = Overwrite the contents of the file
 * - APPEND = Add the new text to the end of the file(EOF)
 */


public class Write {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        getUserData(data);
        writeToFile(data);
    }

    public static void getUserData(ArrayList<String> data) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Registries: ");
        int len = sc.nextInt(); sc.nextLine();
        for(int i = 0; i < len; i++) {
            data.add(sc.nextLine());
        }
        sc.close();
    }

    public static void writeToFile(ArrayList<String> data) {
        Path path = Paths.get("./FileHandling/Cookies.txt");
        /**
         * If we want to write to a file if it only exists
         *    we can check beforehand with Files.exists(path)
         */
        System.out.println(Files.exists(path));
        try(BufferedWriter write = Files.newBufferedWriter(path, Charset.forName("UTF-8"), StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            for(String str: data) {
                write.write(str);
                write.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }
    }
}
