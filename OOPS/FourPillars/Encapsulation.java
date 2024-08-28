package OOPS.FourPillars;

import java.util.*;
/* Encapsulation:
 *          Encapsulation means to enclose something into a capsule or a container.
 *  such as putting a letter in a envelope
 * 
 *      In Object-Oriented Proagramming, encapsulation encloses, or wraps, the internal working
 *  of a Java instance/object(Classes)
 * 
 *      Encapsulating your data prevents it from being modified by the user or other classes,
 *  so that the data is not corrupted.
 * 
 */

/* Access Modifiers:
 * 
 *     - Used to customize the visibilty of thair data and methods with several levels of security
 * 
 *      1. public: Any Class in any package can Access the class
 *      2. protected: All SubClasses and all Classes in the same package can Access the class
 *      3. private: Only to other methods within the class itself.
 *
 *  Note: by default any method or field are accessed with the package itself only.
 */

class Nikhil {
    Nikhil() { // constructor
        System.out.println("AHaHaHa\nHero to the rescue");
    }

    public String name = "Nkhil"; // public fields can be changed and Accessed after creating a Instance of that object
    public String college = "Aditya"; // Same goes for college
    protected String city = "Rajmundry"; // only available to sub classes and classes in the same package
    private String Lover = "Error!! NO LUCK"; // Only Nikhil Object has access to this field and will not be given access to any one outside of the Nikhil object
    private int age = 999; // other classes have no access to age
    public final char gender = 'M'; // constant variable that can't be changed in any instance of the object

    private Queue<String> fans = new LinkedList<>(); // this comes under polymorphism refer Polymorphism.java in the current directory

    /*  Setters: 
     *      Setters are used to modify private fields of a class if not constant
     * 
     *  Getters:
     *      Getters are used to retrieve values of a private field in a class 
     */

    // this is a method that is available to all the classes and can be called outside the class itself
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getLover() {
        return Lover;
    }

    public String askAPoem() {
        return "This is a Poem!!!!!";
    }

    public String setLover(String name, char gender) {
        if(thinkStraight(name, gender) == 0) {
            return "Am I a joke to youu";
        }
        return "Ahahaha nice tryy";
    }

    // This is a method that only belongs to the class and only other methods in the class have acces to it
    private int thinkStraight(String name, char gender) {
        if(this.gender == gender) {
           System.out.println("Pakk You!!!!!"); // Note: if you by any chance you got offended i will say nvm Fuckk hyouuuuuuu
           return 0;
        } else {
            fans.add(name);
        }
        return 1;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Nikhil nicky = new Nikhil();
        System.out.println("Name: " + nicky.getName());
        // System.out.println("Age: " + nicky.age); 
        // error age is a private field can be accessed through getters
        System.out.println("Age: " + nicky.getAge());

        // nicky.thinkStraight("", 'M');
        // error thinkStraght is a private method cannot be accessed

        String reply = nicky.setLover("", 'M');
        System.out.println(reply);
    }
}


// Encapsulation is nothing but data hiding to avoid data manipulation & tinkering by third parties