package OOPS.FourPillars;

import java.util.*;

class Shape { // SuperClass
    private String color;

    Shape(String color) {
        this.color = color;
    }

    Shape() {
        this.color = "White";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class Circle extends Shape { // subClass
    final double PI = Math.PI;
    private double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    Circle(double radius) {
        this("White", radius);
    }

    Circle(String color) {
        super(color);
    }

    Circle() {
        this(0);
    }

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

    @Override
    public String toString() {
        return "Circle{" + 
                "Color = " + getColor() + 
                ", Radius = " + radius + 
                ", area = " + calculateArea() +
                ", Circumference = " + calculateCircumference() + 
                "}\n";
    }

}

// class Rectangle extends Shape { // subClass

// }

// class Square extends Rectangle { // subClass that inherits another subclass

// }

public class Inheritance {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void start() {
        Circle c1 = new Circle("Red");
        c1.setRadius(12);
        System.out.println(c1.toString());
    }
}




/* Notes:

Source: Oracle (JFo)

    UML: Unified Modelling Language
        UML is a way of describing relations among classes in a system, or graphical representation of a system
        Refer More about UML in JF 7-4: Inheritance
*/
