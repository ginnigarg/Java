public class Box {

  double height, length, width;
  
  Box(double length, double width, double height) {
    this.length = length;
    this.height = height;
    this.width = width;
  }
  
  Box(double value) {
    length = width = height = value;
  }

  double volume() {
    return height * width * length;
  }

  void display() {
    System.out.println("length : "+ length +" breadth : "+ width +" height : "+ height);
  }

  public static void main(String args[]) {
    Box box1 = new Box(10, 20, 30);
    Box box2 = new Box(10);
    box1.display();
    box2.display();
  }
}
