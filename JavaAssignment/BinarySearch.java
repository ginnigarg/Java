public class BinarySearch {

  static int binarySearch(int[] arr, int start, int end, int num) {
    if(start > end) return -1;
    int mid = (start + end) / 2;
    if(arr[mid] == num) return mid;
    if(arr[mid] > num) return binarySearch(arr, start, mid - 1, num);
    else return binarySearch(arr, mid + 1, end, num); 
  }

  public static void main(String args[]) {
    int[] arr = {1, 3, 5, 7, 9, 10};
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    System.out.println("1 : " +  binarySearch(arr, 0, 5, 1));
    System.out.println("10 : " + binarySearch(arr, 0, 5, 10));
    System.out.println("0 : " + binarySearch(arr, 0, 5, 0));
    System.out.println("5 : " + binarySearch(arr, 0, 5, 5));
    System.out.println("6 : " + binarySearch(arr, 0, 5, 6));

  }



}
