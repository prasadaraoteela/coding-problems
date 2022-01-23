package easy;

/**
 * Created by Prasada Rao on 24/10/21 6:07 PM
 *
 * <a href="https://leetcode.com/problems/binary-search/">704. Binary Search</a>
 **/
public class BinarySearch {

    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        return search(nums, 0, nums.length - 1, target);
    }

    private int search(int[] nums, int start, int end, int target) {
        if (target > nums[end] || target < nums[start]) return -1;

        int middle = (start + end) / 2;
        if (nums[middle] == target) return middle;

        if (target < nums[middle]) {
            end = middle;
        } else {
            start = middle + 1;
        }
        return search(nums, start, end, target);
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println(binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }
}
