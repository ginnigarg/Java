package NewPackage;

public class Rectangle implements Shape {

    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return (length * breadth);
    }
 
    public double getPerimeter() {
        return 2 * (length + breadth);
    }

} 
