package nagarro;

/**
 * Created by Prasada Rao on 18/10/21 11:15 AM
 **/
public class Derangement {

    private static int numberOfDerangement(int n) {
        if (n <= 1) return 0;
        if (n == 2) return 1;

        return (n - 1) * (numberOfDerangement(n - 1) + numberOfDerangement(n - 2));
    }

    public static void main(String[] args) {
        System.out.println(numberOfDerangement(1));
        System.out.println(numberOfDerangement(2));
        System.out.println(numberOfDerangement(3));
        System.out.println(numberOfDerangement(4));
    }
}
