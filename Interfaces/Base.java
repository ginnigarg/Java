package Interfaces;

interface Interface1 {
    default void getName() {
        System.out.println("interface1");
    }

}

interface Interface2 {
    default void getName() {
        System.out.println("interface2");
    }
}


class Parent {
    void getName() {
        System.out.println("parent");
    }

}


public class Base  implements Interface1 {

    public static void main(String args[]) {
        Base base = new Base();
        base.getName();
    }


} 


