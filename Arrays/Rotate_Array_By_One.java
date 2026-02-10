/*
Problem: Rotate Array by One Position (Right Rotation)
Platform: Self Practice
Approach:
    1. Store last element
    2. Shift all elements one step right
    3. Place last element at index 0
Time Complexity: O(n)
Space Complexity: O(1)
Author: Divyansh Sharma
*/
import java.util.Scanner;
public class Rotate_Array_By_One {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int length = arr.length;
        int last = arr[length-1];
        for(int i = length-1; i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0]= last;
        System.out.println("Array reversed");
        for(int i =0;i<n;i++){
            System.out.println(arr[i]+"");
        }
    }
}
