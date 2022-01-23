/**
 * Created by Prasada Rao on 18/10/21 2:34 PM
 *
 * <a href="https://www.hackerrank.com/challenges/the-love-letter-mystery/problem">The Love-Letter Mystery</a>
 **/
public class TheLoveLetterMystery {


    /**
     * Complete the 'theLoveLetterMystery' function below.
     * <p>
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
    public static int theLoveLetterMystery(String s) {

        int numberOfSteps = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            char start = s.charAt(i);
            char end = s.charAt(s.length() - 1 - i);

            if (start > end) {
                numberOfSteps += start - end;
            } else {
                numberOfSteps += end - start;
            }
        }

        return numberOfSteps;
    }

    public static void main(String[] args) {
        System.out.println(theLoveLetterMystery("cde"));
        System.out.println(theLoveLetterMystery("abc"));
        System.out.println(theLoveLetterMystery("love"));
        System.out.println(theLoveLetterMystery("aaa"));
    }
}
