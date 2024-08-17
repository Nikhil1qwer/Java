package OOPS.ExeptionHandling;

import java.util.*;
import java.lang.AutoCloseable;

public class Branching implements AutoCloseable{
    public static void main(String[] args) {
        try (Branching resource = new Branching(); Scanner sc = new Scanner(System.in)) {

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
            
        } catch (Exception e) {
            System.out.println("Invalid Input");
            e.printStackTrace();
        }

    }

    @Override
    public void close() {
        System.out.println("Resources Cleared");
    }
    
}