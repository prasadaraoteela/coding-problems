package easy;

import java.util.Arrays;

/**
 * Created by Prasada Rao on 06/10/22 10:22 am
 **/
public class DuplicateZerosWithExtraArray {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(new DuplicateZerosWithExtraArray().duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0})));
  }

  public int[] duplicateZeros(int[] arr) {

    final int[] destination = new int[arr.length + countOfZeros(arr)];

    for (int s = 0, d = 0; s < arr.length; s++, d++) {
      destination[d] = arr[s];
      if (arr[s] == 0) {
        d++;
      }
    }

    return Arrays.copyOfRange(destination, 0, arr.length);
  }

  private int countOfZeros(int[] arr) {
    int count = 0;

    for (int num : arr) {
      if (num == 0) {
        count++;
      }
    }
    return count;
  }
}
