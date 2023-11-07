package easy;

import java.util.Arrays;

/**
 * Created by Prasada Rao on 05/10/22 12:30 pm
 **/
public class DuplicateZeros {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(new DuplicateZeros().duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0})));
    System.out.println(Arrays.toString(new DuplicateZeros().duplicateZeros(new int[]{8, 4, 5, 0, 0, 0, 0, 7})));

//    [8,4,5,0,0,0,0,7]
//    [0,1,2,3,4,5,6,7]
    // if arr[i] == 0 check if i < length - possDup;
    // i = 3 ; 3 < 7; possibleDuplicates = 1
    // i = 4 ; 4 < 6; possibleDuplicates = 1
  }

  public int[] duplicateZeros(int[] arr) {
    int possibleDuplicates = 0;
    int lastZeroIndex = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {

        if (i < arr.length - possibleDuplicates - 1) {
          possibleDuplicates++;
          lastZeroIndex = i;
          continue;
        }
        break;
      }
    }

    for (int i = arr.length - 1; i >= possibleDuplicates; i--) {

      if (arr[i - possibleDuplicates] == 0 && i - possibleDuplicates <= lastZeroIndex) {
        arr[i] = 0;
        i--;
        possibleDuplicates--;
        arr[i] = 0;
      } else {
        arr[i] = arr[i - possibleDuplicates];
      }
    }

    return arr;
  }
}
