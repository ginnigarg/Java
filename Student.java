public class Student {

  String name;
  int age;

  Student() {}

  Student(String name, int age) {
    this.name = name;
    this.age = age; 
  }

  void display() {
    System.out.println(name + "\n" + age);    
  }

  public static void main(String args[]) {
    Student stud1 = new Student(args[0], Integer.parseInt(args[1]));
    stud1.display();
    Student stud2 = new Student();
    stud2.name = "Ayush";
    stud2.age = 0;
    stud2.display();
  }
}
