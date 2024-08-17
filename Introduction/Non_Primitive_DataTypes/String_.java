package Introduction.Non_Primitive_DataTypes;

/* Strings:
 *      Strings are Objects in java just like Wrapper classes of primitive datatypes
 *      String Object are Immutable
 */

import java.util.*;

public class String_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String token = sc.next(); // return complete token or input untill an space is encountered
        String str = sc.nextLine(); // return Enter line Meaning till an Enter key(\n)  is encountered
        String num = "10";

        int number = Integer.parseInt(num.substring(0, 2));
        System.out.println(number);

        System.out.printf("Token: %s\nEntire Line: %s", token, str); // format specifier for strings is --> %s

        // there are different method to assign a string to a variable, some are as follow
        String predefined = "Hii, i am immortal";
        String newString = new String("Hii, i am created using new keyword");

        System.out.printf("Predefined String: %s\nString using new Keyword: %s", predefined, newString);

        // String Methods:
        String string = "AbCdE";
        int stringSize = str.length();

        System.out.printf("Size of String: %d\nString in UpperCase Letters: %s\nString in LowerCase Letter: %s\n",
         stringSize, string.toUpperCase(), string.toLowerCase());

        /*Note: 
         *      Since Strings are Immutable all the methods in strings class returns a new String,
         *      Hence, the Original Strings remains Consistant.
         */

        sc.close();
    }
}


/*Immutable:
 *      Immutable means after initialisation of an object it doesn't undergo any changes or updation, in simple we can't perform any changes on the string once initialised.
 */

/* Then How to make changes in  a String?? the Answer to this are two predefined Objects in Java known as,
 *          StringBuilder and StringBuffer
 */
