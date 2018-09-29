package fig;

public class Cuboid extends Rectangle{

     int depth;

     Cuboid(int length, int breadth, int depth) {
         super(length, breadth);
         this.depth = depth;
     }

     int area() {
         return super.area() * depth;
     }

}
