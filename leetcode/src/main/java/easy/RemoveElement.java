package easy;

/**
 * Created by Prasada Rao on 24/10/21 5:19 PM
 *
 * <a href="https://leetcode.com/problems/remove-element/">27. Remove Element</a>
 **/
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int unique = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[unique] = nums[i];
                unique++;
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveElement().removeElement(new int[]{3, 2, 2, 3}, 3));
        System.out.println(new RemoveElement().removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
        System.out.println(new RemoveElement().removeElement(new int[]{1}, 1));
        System.out.println(new RemoveElement().removeElement(new int[]{3, 3}, 3));
        System.out.println(new RemoveElement().removeElement(new int[]{4, 5}, 4));
        // {1} -> 0
        // {3, 3} -> 0
    }
}
