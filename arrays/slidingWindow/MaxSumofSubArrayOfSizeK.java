package slidingWindow;

import java.util.Arrays;

public class MaxSumofSubArrayOfSizeK {

    public static int maxSum(int arr[], int k){
        int n = arr.length;
        if (n < k) {
            throw new IllegalArgumentException("Array length must be >= k");
        }
        // Case 1: Window size is 1 → just return the max element
        if (k == 1) {
            return Arrays.stream(arr).max().getAsInt(); 
        }
        // Case 2: Window size equals the entire array → return sum of all elements
        if (k == n) {
            int total = 0;
            for (int num : arr) total += num;
            return total;
        }
        // General case: Sliding Window
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int max = sum;
        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k];
            max = Math.max(max, sum);
        }

        return max;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,1,3,2};
        int k = 3;

        int arr2[]={100,200,300,400};
        int k2 = 4;

        int arr3[]={100,200,300,400};
        int k3 = 1;

        System.out.println(maxSum(arr, k));
    }
}
