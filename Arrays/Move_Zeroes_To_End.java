/*
Problem: Move All Zeroes To End of Array
Platform: Self Practice
Approach:
    1. Traverse array and shift all non-zero elements to front
    2. Fill remaining positions with zero
Time Complexity: O(n)
Space Complexity: O(1)
Author: Divyansh Sharma
*/
import java.util.Scanner;
public class zerolast {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
       int position = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] != 0){
                arr[position] = arr[i];
                position++;
            }
        }
        for(int i = position; i < n; i++){
            arr[i] = 0;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }      
        sc.close();
    } 
}
