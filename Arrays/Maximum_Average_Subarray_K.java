/*
Problem: Maximum Average Subarray of Size K
Platform: Self Practice
Approach:
    1. Calculate sum of first window of size k
    2. Slide window and update sum
    3. Track maximum sum and calculate average
Time Complexity: O(n)
Space Complexity: O(1)
Author: Divyansh Sharma
*/

import java.util.Scanner;

public class Maximum_Average_Subarray_K {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter window size (k): ");
        int k = sc.nextInt();

        if (k > n || k <= 0) {
            System.out.println("Invalid window size.");
            sc.close();
            return;
        }

        int sum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;

        // Sliding window
        for (int i = k; i < n; i++) {
            sum = sum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, sum);
        }

        double maxAverage = (double) maxSum / k;

        System.out.println("Maximum Average: " + maxAverage);

        sc.close();
    }
}
