package easy;

/**
 * Created by Prasada Rao on 20/10/21 5:52 PM
 *
 * <a href="https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/">1464. Maximum Product of Two Elements in an Array</a>
 **/
public class MaxProductOfTwoElements {

    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }

        return (max - 1) * (secondMax - 1);
    }
}
