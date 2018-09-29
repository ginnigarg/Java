class Student {

  String name;
  int age;

  Student() {
    //name = "No-Name";
    //age = 0;
    this("No-Name", 10);
  }

  Student(String name, int age) {
    this.name = name;
    this.age = age; 
  //  this();
  }

  void display() {
//    this();
    System.out.println("Name : "+ name + "; Age : " + age + ";");    
  }

  void set(String name, int age) {
    this.name = name;
    this.age = age;
  }  
}

public class Example {

  public static void main(String args[]) {
    Student stud = new Student();
    stud.display();
    Student stud1 = new Student("Guneet", 20);
    stud1.display();
    Student stud2 = new Student();
    stud2.set("Ayush", 10);
    stud2.display();
  }
}
