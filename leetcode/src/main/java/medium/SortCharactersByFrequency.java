package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Prasada Rao on 25/10/21 10:18 AM
 *
 * <a href="https://leetcode.com/problems/sort-characters-by-frequency/">451. Sort Characters By Frequency</a>
 **/
public class SortCharactersByFrequency {

    public String frequencySort(String s) {
        Character[] chars = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        final Map<Character, Integer> map = new HashMap<>();

        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        Arrays.sort(chars, (c1, c2) -> {
            int v2 = map.get(c2);
            int v1 = map.get(c1);
            if (v2 == v1) return Integer.compare((int) c1, (int) c2);
            return Integer.compare(map.get(c2), map.get(c1));
        });

        StringBuilder sb = new StringBuilder();
        for (Character c : chars) {
            sb.append(c.charValue());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new SortCharactersByFrequency().frequencySort("tree"));
        System.out.println(new SortCharactersByFrequency().frequencySort("cccaaa"));
        System.out.println(new SortCharactersByFrequency().frequencySort("Aabb"));
        System.out.println(new SortCharactersByFrequency().frequencySort("loveleetcode"));
    }
}
