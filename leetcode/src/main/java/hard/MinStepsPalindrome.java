package hard;

/**
 * Created by Prasada Rao on 18/10/21 3:54 PM
 *
 * <a href="https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/">1312. Minimum Insertion Steps to Make a String Palindrome</a>
 **/
public class MinStepsPalindrome {

    public int minInsertions(String s) {
        if (s.isEmpty()) return 0;

        int n = s.length();

        int[][] result = new int[n + 1][n + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i + 1][j + 1] = s.charAt(i) == s.charAt(n - 1 - j) ? result[i][j] + 1 : Math.max(result[i][j + 1], result[i + 1][j]);
            }
        }

        return n - result[n][n];
    }

    public int minInsertions1(String s) {
        if (s.isEmpty()) return 0;

        int[][] result = new int[s.length()][s.length()];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = -1;
            }
        }
        return minInsertions(s, 0, s.length() - 1, result);
    }

    private int minInsertions(String s, int start, int end, int[][] result) {
        if (start >= end) {
            return result[start][end] = 0;
        }

        if (result[start][end] != -1) return result[start][end];

        if (s.charAt(start) == s.charAt(end)) {
            return result[start][end] = minInsertions(s, start + 1, end - 1, result);
        }
        int left = minInsertions(s, start + 1, end, result) + 1;
        int right = minInsertions(s, start, end - 1, result) + 1;
        return result[start][end] = Math.min(left, right);
    }

    public static void main(String[] args) {
        System.out.println(new MinStepsPalindrome().minInsertions("mbadm"));
        System.out.println(new MinStepsPalindrome().minInsertions("abcba"));
        System.out.println(new MinStepsPalindrome().minInsertions("zzazz"));
        System.out.println(new MinStepsPalindrome().minInsertions("leetcode"));
        System.out.println(new MinStepsPalindrome().minInsertions("g"));
        System.out.println(new MinStepsPalindrome().minInsertions("no"));
        long startTime = System.currentTimeMillis();
        System.out.println(new MinStepsPalindrome().minInsertions("sitzicxzheahuflodgdjyclujmsnzrhrhiycdviotjrtayokfywnvzwteptqxigmbgwhzjavaopsohqasrzeicawuwxtczivqhwduapydrvvhntpseckhabierakbqtzulbaeaczpgftvpalihdcsrymrmcomvpbwysdwqxvjidhnoxyntrfzctlopchpfxewahsvjafcnteemruuxregvvwongcmfnabbcvzxvwumnxqlfbfzldttvxzvtubfxrawdqhdqegezrerhantgmzqcjjwoytgufjpacsxmicydykzqxlsjnzwitetjriyuxuyregxinlkblhjsqghpnwvxqbrgwefkbdbhstxgwxhlkigrifntmeomivtpdwzwinnudfzkoynjkokpqegktacchkvqajiunjlygunbjeyczmtizujprjoqixydmkkfawtwpestqsdwvtieejlfqxdhwgmdphkqccpgfotlakzwyqdpcmtir"));
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
