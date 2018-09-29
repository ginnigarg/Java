package NewPackage;

public interface Shape {

    double getArea();

    double getPerimeter();

    default void getColor() {
        System.out.println("Color : BLue");
    }

}

