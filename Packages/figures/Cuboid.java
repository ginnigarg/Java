package figures;

public class Cuboid extends Rect {

    double depth;

    Cuboid(double length, double width, double depth) {

        super(length, width);
        this.depth = depth;
    }

    void volume() {

        System.out.println("Volume is " + depth * height * width);
    }
}
