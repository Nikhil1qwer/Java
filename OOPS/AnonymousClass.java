package OOPS;

import java.util.*;

public class AnonymousClass {

    // AnonymousClass implement
    interface Greeting {
        void sayHello();
    }

    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello, world!");
            }
        };

        greeting.sayHello();

        Scanner sc = new Scanner(System.in);
        sc.close();
    }
}