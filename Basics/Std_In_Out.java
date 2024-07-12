package Basics;

// Component that Reads-in Input from Buffer.
import java.util.Scanner;

public class Std_In_Out {
    public static void main(String[] args) {
        System.out.print("Enter any Number: ");
        
        // Initialisation
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        System.out.println(a);

        // closing of the scanner is compulsory.
        scan.close();
    }
}
