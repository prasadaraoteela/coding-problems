package nagarro;

/**
 * Created by Prasada Rao on 18/10/21 11:23 AM
 **/
public class GCD {

    private static int gcd(int a, int b) {
        if (a == 0) return b;

        return gcd(b % a, a);
    }

    private static int gcd(int[] array) {
        if (array.length == 0) return 0;

        int gcd = array[0];
        for (int i = 1; i < array.length; i++) {
            gcd = gcd(gcd, array[i]);
        }
        return gcd;
    }

    public static void main(String[] args) {
        System.out.printf("GCD of %d and %d is: %d%n", 10, 15, gcd(10, 15));
        System.out.printf("GCD of {2, 4, 6, 8, 16} is: %d%n", gcd(new int[]{2, 4, 6, 8, 16}));
        System.out.printf("GCD of {1, 2, 3} is: %d%n", gcd(new int[]{1, 2, 3}));
        System.out.printf("GCD of {2, 4, 6, 8} is: %d%n", gcd(new int[]{2, 4, 6, 8}));
    }
}
