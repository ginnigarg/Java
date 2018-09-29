public class FinalClass {
  final int VAL_1;
  final int VAL_2 = 10;
  final StringBuilder sb = new StringBuilder();
  FinalClass() {
    sb.append("Hi");
    VAL_1 = 20;
  }
  void appendString() {
    sb.append("3");
}
  
  public static void main(String args[]) {
    FinalClass obj = new FinalClass();
    System.out.println(obj.VAL_1);
    System.out.println(obj.VAL_2);
    System.out.println(obj.sb);
    obj.appendString();
    System.out.println(obj.sb);

}
  





}
