package nagarro;

/**
 * Created by Prasada Rao on 17/10/21 11:57 AM
 **/
public class NthPrimeNumber {

    // Sieve of Eratosthenes
//    private static int findNthPrimeUsingSieveOfEratosthenes(int n) {
//        boolean[] primes = new boolean[n + 1];
//        for (int i = 2; i <= primes.length; i++) {
//            primes[i] = true;
//        }
//
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (primes[i]) {
//                for (int j = 2; i * j <= n; j++) {
//                    primes[i * j] = false;
//                }
//            }
//        }
//
//    }

    private static int findNthPrime(int n) {

        int i = 2;

        while (n > 0) {
            if (isPrimeNumber(i)) {
                n--;
            }
            i++;
        }
        return --i;
    }

    private static boolean isPrimeNumber(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(findNthPrime(i));
        }
    }
}
