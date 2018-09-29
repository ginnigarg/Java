public class ShapesTwo {

  private int length, breadth;

  ShapesTwo() {
    length = breadth = 0;
  }

  ShapesTwo(int s) {
    length = breadth = s;
  }

  ShapesTwo(int l, int b) {
    length = l;
    breadth = b;
  }

  void getDim() {
    if(length == breadth) {
      System.out.println("Sides of square : " + length);
      return;
    }
    System.out.println("Length : " + length + " Breadth : " + breadth);
  }

  int area() {
    return length * breadth;
  }

  int perimeter() {
    return 2 * (length + breadth);
  }

  public static void main(String args[]) {
    ShapesTwo square = new ShapesTwo(10);
    ShapesTwo rectangle = new ShapesTwo(10, 20);
    square.getDim();
    System.out.println("Area : " + square.area());
    System.out.println("Rectangle : " + square.perimeter());
    rectangle.getDim();
    System.out.println("Area : " + rectangle.area());
    System.out.println("Perimter : " + rectangle.perimeter());

  }





}
