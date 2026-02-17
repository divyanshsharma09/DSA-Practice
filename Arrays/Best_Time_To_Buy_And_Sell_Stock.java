/*
Problem: Best Time to Buy and Sell Stock (Single Transaction)
Platform: Self Practice
Approach:
    1. Track minimum buying price so far
    2. Calculate profit at each step
    3. Keep maximum profit
Time Complexity: O(n)
Space Complexity: O(1)
Author: Divyansh Sharma
*/

import java.util.Scanner;

public class Best_Time_To_Buy_And_Sell_Stock {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input.");
            sc.close();
            return;
        }

        int[] prices = new int[n];

        System.out.println("Enter stock prices:");

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int minBuy = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] > minBuy) {
                maxProfit = Math.max(maxProfit, prices[i] - minBuy);
            }     
            minBuy = Math.min(minBuy, prices[i]);
        }

        System.out.println("Maximum Profit: " + maxProfit);

        sc.close();
    }
}
