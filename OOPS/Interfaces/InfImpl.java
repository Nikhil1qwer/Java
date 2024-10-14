package OOPS.Interfaces;

/*
 *  Interfaces have "Has-A" relation
 */
interface Inf {
    void greetUser();
    void thankUser();
    void printUserDetails();
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
    }
}
