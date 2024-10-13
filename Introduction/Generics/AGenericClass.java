package Introduction.Generics;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;

/**
 * A Generic class is like a template that define a blueprint for a class.
 *      It doesn't define the type of data it will work with, allowing the user to define the type.
 *      It is a class that can work with any type of data.
 *      The data type is specified when the object is created.
 *      The data type is needed to be Wrapper Class or Object.
 * 
 *      Type Interface: diamond operator <> is used to specify the type of data.
 * 
 *      Generic WildCards: ? is used to specify an unknown type.
 *          1. Bounded
 *              <?>
 *          2. UnBounded
 *              <? extends T> & <? super T>
 *              restrict Type of data to be used.
 *              ex: <? extends Number> can only store Number or its subclasses.
 *                  <? extends String> can only store String or its subclasses.
 *                  <? super Number> can store Number or its superclasses.
 *                  <? super Integer> can store Integer or its superclasses. 
 * 
 * Example:
 *      Generic<Integer> intObj = new Generic<>(10);
 *      Here, the type of data is Integer.
 *      The object intObj can only store Integer values.
 * 
 * RealTime Example:
 *      List<Integer> array = new ArrayList<>();
 *      Stack<Integer> stack = new Stack<>();
 *      Queue<Integer> queue = new LinkedList<>();
 *      HashMap<Integer, String> map = new HashMap<>();
 *      HashSet<Integer> set = new HashSet<>();
 *      LinkedList<Integer> list = new LinkedList<>();
 * 
 * In the above examples, the type of data is specified when the object is created.
 * 
 * Advantages of Generic Classes:
 *      1. Type Safety: It provides compile-time type checking, which ensures that the correct type of data is used.
 *                      It helps to avoid ClassCastException at runtime.
 *      2. Reusability: A generic class can be used with any data type, making it more flexible and reusable.
 *      3. Code Reusability: It allows you to write a single class that can work with different types of data.
 *      4. Performance: It improves the performance of the code by avoiding the need for type casting.
 *      5. Readability: It makes the code more readable and understandable by specifying the type of data used.
 *      6. Error Detection: It helps to detect errors at compile time, which makes the code more robust and reliable.
 *      7. Code Maintenance: It simplifies the code maintenance process by reducing the number of classes required.
 *      8. Flexibility: It provides flexibility to work with different types of data without changing the code.
 */     

class Generic<T> {
    private T data;
    Generic(T data) {
        this.data = data;
    }
    Generic() {
        this.data = null;
    }
    public T getData() {
        return data;
    }
}

/**
 * GenericClasses are used to create custom templates for competitive coding. and also used in Java Collections Framework.
 * 
 * Real-Time useful is shown in example below:
 *      visit line 69:
 */

class GenericArray<T> {
    private ArrayList<T> data;
    private Scanner sc;
    private Function<String, T> converter;

    GenericArray(Function<String, T> fn) {
        data = new ArrayList<>();
        sc = new Scanner(System.in);
        converter = fn;
    }

    public ArrayList<T> getData(int len) {
        if(!data.isEmpty()) data.clear();

        for (int i = 0; i < len; i++) {
            while(true) {
                String input = sc.next();
                try {
                    T element = converter.apply(input);
                    data.add(element);
                    break;
                } catch(Exception e) {
                    System.out.println("Invalid Input! Please enter again: ");
                }
            }
        }

        return new ArrayList<>(data);
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
public class AGenericClass {
    public static void main(String[] args) {
        Generic<Integer> intObj = new Generic<Integer>(10);
        System.out.println("Integer Value: " + intObj.getData());

        GenericArray<Integer> arrInt = new GenericArray<Integer>(Integer::parseInt);
        ArrayList<Integer> arr2 = arrInt.getData(5);
        System.out.println(arr2.toString());
        ArrayList<Integer> arr3 = arrInt.getData(3);
        System.out.println(arr3.toString());

        GenericArray<Double> arrDouble= new GenericArray<Double>(Double::parseDouble);
        ArrayList<Double> arr4 = arrDouble.getData(5);
        System.out.println(arr4.toString());

        System.out.println(arr2.toString() + "\n" + arr3.toString() + "\n" + arr4.toString());
    }
}

