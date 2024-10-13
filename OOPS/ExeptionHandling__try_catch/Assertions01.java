package OOPS.ExeptionHandling__try_catch;

import java.util.*;
/*
 * Assertions:
 *      Assertions are used to check internal logic of a single method
 *      It is used to check the correctness of the program
 * NOTE:
 *      Assertions are disabled by default
 *      To enable assertions, use -ea flag
 *      ex: 
 *          javac Assertions01.java
 *          java -ea Assertions01
 */

public class Assertions01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        assert x < 2_147_483_647.0 : "Number too large to convert to integer";
        System.out.println(x);
        int y = (int)x;
        System.out.println(y);
        sc.close();
    }
}
