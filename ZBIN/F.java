package ZBIN;

public class F {
  public static void main(String[] args) {
    Integer[] arr = {1, 2, 3, 4};
    peek(arr);
  }

  public static <T> void peek(T[] arr) {
    for(T i: arr) {
      System.out.println(i);
    }
  }

}