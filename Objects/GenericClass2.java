public class GenericClass2<T, V> {

    T val1;
    V val2;

    GenericClass2(T val1, V val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    T getData1() {
        return val1;
    }

    V getData2() {
        return val2;
    }

    void printType() {
        System.out.println(val1.getClass().getSimpleName());
        System.out.println(val2.getClass().getSimpleName());
    }

    public static void main(String args[]) {
        GenericClass2<Integer, Character> temp1 = new GenericClass2<>(10, 'c');
        GenericClass2<String, Double> temp2 = new GenericClass2<>("Hello Guys", 12.12);

        temp1.printType();
        temp2.printType();

        int integer = temp1.getData1();
        char character = temp1.getData2();
        String string = temp2.getData1();
        double doub = temp2.getData2(); 

        System.out.println(integer + " " + character + " " +  string + " " + doub);
    }

}
