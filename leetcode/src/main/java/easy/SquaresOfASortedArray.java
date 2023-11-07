package easy;

import java.util.Arrays;

/**
 * Created by Prasada Rao on 05/10/22 12:25 pm
 **/
public class SquaresOfASortedArray {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(new SquaresOfASortedArray().sortedSquares(new int[]{-4, -1, 0, 3, 10})));
  }

  public int[] sortedSquares(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      nums[i] = Math.abs(nums[i] * nums[i]);
    }
    Arrays.sort(nums);
    return nums;
  }
}
