package nagarro;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Prasada Rao on 18/10/21 11:53 AM
 **/
public class MaximumOccurringCharacter {

    private static char findMaxOccurringChar(String string) {
        final int[] freq = new int[26];

        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            if (character != ' ') {
                freq[character - 'a']++;
            }
        }
        int max = 0;
        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            if (max < freq[i]) {
                max = freq[i];
                index = i;
            }
        }
        return (char) (index + 'a');
    }

    private static char findMaxOccurringChar1(String string) {
        char[] chars = string.toCharArray();

        final Map<Character, Integer> characterCountMap = new HashMap<>();
        for (char aChar : chars) {
            characterCountMap.put(aChar, characterCountMap.getOrDefault(aChar, 0) + 1);
        }

        char result = ' ';
        int max = 0;
        for (Character character : characterCountMap.keySet()) {
            Integer count = characterCountMap.get(character);
            if (max == count) {
                if (character < result) {
                    result = character;
                }
            } else if (count > max) {
                max = count;
                result = character;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findMaxOccurringChar("test sample"));
        System.out.println(findMaxOccurringChar("sample program"));
    }
}
