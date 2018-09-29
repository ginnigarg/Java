public class VarArgs {

  static void test(int ...v) {
    System.out.println("\nLength : " + v.length);
    for(int i : v) {
      System.out.print(i + " ");
    }
  }
  public static void main(String args[]) {
   test();
   test(1, 2, 3, 4);
   test(1, 2, 3, 4, 5, 6);
  }

}
