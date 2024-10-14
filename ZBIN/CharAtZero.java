package ZBIN;
public class CharAtZero {
    public static void main(String[] args) {
        firstOccurence("abc", "def", "ghi", "nik", "hil");
    }
    
    static void firstOccurence(String... strings) {
        StringBuilder sb = new StringBuilder();
        for(String str: strings) {
            sb.append(str.charAt(0));
        }
        System.out.println(sb);
    }
}
