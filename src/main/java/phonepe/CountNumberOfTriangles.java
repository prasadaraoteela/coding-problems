package phonepe;

import java.util.Arrays;

/**
 * Created by Prasada Rao on 15/11/21 3:18 PM
 *
 * <a heref="https://www.geeksforgeeks.org/find-number-of-triangles-possible/">Count the number of possible triangles</a>
 **/
public class CountNumberOfTriangles {
    static int findNumberOfTriangles(int arr[], int n) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = n - 1; i >= 1; i--) {
            int l = 0, r = i - 1;
            while (l < r) {
                if (arr[l] + arr[r] > arr[i]) {
                    count += r - l;
                    r--;
                } else {
                    l++;
                }
            }
        }
        return count;
    }

    static int findNumberOfTriangles1(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] > arr[k] && arr[i] + arr[k] > arr[j] && arr[j] + arr[k] > arr[i]) {
                        count++;
                        System.out.println(arr[i] + ", " + arr[j] + ", " + arr[k]);
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findNumberOfTriangles(new int[]{4, 6, 3, 7}, 4));
    }
}
