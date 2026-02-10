/*
Problem: Find Missing Number in Array
Platform: Self Practice
Assumption:
    Array contains numbers from 1 to n with one number missing
Approach:
    1. Calculate expected sum using formula
    2. Subtract actual array sum
Time Complexity: O(n)
Space Complexity: O(1)
Author: Divyansh Sharma
*/

import java.util.Scanner;

public class Missing_Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array (n-1 numbers): ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements (numbers from 1 to n with one missing):");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Expected sum of numbers from 1 to n
        int expectedSum = (n + 1) * (n + 2) / 2;

        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing Number: " + missingNumber);

        sc.close();
    }
}
