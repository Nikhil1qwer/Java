package Introduction.Collections.Strings;

public class RegexPattern {
    public static void main(String[] args) {
        String str = "Hello, World! This is a test string.";
        String pattern = "^Hello.*string.$";
        System.out.println(str.matches(pattern));  

        String date = "2005-08-02";
        final String dateMatcher = "[0-9]{4}-[0-9]{2}-[0-9]{2}";
        System.out.println(date.matches(dateMatcher));
    }
}
