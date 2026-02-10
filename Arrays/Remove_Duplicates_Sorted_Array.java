/*
Problem: Remove Duplicates from Sorted Array
Platform: Self Practice
Approach:
    1. Use two pointers
    2. Keep unique elements in front
    3. Return new length of unique elements
Time Complexity: O(n)
Space Complexity: O(1)
Author: Divyansh Sharma
*/

import java.util.Scanner;
public class Remove_Duplicates_Sorted_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int count =0;
        for(int i =0; i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[count++] =arr[i];
            }
        }
        int length = arr.length;
        arr[count++] = arr[length-1];
        for(int i=0; i<count;i++){
            System.out.println(arr[i] +"");
        }
        sc.close();
    }
}

