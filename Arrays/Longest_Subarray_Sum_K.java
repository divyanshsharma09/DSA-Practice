/*
Problem: Longest Subarray With Sum ≤ K
Approach:
    Expand window by adding elements
    Shrink window if sum becomes greater than K
Time Complexity: O(n)
Space Complexity: O(1)
Author: Divyansh Sharma
*/

import java.util.Scanner;
public class longest_Subarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int window_sum = 0;
        int maxlength = 0;
        int left = 0;

        for(int right = 0 ;right<n;right++){
            window_sum += arr[right];
            while(window_sum>k){
                window_sum -= arr[left];
                left++;
            }
            maxlength = Math.max(maxlength,right-left+1);

        }
        System.out.println("Max length on sum is :"+maxlength);
        sc.close();
    }
}
