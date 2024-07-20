package Basics;

import java.util.*;

public class Branching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        sc.close();
    }
}