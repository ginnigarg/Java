import java.util.*;
import java.io.*;

public class MultiDimensionalArrays {
  
  static void printLength(int[][] arr) {
    System.out.println("Length : " + arr.length);
  }
 
  static void printArray(int[][] arr) {
    for(int[] i : arr) {
      for(int j : i) {
        System.out.println(j);
      }
      System.out.println();
    }
    System.out.println();
  }

  public static void main(String args[]) {
    int[][] arr = new int[][]{{5, 4, 3, 2 ,1}, {2, 1}};
    printLength(arr);
    System.out.println();

    Arrays.sort(arr[0], 2, 5);
    printArray(arr);

    Arrays.sort(arr[1]);
    printArray(arr); 

    int[][] arr2 = Arrays.copyOfRange(arr, 0, 1);
    printArray(arr2);
 
    int[][] arr3 = Arrays.copyOf(arr, arr.length);   
    printArray(arr3); 

    
  }




}
