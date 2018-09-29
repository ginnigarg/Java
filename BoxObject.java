public class BoxObject {

  public static void main(String args[]) {
    Box box1 = new Box(10, 20, 30);
    Box box2 = new Box(10);
    box1.display();
    System.out.println("Volume of Box1 : "+ box1.volume());
    box2.display();
    System.out.println("Volume of Box2 : "+ box2.volume());
  }
}
