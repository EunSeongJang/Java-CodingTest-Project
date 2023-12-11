public class TwoSum {
  public static void main(String[] args) {
    int[] arr = { 2, 7, 11, 15 };
    int num = 9;

    loop1: for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (arr[i] != arr[j] && arr[i] + arr[j] == num) {
          System.out.println(i + "," + j);
          break loop1;
        }
      }
    }
  }
}
