public class ArguementPassing {

  int value;

  ArguementPassing() {
    value = 10;
  }

  void methodReference(ArguementPassing x) {
    ArguementPassing c1 = new ArguementPassing();
    x.value = 5; 
  }

  void swap(Integer x, Integer y) {
    x = x ^ y;
    y = x ^ y;
    x  = x ^ y;
  }

  static int swapValues(int num1, int num2) {
    return num1;
  }

  public static void main(String args[]) {
    ArguementPassing obj1 = new ArguementPassing();
    ArguementPassing obj2 = new ArguementPassing();

    System.out.println(obj2.value);

    obj1.methodReference(obj2);
    System.out.println(obj2.value);


    Integer x = new Integer(10);
    Integer y = new Integer(5);

    obj1.swap(x, y);

    System.out.println(x + " " + y);

    int a = 10, b = 5;
    a = swapValues(b, b = a);
    System.out.println(a + " " + b);
  }
}
