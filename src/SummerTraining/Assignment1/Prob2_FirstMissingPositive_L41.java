package SummerTraining.Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Prob2_FirstMissingPositive_L41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution2 sol2 = new Solution2();

        System.out.print("Enter size of array : ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array : ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sol2.firstMissingPositive(arr));
    }
}
class Solution2 {
    public int firstMissingPositive(int[] nums) {
        int val = 1;
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            if(nums[i]<=0){
                continue;
            }
            else{
                if(nums[i]==val){
                    val++;
                }
            }
        }
        return val;
    }
}
