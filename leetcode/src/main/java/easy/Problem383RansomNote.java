package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Prasada Rao on 02/10/22 12:39 pm
 * <p>
 * <a href="https://leetcode.com/problems/ransom-note/">383. Ransom Note</a>
 * <p>
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 * <p>
 * Each letter in magazine can only be used once in ransomNote.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * <p>
 * Example 2:
 * <p>
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * <p>
 * Example 3:
 * <p>
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 * <p>
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= ransomNote.length, magazine.length <= 105
 * ransomNote and magazine consist of lowercase English letters.
 **/
public class Problem383RansomNote {

  public static void main(String[] args) {
    System.out.println(new Problem383RansomNote().canConstruct("aa", "ab"));
  }

  public boolean canConstruct(String ransomNote, String magazine) {

    final Map<Character, Integer> magazineChars = new HashMap<>();

    for (char c : magazine.toCharArray()) {
      magazineChars.put(c, magazineChars.getOrDefault(c, 0) + 1);
    }

    for (char c : ransomNote.toCharArray()) {
      final int currentCount = magazineChars.getOrDefault(c, 0);
      if (currentCount == 0) return false;
      magazineChars.put(c, currentCount - 1);
    }

    return true;
  }
}
