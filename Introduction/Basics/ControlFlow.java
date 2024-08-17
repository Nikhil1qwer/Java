package Introduction.Basics;

import java.util.*;

public class ControlFlow {

    static double IamInevitable = 10e9; // exponent(e)  --> refers to 10^9
    // Here IamInevitable is like a global varaiable but not exactly as Java is a pure OOPS language
    // This variable of double data is available to the methods in the same class but not other class can access this variable


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Range: ");
        int Range = sc.nextInt();

        System.out.printf("\nFor Loop: ");

        for(int i = 0; i <= Range; i++) { // Here i is an instace variable limited to for loop only
            System.out.printf("%d ", i);
        }

        System.out.printf("\nWhile Loop: ");


        int i = 0; // here i is a local variable accessed within the same function
        while(i <= Range) {
            System.out.printf("%d ", i);
            i++;
        }

        System.out.printf("\nDo While Loop: ");

        i = 0; // variable Re-initailised --> Not Redeclared(Error)
        do {
            System.out.printf("%d ", i);
            i++;
        } while(i <= Range);

        sc.close();
    }
}
