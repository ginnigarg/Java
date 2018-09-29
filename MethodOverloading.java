public class MethodOverloading {
  
  static void print(String a) {
    System.out.println("String : " + a);
  }

  static void print(String a, String b) {
    System.out.println("Strings : " + a + " " + b);
  }

  static void print(int a) {
    System.out.println("Int : " + a);
  }

  static void print(int a, double b) {
    System.out.println("Int : " + a + " Double : " + b);
  }
/*
  static void print(double a, int b) {   
    System.out.println("Double : " + a + " Int : " + b);
  }
*/
  static void print(int a, int ...v) {
    System.out.println("Int : " + a + " varage : " + v.length);
  }

/*  static void print(int a, int b) {
    System.out.println("Int : " + a + " Int : " + b);
  }*/

  public static void main(String args[]) {
    print("Guneet");
    print("Guneet", "Ayush");
    print(1);
    print(1, 2.0);
//    print(2.0, 1); 
    print(2, 4);

  }




}
