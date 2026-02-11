/*
Problem: Maximum Sum of Subarray of Size K
Platform: Self Practice
Approach:
    1. Calculate sum of first window of size k
    2. Slide window by removing first element and adding next element
    3. Track maximum sum
Time Complexity: O(n)
Space Complexity: O(1)
Author: Divyansh Sharma
*/
import java.util.Scanner;
public class k_sum {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max_sum = 0;
        int window_sum = 0;
        int k = 3;

        for(int i=0; i<k; i++){
            window_sum +=arr[i];
        }

        max_sum = window_sum;
        for(int i = k; i<arr.length;i++){
            window_sum = window_sum - arr[i-k]+ arr[i];
            if(max_sum<window_sum){
                max_sum=window_sum;
            }
        }
        System.out.println("Max sum is :" +max_sum);
        sc.close();
    }
}

