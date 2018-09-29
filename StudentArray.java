public class StudentArray {
  int roll;
  StudentArray(int roll) {
    this.roll = roll;
  } 
  void display() {
    System.out.println(roll);
  }
  public static void main(String args[]) {
    StudentArray[] arr = new StudentArray[10];
    for(int i = 0; i < 10; i++) {
      arr[i] = new StudentArray(i);
      arr[i].display();
    }
  }
}


