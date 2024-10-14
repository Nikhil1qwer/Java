package ZBIN;
import java.util.*;

public class contest {

    int solve(int n, int[] arr, int val) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int xorResult = arr[i] ^ val;
            frequencyMap.put(xorResult, frequencyMap.getOrDefault(xorResult, 0) + 1);
        }
        
        int maxFrequency = 0;
        for (int freq : frequencyMap.values()) {
            if (freq > maxFrequency) {
                maxFrequency = freq;
            }
        }
        
        return maxFrequency;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int val = sc.nextInt();
        contest c = new contest();
        int ans = c.solve(n, arr, val);
        System.out.println(ans);
        sc.close();
    }
}