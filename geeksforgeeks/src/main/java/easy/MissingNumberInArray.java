package easy;

/**
 * Created by Prasada Rao on 25/10/21 12:30 PM
 *
 * <a href="https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1#">Missing number in array</a>
 **/
public class MissingNumberInArray {

    int MissingNumber(int array[], int n) {
        int actualSum = 0;
        for (int number : array) {
            actualSum += number;
        }
        int expectedSum = n * (n + 1) / 2;
        return expectedSum - actualSum;
    }

    int MissingNumber1(int array[], int n) {
        // Your Code Here
        int[] choice = new int[n + 1];
        for (int number : array) {
            choice[number] = 1;
        }
        int answer = -1;
        for (int i = 1; i <= n; i++) {
            if (choice[i] == 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new MissingNumberInArray().MissingNumber(new int[]{1, 2, 3, 5}, 5));
        System.out.println(new MissingNumberInArray().MissingNumber(new int[]{6, 1, 2, 8, 3, 4, 7, 10, 5}, 10));
    }
}
