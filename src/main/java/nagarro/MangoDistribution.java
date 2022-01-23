package nagarro;

/**
 * Created by Prasada Rao on 17/10/21 10:59 AM
 * <p>
 * Given a number of mangoes, m and number of persons, n. Find the number
 * of ways to distribute identical mangoes among identical persons.
 **/
public class MangoDistribution {

    private int calculateWays(int m, int n) {
        // Not enough mangoes to be distributed
        if (m < n) {
            return 0;
        }
        return binomialCoefficient(m, n);
    }

    // (m + n - 1) C(n - 1)
    private int binomialCoefficient(int m, int n) {
        int result = 1;

        for (int i = 0; i < n - 1; i++) {

            result = (result * (m + n - 1 - i)) / (i + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new MangoDistribution().calculateWays(2, 2));
        System.out.println(new MangoDistribution().calculateWays(3, 2));
        System.out.println(new MangoDistribution().calculateWays(13, 6));
        System.out.println(new MangoDistribution().calculateWays(11, 3));
    }
}
