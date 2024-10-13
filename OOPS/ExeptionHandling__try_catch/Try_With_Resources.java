package OOPS.ExeptionHandling__try_catch;

import java.util.*;
import java.lang.AutoCloseable;

/*  Exception Handling:     try - catch - finally
 *      the try catch statement are used to overcome the runtime errors that arise during runtime\
 *      these are handled by the programmer before the execution of the program
 *      
 *      
 *      Multi-catch Statement
 */

public class Try_With_Resources implements AutoCloseable{
    public static void main(String[] args) {
        // if we initialise Object Like Scanner etc.., we no longer have to manually close them is know as Try with resources
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter your Age(in yrs): ");
            int Age = sc.nextInt();

            if(Age >= 18 && Age <= 100) {
                System.out.println("Eligible to Vote");
            } else if(Age < 18) {
                System.out.println("Not Eligible to Vote");
            } else if(Age > 100) {
                System.out.println("How are you even Alive??");
            } else {
                System.out.println("I can't be accessed");
            }

            System.exit(0);
            
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
            // e.printStackTrace();
        }
    }
    
    @Override // finalizer overloading
    public void close() {
        System.out.println("Resources Cleared");
    }
    
}