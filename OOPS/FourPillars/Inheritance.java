package OOPS.FourPillars;

import java.util.*;

/* Inheritance:
 *              Inheritance is a fundamental concept in object-oriented programming (OOP) 
 * that allows a class to inherit properties and behaviors (methods) from another class. 
 * The class that inherits is called the subclass or derived class, and the class being inherited from is called the superclass or base class.
 *
 *   Key Points:
 *       1. Reusability: 
 *              Inheritance promotes code reusability. You can create a new class based on an existing class, reusing its code without having to rewrite it.
 *       2. Hierarchy: 
 *              It establishes a natural hierarchy between classes. For example, a Dog class can inherit from an Animal class, indicating that a dog is a type of animal.
 *       3. Method Overriding: 
 *              Subclasses can override methods of the superclass to provide specific implementations.
 *       4. Polymorphism: 
 *              Inheritance supports polymorphism, where a subclass can be treated as an instance of its superclass.
 */

/* NOTE:
 *      By default all the classes we create extends the Object by default
 * To check --> `className` instanceof `className we want to check id it is a super-class`
 */


class Shape { // SuperClass (Origin) 
    private String color;

    Shape(String color) {
        this.color = color; // 'this' keyword refers to the current class fields
        // used when arguments to constructors and fields of the class possess same variable names
    }

    Shape() {
        this.color = "White";
    } // end of constructors to support all types of arguments passed to the constructor

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

 class Circle extends Shape {// subClass (derivatives) of superClass(Shape)
    final double PI = Math.PI; // the field PI is assigned as final to not let the sub-classes to modify the PI varaible
    private double radius;

    Circle(String color, double radius) {
        super(color); // super keyword refers to the constructor of the superclass
        this.radius = radius;
    }

    Circle(double radius) {
        this("White", radius); // this keyword refers to the constructor of self and self fields
    }

    Circle(String color) {
        super(color);
    }

    Circle() {
        this(0);
    } // end of constructors to support all types of arguments passed to the constructor

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * PI * radius;
    }

    @Override // overiding the by default method when we try to print the instance of the class from superclass Object
    public String toString() {
        return "Circle {" + 
                "Color = " + getColor() + 
                ", Radius = " + radius + 
                ", area = " + calculateArea() +
                ", Circumference = " + calculateCircumference() + 
                "}\n";
    }

    @Override
    public void finalize()
    {
        System.out.println("finalize method overridden");
    }

}

class Rectangle extends Shape { // subClass of superClass(Shape)
    private int length;
    private int width;

    Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    Rectangle(int length, int width) {
        this("White", length, width);
    }

    Rectangle(String color) {
        this(color, 0, 0);
    }

    Rectangle() {
        this("White", 0, 0);
    } // end of constructors to support all types of arguments passed to the constructor

    public int calculateArea() {
        return length * width;
    }

    public int calculatePerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "Rectangle {" + 
                "Color = " + getColor() + 
                ", length = " + length + 
                ", Width = " + width +
                ", area = " + calculateArea() +
                ", Perimeter = " + calculatePerimeter() +
                "}\n";
    }

}

class Square extends Rectangle { // subClass that inherits another subclass(rectangle) that inherits superclass(Shape)
    private int side;

    Square(String color, int side) {
        super(color, side, side);
        this.side = side;
    }

    Square(String color) {
        this(color, 0);
    }

    Square(int side) {
        this("White", side);
    }

    Square() {
        this("White", 0);
    } // end of constructors to support all types of arguments passed to the constructor

    // subclasses can override the methods of superclass using annotation "@Override"
    @Override
    public int calculatePerimeter() {
        return 4 * side;
    }
    // overiding the by default method when we try to print the instance of the class from superclass Object
    @Override
    public String toString() {
        return "Square {" + 
                "Color = " + getColor() + 
                ", length = " + side + 
                ", area = " + calculateArea() +
                ", Perimeter = " + calculatePerimeter() +
                "}\n";
    }

}

public class Inheritance {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { // Exception handling
            start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void start() {
        // creating instaces of the objects of type "Non-static"
        Circle circle = new Circle("Red", 12);
        Rectangle rectangle = new Rectangle("Blue", 12, 12);
        Square square = new Square(12);

        System.out.println(circle); // when we try to print the instance itself by default toString() method in Object class is triggered
        System.out.println(rectangle);
        System.out.println(square);
    }

}




/* Notes:
                ALL SUBCLASSES ARE SUPERCLASSES BUT ALL SUPERCLASSES ARE NOT SUBCLASSES
                CLASSES ARE THE BLUEPRINTS OF A OBJECT
                SUPERCLASSES ARE NOT WRITTEN IN THE TEST CLASSE(the class that has main class) AND ARE MAINTAINED INDIVISUALLY AND CONNECTED THROUGH PACKAGES

Source: Oracle (JFo)

    UML: Unified Modelling Language
        UML is a way of describing relations among classes in a system, or graphical representation of a system
        Refer More about UML in JF 7-4: Inheritance
*/
