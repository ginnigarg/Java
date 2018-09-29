public class ShapesOne {
  private double radius, height;

  ShapesOne() {
    radius = height = 0;
  }

  ShapesOne(double radius) {
    this.radius = radius;
    height = radius;
  }

  ShapesOne(double radius, double height) {
    this.radius = radius;
    this.height = height;
  }

  double volCone() {
    return (1.0 / 3) * (3.14) * (radius * radius * height);
  }

  double volSphere() {
    return 4  * volCone();
  }

  public static void main(String args[]) {
    ShapesOne cone = new ShapesOne(10, 20);
    ShapesOne sphere = new ShapesOne(10);
    System.out.println(cone.volCone());
    System.out.println(sphere.volSphere());
  }
}

