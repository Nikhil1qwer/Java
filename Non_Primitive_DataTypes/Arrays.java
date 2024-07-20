package Non_Primitive_DataTypes;

import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++) { // c-style for loop
            arr[i] = sc.nextInt();
        }

        for(int num: arr) { // range based for loop to iterate/enumerate over an entire Array or objects etc..,
            System.out.print(num + " ");
        }

        sc.close();
    }
}
