package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prasada Rao on 15/11/21 6:23 PM
 *
 * <a href="https://leetcode.com/problems/largest-divisible-subset/">368. Largest Divisible Subset</a>
 **/
public class LargestDivisibleSubset {
    public List<Integer> largestDivisibleSubset(int[] numbers) {
        final List<Integer> answer = new ArrayList<>();
        first: for (int i = 0; i < numbers.length; i++) {

            if (answer.isEmpty()) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] % numbers[j] != 0 && numbers[j] % numbers[i] != 0) {
                        break;
                    }
                    answer.add(numbers[i]);
                }
            } else {
                int length = answer.size();
                for (int j = 0; j < length; j++) {
                    if (numbers[i] % answer.get(j) != 0 && answer.get(j) % numbers[i] != 0) {
                        continue first;
                    }
                    answer.add(numbers[i]);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new LargestDivisibleSubset().largestDivisibleSubset(new int[]{1, 2, 3}));
    }
}
