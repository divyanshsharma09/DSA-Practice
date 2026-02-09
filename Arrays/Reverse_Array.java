/*
Problem: Reverse an Array
Platform: Self Practice
Approach:
    1. Swap elements from start and end moving toward center
    2. Stop when start reaches middle of array
Time Complexity: O(n)
Space Complexity: O(1)
Author: Divyansh Sharma
*/
import java.util.Scanner;
public class reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        int mid = n/2;
        for(int i = 0; i<mid; i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        System.out.println("Reversed array:");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
