/*
Problem: Find Second Largest Element in Array
Platform: Self Practice
Approach:
    1. Traverse array and maintain two variables (max and secondMax)
    2. Update values when a larger element is found
Time Complexity: O(n)
Space Complexity: O(1)
Author: Divyansh Sharma
*/
import java.util.Scanner;

public class Second_Largest_Element {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int secondmax =arr[0];
        for(int i =0;i<n;i++){
            if(arr[i]>max){
               secondmax=max;
               max=arr[i];
               
            }
        }
        System.out.println("Second max"+secondmax);
        sc.close();
    }
}
