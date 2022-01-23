package nagarro;

/**
 * Created by Prasada Rao on 20/10/21 5:11 PM
 *
 * <a href="https://www.geeksforgeeks.org/count-possible-decodings-given-digit-sequence/">Count Possible Decodings of a given Digit Sequence</a>
 * <p>
 * Let 1 represent ‘A’, 2 represents ‘B’, etc. Given a digit sequence,
 * count the number of possible decodings of the given digit sequence.
 * <p>
 * Input:  digits[] = "121"
 * Output: 3
 * // The possible decodings are "ABA", "AU", "LA"
 * <p>
 * Input: digits[] = "1234"
 * Output: 3
 * // The possible decodings are "ABCD", "LCD", "AWD"
 * <p>
 * An empty digit sequence is considered to have one decoding. It may
 * be assumed that the input contains valid digits from 0 to 9 and
 * there are no leading 0’s, no extra trailing 0’s, and no two or more
 * consecutive 0’s.
 **/
public class CountPossibleDecoding {

    private static int countDecoding(String number) {
        return countDecoding1(number.toCharArray(), number.length());
    }

    private static int countDecoding(char[] digits, int n) {
        if (n == 0 || n == 1) return 1;

        int[] count = new int[n + 1];
        count[0] = 1;
        count[1] = 1;

        for (int i = 2; i <= n; i++) {
            if (digits[i - 1] > '0') {
                count[i] = count[i - 1];
            }
            if (digits[i - 2] == '1' || (digits[i - 2] == '2' && digits[i - 1] < '7')) {
                count[i] += count[i - 2];
            }
        }
        return count[n];
    }

    private static int countDecoding1(char[] digits, int n) {
        if (n == 0 || n == 1) return 1;

        int count = 0;
        if (digits[n - 1] > '0') {
            System.out.println("digits[n - 1] > '0' " + n);
            count = countDecoding1(digits, n - 1);
        }
        if (digits[n - 2] == '1' || (digits[n - 2] == '2' && digits[n - 1] < '7')) {
            System.out.println("10 + >  " + n);
            count += countDecoding1(digits, n - 2);
        }
        return count;
    }

    public static void main(String[] args) {
//        System.out.println(countDecoding("121"));
        System.out.println(countDecoding("1234"));
    }
}
