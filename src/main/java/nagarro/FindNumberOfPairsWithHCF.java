package nagarro;

/**
 * Created by Prasada Rao on 20/10/21 5:17 PM
 **/
public class FindNumberOfPairsWithHCF {

    private static int numberOfPairs(int n) {
        if (n == 0 || n == 1) return 0;

        int answer = 3;

        return answer;
    }

    private static int numberOfPairs1(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (hcf(i, j) == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int hcf(int a, int b) {
        return a == 0 ? b : hcf(b % a, a);

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(numberOfPairs(i) + " : " + numberOfPairs1(i));
        }
    }
}
