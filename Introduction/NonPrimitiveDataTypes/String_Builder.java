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

        System.out.println(str);

        System.out.println();

        sc.close();
    }
}