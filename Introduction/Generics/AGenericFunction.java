package Introduction.Generics;

public class AGenericFunction {
    public static void main(String[] args) {
      Integer[] arr = {1, 2, 3, 4};
      peek(arr);
    }
    
    // T is a type parameter which is automatically replaced by the type of the argument passed to the functioni
    public static <T> void peek(T[] arr) {
      for(T i: arr) {
        System.out.println(i);
      }
    }
  
  }