package FileHandling;

import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.charset.Charset;
import java.nio.file.StandardOpenOption; // enum

/**
 * Files Class:
 *      The Files class is a Static class which is useful to discover the Existence of a file and also the Properties of the same file
 *      such as,
 *          - Readable
 *          - Writeable
 *          - Executable
 *          - Hidden
 *          - The same (to chect if two file paths are same)
 * 
 *      ex: Files.isReadable(Path); (return a boolean value)
 */



public class ExistenceAndProperties {
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
