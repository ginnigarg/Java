class Outer {
  static int x1;
  int x2;
  static class Inner {
    int y;
    void display() {
      System.out.println(x1 + " " + y);
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

public class StaticInnerClasses {
  public static void main(String args[]) {
    Outer[] objs = new Outer[10];
    int ix;
    System.out.println(ix);
    for(int it = 0; it < 10; it++) {
      objs[it] = new Outer();
    }
    Outer o = new Outer();
    o.x1 = 10;
    o.x2 = 100;
    Outer.Inner i = new Outer.Inner();
    i.y = o.x1 + o.x2;
    o.print();
    i.display();
  }
}
