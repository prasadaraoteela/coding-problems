package nagarro;

/**
 * Created by Prasada Rao on 19/10/21 5:50 PM
 * <p>
 * You write a love letter to your friend. However, before your friend can read it,
 * someone else takes it and rotates the characters of each word left to right k times.
 * Find the number of words that remain the same even after this shifting of letters.
 * <p>
 * Input1: llohe ereth (string of words)
 * Input2: 2            (k,number of times rotation happens)
 * Output: 0
 **/
public class LoveLetter {

    private static int solution(String message, int k) {
        int count = 0;
        String[] words = message.split(" ");

        for (String rotatedWord : words) {
            String original = leftShift(rotatedWord, k);
            if (rotatedWord.equals(original)) {
                count++;
            }
        }
        return count;
    }

    private static String leftShift(String str, int k) {
        if (str.isEmpty()) return str;

        return str.substring(k) + str.substring(0, k);
    }

    public static void main(String[] args) {
        System.out.println(solution("llohe ereth", 2)); // 0
        System.out.println(solution("adaada", 3)); // 1
        System.out.println(solution("loHel endFri", 3)); // 0
        System.out.println(solution("Hello dFrien", 5)); // 1
    }
}
