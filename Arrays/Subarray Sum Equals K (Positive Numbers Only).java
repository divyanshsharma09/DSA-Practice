/*
Problem: Subarray Sum Equals K (Positive Numbers Only)
Approach:
    Expand window by adding right pointer
    Shrink window when sum > k
Time Complexity: O(n)
Space Complexity: O(1)
Author: Divyansh Sharma
*/

import java.util.Scanner;

public class Subarray_Sum_Equals_K_Positive {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int left = 0;
        int sum = 0;
        boolean found = false;

        for (int right = 0; right < n; right++) {

            sum += arr[right];

            while (sum > k && left <= right) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                System.out.println("Subarray found:");

                for (int i = left; i <= right; i++) {
                    System.out.print(arr[i] + " ");
                }

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Subarray not found");
        }

        sc.close();
    }
}
