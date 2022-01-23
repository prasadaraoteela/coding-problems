package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Prasada Rao on 24/10/21 4:34 PM
 *
 * <a href="https://leetcode.com/problems/merge-intervals/">56. Merge Intervals</a>
 **/
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        List<int[]> answer = new ArrayList<>();

        for (int index = 0; index < intervals.length; index++) {
            if (index + 1 != intervals.length && intervals[index][1] >= intervals[index + 1][0]) {
                intervals[index + 1][0] = intervals[index][0];
                intervals[index + 1][1] = Math.max(intervals[index + 1][1], intervals[index][1]);
            } else {
                answer.add(new int[]{intervals[index][0], intervals[index][1]});
            }
        }
        return answer.toArray(new int[answer.size()][2]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new MergeIntervals().merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})));
        System.out.println(Arrays.deepToString(new MergeIntervals().merge(new int[][]{{1, 4}, {4, 5}})));
        System.out.println(Arrays.deepToString(new MergeIntervals().merge(new int[][]{{1, 4}, {0, 2}, {3, 5}}))); // [[0, 5]]
    }
}
