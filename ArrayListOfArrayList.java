import java.util.*;

public class ArrayListOfArrayList {
  public static void main(String args[]) {
    ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    ArrayList<Integer> list3 = new ArrayList<>();
    for(int i = 0; i < 5; i++) {
      list1.add(i + 1);
    }
    for(int i = 0; i < 3; i++) {
      list2.add((i + 1) * 10);
    }
    for(int i = 0; i < 2; i++) {
      list3.add((i + 5) * 60);
    }
    arr.add(list1);
    arr.add(list2);
    arr.add(list3);
    
    for(ArrayList<Integer> temp : arr) {
      for(int i: temp) {
        System.out.println(i);
      }
      System.out.println();
    }

    System.out.println(arr.size()); 
    System.out.println();   
    for(ArrayList<Integer> temp : arr) {
      System.out.println(temp.size());
    }
    System.out.println();

    arr.get(2).set(1, 400);
    for(ArrayList<Integer> temp : arr) {
      for(int i: temp) {
        System.out.println(i);
      }
      System.out.println();
    }

    int max = -99999;
    for(ArrayList<Integer> temp : arr) {
      for(int i: temp) {
        if(i > max) max = i;
      }
    }
    System.out.println("max : " + max);



  }  

}
