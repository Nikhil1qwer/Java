package Introduction.Collections.Strings;
import java.util.*;


/**
 * StringBuilder:
 *      StringBuilder are Classes in java work like Strings and are mutable and are not synchronized meaning they run faster.
 * 
 * StringBuilder is a class in Java that functions similarly to Strings but is mutable, meaning its content can be changed after it is created.
 * Key points about StringBuilder:
 * 
 * - Mutable: Unlike Strings, which are immutable, StringBuilder objects can be modified after they are created.
 * - Performance: StringBuilder is not synchronized, which means it is not thread-safe but performs faster in single-threaded environments.
 * - Methods: StringBuilder provides various methods to manipulate strings, such as append(), insert(), delete(), and reverse().
 * - Usage: It is particularly useful when you need to perform a lot of modifications to a string, as it avoids the overhead of creating multiple String objects.
 * 
 * Example usage:
 * - Creating a StringBuilder object: StringBuilder str = new StringBuilder("Initial String");
 * - Appending to a StringBuilder: str.append(" More text");
 * - Modifying characters: str.setCharAt(0, 'T');
 * - Getting the length: int length = str.length();
 */
public class String_Builder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input from the user and create a StringBuilder object
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println("Initial StringBuilder content: " + str);

        // Append a string to the StringBuilder
        str.append(" I am Mutable");
        System.out.println("After append: " + str);

        // Get the length of the StringBuilder
        int length = str.length();
        System.out.println("Length of StringBuilder: " + length);

        // Create another StringBuilder object
        StringBuilder str1 = new StringBuilder("Hello");

        // Modify a character in the StringBuilder
        str1.setCharAt(0, 'T');
        System.out.println("After setCharAt: " + str1);

        // Get a character from the StringBuilder
        char ch = str1.charAt(0);
        System.out.println("Character at index 0: " + ch);

        // Close the scanner
        sc.close();
    }
}