public class GenericClass<T> {

    T val;

    GenericClass(T val) {
        this.val = val;
    }

    T getData() {
        return val;
    }

    void printType() {
        System.out.println(val.getClass().getSimpleName());
    }

    public static void main(String args[]) {
        GenericClass<Integer> temp1 = new GenericClass<>(10);
        GenericClass<String> temp2 = new GenericClass<>("Hello Guys");
        temp1.printType();
        temp2.printType();
        int integer = temp1.getData();
        String string = temp2.getData(); 
        System.out.println(integer + " " + string);
    }

}
