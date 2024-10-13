package src;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = IntStream.generate(sc::nextInt).limit(n).toArray();

        for(int num: nums) {
            System.out.println(num);
        }
        sc.close();
    }
}


/*
 * KISS --> Keep it simple stupid
 * DRY  --> Dont repeat yourself
 * Code to Interfaces not to implementations
 * 
 */