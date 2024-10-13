package Introduction.Basics;

// Component that Reads-in Input from Buffer.
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        System.out.print("Enter any Number: ");
        
        // Initialisation of Scanner object for taking input from the user.
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        // Printing the value of the variable using the System.out.println() method.
        // System.out.println() has some variants like System.out.print() and System.out.printf().
        System.out.println(a);

        // closing of the scanner is compulsory.
        scan.close();
    }
}


// javac (Name).java
// java (Name)