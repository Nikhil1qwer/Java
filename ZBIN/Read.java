package src;

import java.util.Scanner;


// Quadratic Equation
class Read {
   public static void main(String[] args) {
      int a, b, c, d, r1, r2, r, i, sq;
      Scanner sc= new Scanner(System.in);
      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();

      d = b * b - 4 * a * c;
      sq = (int)Math.sqrt(d);

      if(d == 0) {
        System.out.println("Roots are real and equal");
        r1 = r2 = (-1 * b) / 2 * a;
        System.out.println(r1 + "\n" + r2);
      } else if(d > 0) {
        System.out.println("Roots are real and distinct");
        
        r1 = (-b + sq) / 2 * a;
        r2 = (-b - sq) / 2 * a;
        System.out.println(r1 +"\n" + r2);
      } else {
        System.out.println("Roots are imaginary");
        r = -b / 2 * a;
        i = sq / 2 * a;
        System.out.println(r + " +i" + i);
      }

      sc.close();
   }
}
