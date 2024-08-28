package src;

import java.util.*;

public class bin {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(4);
        for(int key: set) {
            System.out.println(key);
        }
    }
}
