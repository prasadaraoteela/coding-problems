package nagarro;

/**
 * Created by Prasada Rao on 17/10/21 12:56 PM
 **/
public class Factorial {

    static int factorial(int number) {
        if (number <= 1) return number;

        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

}
