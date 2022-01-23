package nagarro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Prasada Rao on 17/10/21 2:27 PM
 **/
public class Permutations {

    private static void permutation(String s, String prefix) {

        if (s.isEmpty()) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            String reminder = s.substring(0, i) + s.substring(i + 1);
            permutation(reminder, prefix + s.charAt(i));
        }
    }

    private static void permute(int[] array, int k, List<List<Integer>> result) {

        for (int i = k; i < array.length; i++) {
            swap(array, i, k);
            permute(array, k + 1, result);
            swap(array, k, i);
        }

        if (k == array.length - 1) {
            ArrayList<Integer> permutation = new ArrayList<>();
            for (int i : array) {
                permutation.add(i);
            }
            result.add(permutation);
            System.out.println(Arrays.toString(array));
        }

    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        permutation("abc", "");

        ArrayList<List<Integer>> result = new ArrayList<>();
        permute(new int[]{1, 2, 3}, 0, result);

        System.out.println(result);

    }
}
