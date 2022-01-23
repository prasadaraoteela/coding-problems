package medium;

import java.util.Arrays;

/**
 * Created by Prasada Rao on 15/11/21 5:00 PM
 *
 * <a href="https://leetcode.com/problems/frequency-of-the-most-frequent-element/">1838. Frequency of the Most Frequent Element</a>
 **/
public class FrequencyOfMostFrequentElement {

    public int maxFrequency(int[] numbers, int k) {
        int max = 1;
        Arrays.sort(numbers);
        for (int i = numbers.length - 1; i >= 0; i--) {
            int frequency = 1;
            int rem = k;
            for (int j = i - 1; j >= 0; j--) {
                if (rem <= 0) return Math.max(frequency, max);
                if (numbers[j] == numbers[i]) {
                    frequency++;
                    continue;
                }
                if (numbers[j] + k >= numbers[i]) {
                    rem = k - numbers[j];
                    frequency++;
                    continue;
                }
                return Math.max(frequency, max);
            }
            max = Math.max(max, frequency);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new FrequencyOfMostFrequentElement().maxFrequency(new int[]{1, 2, 4}, 5));
        System.out.println(new FrequencyOfMostFrequentElement().maxFrequency(new int[]{1, 4, 8, 13}, 5));
        System.out.println(new FrequencyOfMostFrequentElement().maxFrequency(new int[]{3, 9, 6}, 2));
    }
}
