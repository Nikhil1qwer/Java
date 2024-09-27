package OOPS.FourPillars;

/**
 * Polymorphism:
 *          DYNAMIC METHOD DISPATCH / DYNAMIC METHOD BINDING
 * 
 *              Polymorphism allows objects of different classes to be treated as objects of a common superclass.
 *              It is one of the four fundamental principles of Object-Oriented Programming (OOP).
 * 
 * In this example:
 * - We have a superclass `Shape` and three subclasses `Circle`, `Rectangle`, and `Square`.
 * - We create instances of these subclasses and store them in an array of type `Shape`.
 * - At runtime, the appropriate method for each object is called, demonstrating dynamic method dispatch.
 */


public class Polymorphism {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 12);
        Rectangle rectangle = new Rectangle("Blue", 12, 12);
        Square square = new Square(12);

        Shape[] shapes = new Shape[3];
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = square;

        for(Shape shape: shapes) {
            System.out.println(shape);
        }
    }
}

/*  Casting:
 *      
 *     Upcasting:   Shape shape = new Circle();
 *     Downcasting: Circle circle = (Circle) shape;
 *                  Rectangle rectangle = (Rectangle) shape; // ClassCastException
 *          
 */