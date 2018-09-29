package fig;

public class Rectangle {

     int length, breadth;

     Rectangle(int length, int breadth) {
         this.length = length;
         this.breadth = breadth;
     }

     int area() {
         return length * breadth;
     }

}
