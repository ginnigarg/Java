package shapes;

public class B extends A {

    int b;

    B(int b) {

        super(b);
        this.b = b;
    }

    void display() {

        System.out.println("b is " + b);
    }

}
