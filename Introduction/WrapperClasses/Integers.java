package Introduction.WrapperClasses;


public class Integers {
    public static void main(String[] args) {
        String s1 = "123";
        int num = Integer.parseInt(s1);

        String s2 = "101010";
        int binaryNum = Integer.parseInt(s2, 2);

        String octal = "1234";
        int octalNum = Integer.parseInt(octal, 8);

        String hexa = "A1B2";
        int heaxNum = Integer.parseInt(hexa, 15);

        System.out.printf("Int: %d\nBinary: %d\nOctal: %d\n Hexa: %d\n",num, binaryNum, octalNum, heaxNum);


        // int - string



        int decimal = 1234;
        String decimalString = Integer.toString(decimal, 10);

        System.out.printf("Decimal String: %s", decimalString);
    }
}