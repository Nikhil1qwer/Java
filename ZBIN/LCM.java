// package src;

// public class LCM {
//     public static void main(String[] args) {
//         System.out.println("LCM: " + lcm(1, 2, 3, 4, 10));
//     }

//     static int lcm(int... nums) {
//         int lcm = 1;
//         for(int num: nums) {
//             lcm = num * lcm / Math.(num, lcm);
//         }
//         Math.lcm(1, 3);
//         return lcm;
//     }
// }

package src;

import java.util.Arrays;

class LCM {

    public static void main(String[] args) {
        String nums = "1235640";
        char[] sorted = nums.toCharArray();
        Arrays.sort(sorted);

        if(Arrays.equals(sorted, nums.toCharArray())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(sorted.length);
    }
}
