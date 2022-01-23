package nagarro;

/**
 * Created by Prasada Rao on 20/10/21 5:08 PM
 *
 * <a href="https://www.geeksforgeeks.org/find-second-largest-element-array/#">Find Second largest element in an array</a>
 * <p>
 * Given an array of integers, our task is to write a program
 * that efficiently finds the second-largest element present
 * in the array.
 * <p>
 * Input: arr[] = {12, 35, 1, 10, 34, 1}
 * Output: The second largest element is 34.
 * Explanation: The largest element of the
 * array is 35 and the second
 * largest element is 34
 **/
public class SecondLargestNumber {

    private static int solution(int[] nums) {

        int max = -1;
        int secondMax = -1;

        for (int num : nums) {

            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num != max && num > secondMax) {
                secondMax = num;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 2}));
        System.out.println(solution(new int[]{2, 2, 2}));
        System.out.println(solution(new int[]{3, 4, 5}));
    }
}
