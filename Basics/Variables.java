package Basics;

public class Variables {
    public static void main(String[] args) {

        boolean flag = true;

        byte a = 1;
        short b = 127;
        int c = 1;
        long d = 12345L;

        float e = 4.14f;
        double f = 99.999;

        char g = 'S';
        String h = "Nikhil";

        // Format Specifires
        System.out.printf("%b, %d %d %d %d %f %f %c %s", flag, a, b, c, d, e, f, g, h);

    }
}
