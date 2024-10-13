package OOPS.FourPillars;


// Abstract class is a similar to blueprint which defines fields and methods and are implemented in  subclasses
/*
 *  Abstract have "Is-A" relation
 */
abstract class Shape1 {
    final double PI = 3.14;
    abstract public String toString();
    abstract public double calculateArea();
    abstract public double calculateCircumference();
    abstract public double getRadius();
    abstract public int getLength();
    abstract public int getWidth();
    abstract public int getColor();
    abstract public void setColor(String color);
    abstract public void setLength(int length);
    abstract public void setWidth(int width);
}

abstract class Circle1 extends Shape1 {
    // under construction ;)
}

public class Abstraction {
    
}
