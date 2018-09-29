import java.util.*;

public class MathFunction {

  public static void main(String args[]) {
    System.out.println(Math.abs(-5));
    System.out.println(Math.abs(5));
    System.out.println();

    System.out.println(Math.floor(2.34));
    System.out.println(Math.floor(2.78));
    System.out.println();

    System.out.println(Math.ceil(2.34));
    System.out.println(Math.ceil(2.78));
    System.out.println();

    System.out.println(Math.signum(-187));
    System.out.println(Math.signum(0));
    System.out.println(Math.signum(187));
    System.out.println();

    System.out.println(Math.sqrt(9));
    System.out.println(Math.cbrt(27));
    System.out.println();

    System.out.println(Math.pow(3, 5));
    System.out.println();

    System.out.println(Math.hypot(3, 4));
    System.out.println();

    int[] arr = new int[5];
    for(int i = 0; i < 5; i++) {
      arr[i] = (int) (Math.random() * 100);
    }
    for(int i: arr) {
      System.out.println(i);
    }
    System.out.println();

    System.out.println(Math.log(8));
    System.out.println(Math.log10(100));

  }

}
