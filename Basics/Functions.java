package Basics;

import java.util.*;

public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GreetUser();
        String name = getUserName(sc);
        GreetUser(name);

        System.out.print("Enter Two Numbers: ");

        int a = sc.nextInt(), b = sc.nextInt();

        int sum = sum(a, b);
        System.out.println("Sum is " + sum);

        ThankUser(getUserName(sc));

        sc.close();
    }

    // function with parameters(string) and no return type
    static void GreetUser(String name) {
        System.out.println("Greetings, " + name);
    }

    // function with no parameters and no return type
    static void GreetUser() { // Method/function Overloading
        System.out.println("Greetings, User");
    }

    // function with two parameters and a return type (int)
    static int sum(int a, int b) {
        return a + b;
    }

    static String getUserName(Scanner sc) {
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        if(name.isEmpty()) {
            name = sc.nextLine();
        }
        return name;
    }

    static void ThankUser(String name) {
        System.out.printf("Thank You, %s", name);
    }
}