class Static1 {
    static int count = 10;
    int x;
    static void increment() {
        count++;
    }

    void print() {
      Static1 obj = new Static1();
      obj.x++;
      System.out.println(obj.x);
    }


public class StaticClasses {
    public static void main(String args[]) {
        System.out.println(Static1.count);
        Static1.increment();
        System.out.println(Static1.count);
        Static1 obj = new Static1();
        obj.print();
    }
}  
