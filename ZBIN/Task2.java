package src;

class User{
    String name;
    User() {
        this.name = "Customer";
    }
    User(String name) {
        this.name = name;
    }
    public void greetUser() {
        System.out.println("Welcome, Customer");
    }
    public void greetUser(String name) {
        System.out.println("Welcome, " + name);
    }
}
public class Task2 {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        User nikhil = new User("nikhil");
        User user = new User();

        nikhil.greetUser();
        user.greetUser("Greninja");
    }
}


