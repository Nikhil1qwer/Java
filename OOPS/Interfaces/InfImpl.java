package OOPS.Interfaces;

/*
 *  Interfaces have "Has-A" relation
 */
interface Inf {
    void greetUser();
    void thankUser();
    void printUserDetails();
}

// Functional Interface can only contain exactly one abstract method
@FunctionalInterface
interface infer {
  int add(int a, int b);
}
public class InfImpl implements Inf {
    private String name;
    private int age;

    InfImpl(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void greetUser() {
        if(name != null) {
            System.out.println("Welcome! " + name);
        } else {
            System.out.println("Welcome! Customer");
        }
    }

    public void thankUser() {
        System.out.println("Thank you!");
    }

    public void printUserDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        InfImpl i = new InfImpl("Nikhil", 30);
        i.printUserDetails();
        i.greetUser();
        i.thankUser();


        infer operation = (a, b) -> a + b;
        System.out.println(operation.add(10, 20));
    }
}
