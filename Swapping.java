`public class Swapping {

  int value1, value2;
  static int num = 0;
  Swapping(int value1, int value2) {
    num++;
    if(num > 10) {
      this(10, 20);
      Swapping swap = new Swapping(10,20);
    }
    this.value1 = value1;
    this.value2 = value2;
  }

  void swap(Swapping x, Swapping y) {
    Swapping temp;
    temp = x;
    x  = y;
    y = temp;
  }

  void swapping(Swapping x, Swapping y) {
    x.value1 = x.value1 ^ y.value1;
    y.value1 = x.value1 ^ y.value1;
    x.value1 = x.value1 ^ y.value1;

    x.value2 = x.value2 ^ y.value2;
    y.value2 = x.value2 ^ y.value2;
    x.value2 = x.value2 ^ y.value2;
  }

//  void swappingObjects()

  public static void main(String args[]) {
    Swapping obj1 = new Swapping(10, 5);
    Swapping obj2 = new Swapping(5, 10);
    obj1.swapping(obj1, obj2);
    System.out.println(obj1.value1 + " " + obj1.value2);
    System.out.println(obj2.value1 + " " + obj2.value2);
  }
}
