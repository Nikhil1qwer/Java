package Introduction.Basics;

public class HelloWorld {
    public static void sayHelloWorld() { // variable argument method
        System.out.println("Hello, World");
    }
}

class A {
    public static void main(String[] args) {
        HelloWorld.sayHelloWorld();
    }
}