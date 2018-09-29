import java.util.*;
import java.io.*;

public class ArraysCopy {
  
  static void printLength(int[] arr) {
    System.out.println("Length : " + arr.length);
  }
 
  static void printArray(int[] arr) {
    for(int i : arr) {
      System.out.println(i);
    }
    System.out.println();
  }

  public static void main(String args[]) {
    int[] arr = new int[]{5, 4, 3, 2 ,1};
    printLength(arr);
    System.out.println();

    Arrays.sort(arr, 2, 5);
    printArray(arr);

    Arrays.sort(arr);
    printArray(arr);
 
    System.out.println(Arrays.binarySearch(arr, 1));
    System.out.println();

    int[] arr2 = new int[5];
    arr2 = Arrays.copyOfRange(arr, 1, 4);
    printArray(arr2);
 
    int[] arr3 = new int[5];
    arr3 = Arrays.copyOf(arr, arr.length);   
    printArray(arr3); 

    String str = Arrays.toString(arr);
    System.out.println(str);
    
  }




}
