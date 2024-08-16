package Nikhil;

public class Task2 {
    public static void main(String[] args) {
        int[] integers = {1, 2, 3, 4};
        char[] characters = {'a', 'b', 'c', 'd', 'e'};
        boolean[] booleans = {true, false, true, false, true};
        String[] strings = {"Hello", "World", "Java", "Programming"};


        for(int integer: integers) System.out.println(integer);
        for(char character: characters) System.out.println(character);
        for(boolean bool: booleans) System.out.println(bool);
        for(String string: strings) System.out.println(string);
    }
}


