package SummerTraining.Assignment1;

import java.util.Scanner;

public class Prob5_RotateArray_L189 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution5 sol5 = new Solution5();

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter array elements : ");
        for (int i=0;i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of k : ");
        int k = sc.nextInt();

        sol5.rotate(arr,k);
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

    }
}

class Solution5{
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        if (k<0){
            k+=nums.length;
        }
        reverseUsingArray(nums,0,nums.length-1-k); // 1st half rotate
        reverseUsingArray(nums,nums.length-k,nums.length-1); // 1st half rotate
        reverseUsingArray(nums,0,nums.length-1); // 1st half rotate

    }

    // Reverse Array
    void reverseUsingArray(int[] arr, int i, int j){
        // reverse from index i to j
        int s =i;
        int e = j;
        int temp = 0;
        while (s<e){
            temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}