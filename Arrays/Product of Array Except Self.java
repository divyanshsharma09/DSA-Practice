/*
Problem: Product of Array Except Self
Platform: Self Practice / LeetCode 238
Approach:
    1. Build prefix product array
    2. Traverse from right and multiply suffix product
Time Complexity: O(n)
Space Complexity: O(1) (excluding output array)
Author: Divyansh Sharma
*/

import java.util.Scanner;
import java.util.Arrays;

public class Product_Of_Array_Except_Self {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = new int[n];

        // Step 1: Prefix products
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Suffix products
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix *= nums[i];
        }

        System.out.println(Arrays.toString(result));

        sc.close();
    }
}
