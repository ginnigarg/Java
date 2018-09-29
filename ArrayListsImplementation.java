import java.util.*;
import java.io.*;

class ArrayListsImplementation {

  public static void main(String args[]) {
    Vector v = new Vector();
//    v.add(1);
//    v.add("Ginni");
//    System.out.println(v);
    System.out.println();

    ArrayList<Integer> arr1 = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    for(int i = 0; i < 10; i++) {
      arr1.add(sc.nextInt());    
    }

    System.out.println("Size of list : " + arr1.size());
    System.out.println();

    for(int i: arr1) {
      System.out.println("Element : " + i);
    }
    System.out.println();

    Collections.reverse(arr1);
    for(int i: arr1) {
      System.out.println("Element : " + i);
    }
    System.out.println();
//    Collections.reverse(arr1);

    for(int i = 0, j = arr1.size() - 1; i < j ; i++, j--) {
      int temp = arr1.get(i);
      arr1.set(i, arr1.get(j));
      arr1.set(j, temp);
    }
    for(int i: arr1) {
      System.out.println("Element : " + i);
    }
    System.out.println();
   
    System.out.println("Enter the element to check : ");
    int check = sc.nextInt();
    System.out.println(check + " is in the list : " + arr1.contains(check));
    System.out.println();

    System.out.println("Element at index 1  : " + arr1.get(1));
    System.out.println();

    System.out.println("Enter the element to be deleted : ");
    check = sc.nextInt();
    while(arr1.contains(check)) {
      arr1.remove(arr1.indexOf(check));
    }
    for(int i: arr1) {
      System.out.println("Element : " + i);
    }
    System.out.println();

    int max  = -999999;
    for(int i: arr1) {
      if(i > max) max = i;
    }
    System.out.println("Maximum element : " + max);
    System.out.println("Maximum element : " + Collections.max(arr1));
    System.out.println();
    arr1.clear();
    System.out.println("New Size after clearing : "+ arr1.size());

    System.out.println(arr1);
    System.out.println();

  }


}
