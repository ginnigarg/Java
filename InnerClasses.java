class Outer {
  static int x1;
  int x2;
  class Inner {
    int y;
    void display() {
      System.out.println(x1 + " " + x2 + " " + y);
    }
  } 
  void print() {
    Inner in = new Inner();
    System.out.println(x1 + " " + x2);
  }
}

class Inner {
  Inner(int x) {

  }

}

public class InnerClasses {
  public static void main(String args[]) {
    Outer o = new Outer();
    o.x1 = 10;
    o.x2 = 100;
    Outer.Inner i = new Outer().new Inner();
//    i.x2 = 100;
    i.y = o.x1 + o.x2;
    o.print();
    i.display();
  }
}
