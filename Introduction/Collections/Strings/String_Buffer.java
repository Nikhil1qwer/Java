package Introduction.Collections.Strings;
import java.util.*;

/**
 * This class demonstrates the usage of the StringBuffer class in Java.
 * 
 * StringBuffer is a peer class of String that provides much of the functionality 
 * of strings. The key difference between String and StringBuffer is that 
 * StringBuffer objects are mutable, meaning they can be modified after they are created.
 * 
 * Key Points:
 * - StringBuffer is synchronized, meaning it is thread-safe.
 * - It is used when you have to make a lot of modifications to strings of characters.
 * - StringBuffer can be converted to a String using the toString() method.
 * - Common methods include append(), insert(), replace(), delete(), and reverse().
 * 
 */

public class String_Buffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Append a string to the StringBuffer
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert a string at a specified position
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // Replace a portion of the string
        sb.replace(5, 10, " C++");
        System.out.println("After replace: " + sb);

        // Delete a portion of the string
        sb.delete(5, 9);
        System.out.println("After delete: " + sb);

        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        sc.close();
    }
}