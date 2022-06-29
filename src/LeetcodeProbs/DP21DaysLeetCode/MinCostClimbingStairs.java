package LeetcodeProbs.DP21DaysLeetCode;

import java.util.Scanner;

public class MinCostClimbingStairs {
    public static void main(String[] args) {

        Solution sol = new Solution();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total no. of stairs : ");
        int n= sc.nextInt();

        int[] cost = new int[n];
        System.out.print("Enter cost of each stairs : ");
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }
        System.out.println("Cost to react top is : " + sol.minCostClimbingStairs(cost));

    }
}
class Solution{
    public int minCostClimbingStairs(int cost[]){
        int n = cost.length;
        int[] dp = new int[n];

        dp[0] = cost[0];
        dp[1] = cost[1];

        if (n==0){
            return 0;
        }
        for (int i=2; i<n; i++){
            dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[n-2],dp[n-1] );
    }
}