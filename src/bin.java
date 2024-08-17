package src;

import java.util.HashMap;

public class bin {
    public static void main(String[] args) {
        // Maps
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(1, map.getOrDefault(1, 0) + 1);
    }
}
