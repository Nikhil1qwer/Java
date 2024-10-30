package ZBIN;

/**Abstract Classes and Interfaces...
 * 
 * 
 *      Usecase:
 *         scenario 1:
 *              your and working together with a group on a java project where each person has a task to program certain functions for the project
 *          to avoid confusion of function names and there return types as different person has different way of coding according to their way of coding
 * 
 *          Soo, A leader or project head make the rest of the team follow a certain naming convention such as "Pascal Notation" or "snake Notation" etc.., 
 * 
 *          Similarly, to avoid get confused with function names and to maintain uniformity throughout the codebase,
 *          
 *          Abstract & Interfaces are used to maintain the uniformity of the functional names 
 * 
 *          scenario 2:
 *              you are doing a grp project with your frnds and there are many methods/functions to implement override and overrload according to the process
 *              Soo, to maintain uniformity within the codebase (code)
 *              
 *              frnd1, frnd2 (code communication and better understandablity of the code our frnds write)!!
 *          
 *          Ulimate Goal of abstract & interface is to maintain uniformity
 */

/**
 * We use abstract keyword to define a abstract class
 * and extends keyword to use the interface
 * 
 * 
 * we use interface keyword to define a inferface
 * and implements keyword to use/implement the interface
 */

abstract class abstractShape {
    // declare constants

    // declare methods
    abstract double getArea();

    abstract double getPerimeter();

    abstract void setLength(int length);

    abstract void setBreadth(int breadth);
}

// person 2

// we can find uniformity in the code implementation along with function names
// b/w person 1 and person 2

// person 1
class Shape extends abstractShape {
    private int length, breadth;

    Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Shape() {
    }

    double getArea() {
        return length * breadth;
    }

    double getPerimeter() {
        return 2 * (length + breadth);
    }

    // setter?
    void setLength(int length) {
        this.length = length;
    }

    void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}

public class Tester {
    public static void main(String[] args) {
        try {
            start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void start() throws Exception {
        User newUser = new User("nikhil", "1234");
        System.out.println(newUser.matchesPassword("1234"));
    }
}

/**
 * Create a abstract class "abstractUser"
 * that declare abstract methods as follows:
 * 1. changeUserName(String username)
 * 2. changeUserPassword(String password)
 * 3. getUserName()
 * 4. getUserPassword()
 * 5. matchesPassword(String password) ?? returns true if passwords match
 * (functional function)
 * // return type unte either true or false (return type)
 * 6. toString() --> returns userDetails in the format --> "Name: (username),
 * Password: *(stars of length password)"
 * 7. toString(boolean admin = True) --> if called toString class with argument
 * true the format should be
 * "Name: (username), Password: (password)" ??
 */

// code here Notation??
// suprise question ==|| what type of notation we use in Java ==>?? ANS:: camel
// case?
/*
 * 1. userName camel
 * 2. user_name snake
 * 3. UserName pascal
 * 
 * 4. USERNAME upper flat case
 */
abstract class abstractUser {
    abstract String getUserName();

    abstract String getUserPassword();

    abstract void changeUserName(String username);

    abstract void changeUserPassword(String password);

    abstract boolean matchesPassword(String password);

    abstract public String toString();

    abstract void toString(boolean admin);
}

class User extends abstractUser {
    private String username, password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    String getUserName() {
        return username;
    }

    String getUserPassword() {
        return password;
    }

    void changeUserName(String username) {
        this.username = username;
    }

    void changeUserPassword(String password) {
        this.password = password;
    }

    boolean matchesPassword(String password) {
        // base
        if (password.length() != this.password.length()) {
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) != this.password.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    // "Name: (username), Password: *(stars of length password)"

    public String toString() {
        String pass = "";
        for (int i = 0; i < password.length(); i++) {
            pass = pass + "*";

        }
        return "Name: " + username + ", " + "Password:" + pass;
    }

    void toString(boolean admin) {
        if (admin == true) {
            System.out.println("Name: " + username + ", " + "Password:" + password);
        }
    }

}