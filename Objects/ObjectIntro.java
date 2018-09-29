public class ObjectIntro {

  private Object ob;

  ObjectIntro(Object obj) {
    this.ob = obj;
  }

  private Object getData() {
    return ob;
  }

  private void printType() {
    System.out.println(ob.getClass().getSimpleName());
  }

  public static void main(String args[]) {
    ObjectIntro t1 = new ObjectIntro(12);
    ObjectIntro t2 = new ObjectIntro(42.23);
    ObjectIntro t3 = new ObjectIntro("Hello");
    t1.printType();
    t2.printType();
    t3.printType();
  }

}
