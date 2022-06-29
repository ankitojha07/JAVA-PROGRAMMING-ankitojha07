package DataStructures.ArrayDs.OneDArray;

import java.util.Scanner;

public class RunningSum1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int i = 0;
        int[] arr = new int[n];
        System.out.print("Enter Elements of array : ");
        while (i < n) {
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.print("After performing running sum of 1D Array : ");
        sol.runningSumLogic(arr);
//        for (int j=0; j<n; j++){
//            System.out.print(arr[j]);
//        }
    }
}
class Solution{
    static void runningSumLogic(int[] arr){
        int n=arr.length,a=0,i=0;
        int[] newArr = new int[n];
        while (i<n){
            a+=arr[i];
            newArr[i] = a;
            i++;
        }
        i = 0;
        while (i<n){
            System.out.print(newArr[i]+" ");
            i++;
        }
    }
}
