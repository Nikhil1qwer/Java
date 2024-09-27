package Introduction.NonPrimitiveDataTypes;

import java.util.*;

/* StringBuilder:
 *          StringBuilder are Classes in java work like Strings and are mutable and are not synchronized meaning they run faster.
 */

public class String_Builder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // sc.nextLine(); --> returns a String, we have to cast into StringBuider Type

        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);

        str.append("I am Mutable");

        str.length();

        System.out.println(str);

        Integer.toString(1).length();
        System.out.println();

        StringBuilder str1 = new StringBuilder("Hello");
        str1.setCharAt(0, 'T'); 
        str1.charAt(0);
        System.out.println(str1);

        sc.close();
    }
}