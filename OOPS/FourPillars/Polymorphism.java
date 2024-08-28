package OOPS.FourPillars;

/**
 * Polymorphism:
 *          DYNAMIC METHOD DISPATCH / DYNAMIC METHOD BINDING
 * 
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
            System.out.println(shape.toString());
        }
    }
}