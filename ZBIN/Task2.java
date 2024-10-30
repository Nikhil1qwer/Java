package ZBIN;

public class Task2 {
    public static float Division(int a, int b) {
        return a / (float) b;
    }

    public static void main(String[] args) {

        // Exception handline to avoid the crashing of our program
        // real-life
        /**
         * opens a calc and evaluated the expression 0/0
         */
        float res = 0 / 0.0f;
        System.out.println(res);
    }
}
