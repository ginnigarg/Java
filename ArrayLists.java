import java.util.*;

class ArrayLists {

  public static void main(String args[]) {
    ArrayList<Integer> arr1 = new ArrayList<>();
    ArrayList<String> arr2 = new ArrayList<>();

    System.out.println("Size of 1st list : " + arr1.size());
    System.out.println("Size of 2nd list : " + arr2.size());
    System.out.println();

    arr1.add(2);
    arr1.add(0, 5);
    arr1.add(6);
    arr1.add(6);
    //arr1.add(10, 100); Run Time Exception
    
    for(int i: arr1) {
      System.out.println("Element : " + i);
    }
    System.out.println();
   
    System.out.println("Element using get() : " + arr1.get(2));
    System.out.println();

    arr1.set(0, 10);
    System.out.println("Set element at index 0  to 10");
    for(int i: arr1) {
      System.out.println("Element : " + i);
    }
    System.out.println();

    arr1.remove(1);
    System.out.println("Elements After removal of element at index 1 : ");
    for(int i: arr1) {
      System.out.println("Element : " + i);
    }
    System.out.println();

    System.out.println("Does arr1 contain 5 : " + arr1.contains(5));
    System.out.println("Does arr1 contain 10 : " + arr1.contains(10));
    System.out.println();

    System.out.println("Index of 6 : " + arr1.indexOf(6));
    System.out.println("Index of 6 : " + arr1.lastIndexOf(6));
    System.out.println();

    System.out.println(arr1);
    System.out.println();

    System.out.println(arr1.toArray());


  }


}
