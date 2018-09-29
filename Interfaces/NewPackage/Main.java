package NewPackage;

public class Main {

    public static void main(String args[]) {
        Shape t = new Triangle(10, 20);
        Shape r = new Rectangle(10, 20);
        System.out.println("Area of triangle  : " + t.getArea());
        System.out.println("Perimeter of triangle  : " + t.getPerimeter());
        t.getColor();
        System.out.println("Area of rectangle  : " + r.getArea());
        System.out.println("Perimeter of rectangle  : " + r.getPerimeter());       
        r.getColor();

    }



}
