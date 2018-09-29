package figures;

public class Rect {

    double height;
    double width;

    Rect(double height, double width) {

        this.height = height;
        this.width = width;
    }

    void area() {

        System.out.println("Area is " + height * width);
    }
}
