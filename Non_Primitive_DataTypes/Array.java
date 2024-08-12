package Non_Primitive_DataTypes;

import java.util.*;


public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();

        int[] arr = new int[size]; // here "new" is a keyword that is used to allocate memory to a variable in case here integer
        int[][] IamCalledMatrix = new int[size][size]; // it is a 2D array also known as a Matrix allocateD size * size space for this variable

        IamCalledMatrix[0][0] = 1000;
         // elements are accessed as in "C/C++" with index inclosed in btwn squareBraces --> ArrayName[index]

        for(int i = 0; i < size; i++) { // c-style for loop
            arr[i] = sc.nextInt();
        }

        System.out.print("Array Contains: ");
        for(int num: arr) { // range based for loop cpp-style to iterate/enumerate over an entire Array or objects etc..,
            System.out.print(num + " ");
        } System.out.println();


        Arrays.sort(arr); // arrays include a predefined sorting technique
        System.out.print("Array After Sorting: ");
        for(int num: arr) {
            System.out.print(num + " ");
        } System.out.println();

        // Conversion of an Array into a String
        // Java.Arrays has a predefined method for converion from arrays to string and vice versa
        // Conversion to Strings the method is --> Arrays.toString(ArrayName);

        String ArrayString = Arrays.toString(arr);
        System.out.printf("String Format of Array: %s \n", ArrayString);


        System.out.println("Size of the Array is: " + arr.length); // field to retrieve array length
        // Here Addition operator converts arrayLenth into string

        sc.close();
    }
}

/* Note:
 *      In many Online Coding Platforms like Leetcode, GfG, etcc...,
 *    will ask to solve an function and you have to fill in the logic and if given a question based on arrays
 *    they won't provide you, size of the array in most cases
 *    Because, Array in java has a method called -------> ArrayName.length (return length of the Array)
 */