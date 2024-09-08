package src;

import java.util.*;

public class bin {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1); // creating a key-value pair
        map.put(1, map.getOrDefault(1, 0)); // updating a key-value pair
        map.remove(2, 0); // removing a key-value pair
        System.out.println(map.get(1)); // getting the value of a key
        System.out.println(map.containsKey(1)); // checking if a key is present or not
        System.out.println(map.getOrDefault(10, 1)); // to get the value of a key if it is present else return the default value
        for(int key: map.keySet()) { // range based for loop
            System.out.println(key);
        }


        Set<Integer> set = new HashSet<>();
        set.add(2); // inserting an element
        set.add(3);
        set.add(4);
        set.remove(2); // removing an element
        System.out.println(set.contains(4)); // checking if an element is present or not
        for(int key: set) { // range based for loop
            System.out.println(key);
        }

        
        
    }
}
