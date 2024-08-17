package Introduction.Non_Primitive_DataTypes;

/* An ArrayList is a dynamic array that resizes itself just like an Vector in C++.
 * ArrayList takes Objects, & Wrapper Classes of Primitive Datatypes
 */

/* Wrapper Class -->> Wrapper classes are used to convert primitive DataTypes into Objects
 * as ArrayList can only work with Objects, Wrapper Classes are used to allow primitives to be used as Objects
 */


import java.util.Scanner; // Reading Input 
import java.util.ArrayList; // Class which contains utility of ArrayList
import java.util.Comparator; // Comparator Class to use Comparator in sorting

// import java.util.*; -->  here * helps to import all the utilities supplied by the class

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(); // Declaration of an Integer ArrayList with Wrapper Class of integer
        // we can use String, Char, Double, Float that such are Objects

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ArrayList Size: ");
        int size = sc.nextInt();

        for(int i = 0; i < size; i++) {
            nums.add(sc.nextInt());
            // we use .add() it is a method that helps to add the element into the List
        }

        System.out.printf("Given ArrayList of Size %d is: ", size);
        for(int i = 0; i < nums.size(); i++) { // .size() return size of the List
            System.out.printf("%d ", nums.get(i));
            // here we use .get() method to retrieve the element at that index
        }

        System.out.println();

        nums.sort(Comparator.naturalOrder()); // sort an ArrayList in naturalOrder(ascending) or can sort in reverseOrder(descending)

        System.out.printf("ArrayList after Sorting: ");
        for(int num: nums) { // Ranged based for-loop
            System.out.printf("%d ", num);
        }

        System.out.println();

        System.out.printf("ArrayList after updating it values: ");
        nums.replaceAll(num -> num * num);
        // Here .replaceAll is a method that is used to update the elements in the List
        // it takes a lambda expression

        for(int num: nums) {
            System.out.printf("%d ", num);
        }
        
        sc.close();
    }
}

/* Lambda Expression: 
 * 
 *          A lambda expression is a short and nameless(anonymous) function that is used when the logic to implement is simple, short and concise
 * 
 *  for example --> a function that takes two elements and returns their sum
 *                  it will be structured as (a, b) -> a + b;
 *  
 * 
 *  if it involves more than one line to implement such as an Even or Odd task
 * 
 *              (num) -> {
 *                   if(num & 1) {
 *                          return "Even";
 *                   } else {
 *                          return "Odd";
 *                   }
 *               }
 * 
 * 
 * Lambda Expression are mostly used as custom comparators
 */