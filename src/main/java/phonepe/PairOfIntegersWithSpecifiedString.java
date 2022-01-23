package phonepe;

/**
 * Created by Prasada Rao on 15/11/21 4:50 PM
 **/
public class PairOfIntegersWithSpecifiedString {

    static int findNumberOfWaysToObtainX(int[] numbers, String x) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && x.equals(numbers[i] + String.valueOf(numbers[j]))) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findNumberOfWaysToObtainX(new int[]{1, 212, 12, 12}, "1212"));
    }
}
