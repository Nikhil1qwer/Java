package Nikhil;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = new String[3];
        for(int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }

        for(int i = n - 1; i >= 0; i--){
            System.out.println(str[i].charAt(0) + "---> " + (int)str[i].charAt(i));
        }
        sc.close();
    }
}
