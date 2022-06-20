package SummerTraining.Assignment1;

import java.util.Scanner;
import java.util.Arrays;

public class Prob1MaxGap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter size of array : ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array : ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(sol.maximumGap(arr));
    }
}
class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2)
        {
            return 0;
        }

        Arrays.sort(nums);

        int res=0;

        for(int i=1;i<nums.length;i++)
        {
            res=Math.min(res,nums[i-1]-nums[i]);
        }
        res=Math.abs(res);
        return res;
    }
}
